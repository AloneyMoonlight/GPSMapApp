# GPSMapApp #

# Descripción 
Este proyecto es una aplicación Android que implementa un mapa, utilizando medidas de seguridad superiores y mejorando su version previa. 

## Vulnerabilidades Identificadas 
- Inyección SQL 
- Comunicación no segura 
- Exposición de datos sensibles
- Aplicacion firmada con certificado de debug
- Depuracion habilitada por la aplicación
- La aplicacion puede ser instalada en versiones vulnerables de android
- Los datos de la aplicacion pueden ser respaldados
- Receptor de transmision
- Permisos "Criticos"

## Mejoras Implementadas 
- Cifrado de datos sensibles 
- Comunicación segura (HTTPS) 
- Validación y sanitización de entradas
- Actualización de la Versión Mínima de Android
- Deshabilitar la Depuración
- Deshabilitar Copia de Datos
- Revisión de Broadcast Receivers

## Documentación 
- [Vulnerabilidades](vulnerabilities.md) 
- [Best Practices](best_practices.md) 
- [Security Tips](security_tips.md) 
- [Security Improvement Program](security_improvement_program.md) 

## Cómo Ejecutar la Aplicación de Forma Segura 
1. Clonar el repositorio 
2. Importar el proyecto en Android Studio 
3. Ejecutar la aplicación en un dispositivo o emulador 
4. Asegurarse de que los permisos necesarios están configurados 

## Reporte de Vulnerabilidades El reporte detallado de las pruebas de vulnerabilidad realizadas se encuentra en el archivo `vulnerability_report.pdf`.
