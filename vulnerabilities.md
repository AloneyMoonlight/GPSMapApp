# Reporte de vulnerabilidades

## Sumario
- Total de vulnerabilidades encontradas: 6
- Criticas: 0
- Altas: 4
- Medias: 2
- Bajas: 0


# Encuentros detallados

### 1. Aplicacion firmada con certificado de debug.
-**Descripcion:** Aplicación firmada con un certificado de depuración. La aplicación de producida no debe enviarse con un certificado de depuración.
-**Severidad:** Alta
-**Impacto:** Posible impacto en la vulnerabilidad.
-**Pasos para replicar:** No se puede replicar
-**Remediacion:** Quitar/reemplazar el certificado de depuración.

### 2. Depuracion habilitada por la aplicación.
-**Descripcion:** Se habilitó la depuración en la aplicación, lo que facilita que los ingenieros inversos conecten un depurador a ella. Esto permite volcar un seguimiento de la pila y acceder a las clases auxiliares de depuración.
-**Severidad:** Alta
-**Impacto:** Posible impacto en la vulnerabilidad.
-**Pasos para replicar:** No se puede replicar.
-**Remediacion:** Establecer la depuracion como false, o requerir de permisos superiores.

### 3. La aplicacion puede ser instalada en versiones vulnerables de android.
-**Descripcion:** Esta aplicación se puede instalar en una versión anterior de Android que tenga múltiples vulnerabilidades. Admite una versión de Android => 10, API 29 para recibir actualizaciones de seguridad razonables.
-**Severidad:** Media
-**Impacto:** Incremento en el riesgo de vulnerabilidades.
-**Pasos para replicar:** Instalar la aplicacion en dispositivos con versiones de android desactualizadas con problemas en la seguridad.
-**Remediacion:** Limitar la instalacion de la app a versiones sin problemas de seguridad que afecten el funcionamiento de esta misma.

### 4. Los datos de la aplicacion pueden ser respaldados.
-**Descripcion:** Esta bandera permite que cualquier persona haga una copia de seguridad de los datos de su aplicación a través de adb. Permite que los usuarios que hayan habilitado la depuración USB copien los datos de la aplicación fuera del dispositivo.
-**Severidad:** Media
-**Impacto:** Siertos datos que sean vulnerables del usuario pueden ser copiados y respaldados.
-**Pasos para replicar:** Copiar los datos de la app a través de un dispositivo USB u otros medios.
-**Remediacion:** Desabilitar la opcion de backup, estableciendola como false, o pidiendo cierto nivel de seguridad para estos mismos

### 5. Receptor de transmision.
-**Descripcion:** Se ha descubierto que un receptor de transmisión se comparte con otras aplicaciones del dispositivo, por lo que queda accesible para cualquier otra aplicación del dispositivo. Está protegido por un permiso que no está definido en la aplicación analizada. Como resultado, se debe comprobar el nivel de protección del permiso en el lugar donde esté definido. Si se configura como normal o peligroso, una aplicación maliciosa puede solicitar y obtener el permiso e interactuar con el componente. Si se configura como de firma, solo las aplicaciones firmadas con el mismo certificado pueden obtener el permiso.
-**Severidad:** Media
-**Impacto:** Aplicaciones maliciosas pueden solicitar y obtener la transmision del dispositivo.
-**Pasos para replicar:** Solicitar el permiso para acceder a la transmision directamente a la app.
-**Remediacion:** Configurar un sistema de firma, que permita a solo aplicaciones firmadas con el mismo certificado acceder a la transmision.

### 6,1. Permisos "criticos=android.permission.ACCESS_FINE_LOCATION".
-**Descripcion:** accede a fuentes de ubicación precisas, como el Sistema de posicionamiento global del teléfono, cuando esté disponible. Las aplicaciones maliciosas pueden usar esto para determinar dónde se encuentra y pueden consumir energía adicional de la batería.
-**Severidad:** Critica
-**Impacto:** Rendimiento, seguridad y privacidad.
-**Pasos para replicar:** Otorgar permiso a la app da la posibilidad de que fuentes maliciosas roben esta vital informacion, consumiendo bateria en el proceso.
-**Remediacion:** Configurar la app para que solo pida la ubicacion mientras este enfuncionamiento e implementar un sistema de certificados.

### 6,2. Permisos "criticos=android.permission.ACCESS_COARSE_LOCATION".
-**Descripcion:** accede a fuentes de ubicación aproximadas, como la base de datos de la red móvil, para determinar una ubicación aproximada del teléfono, cuando esté disponible. Las aplicaciones maliciosas pueden usar esto para determinar aproximadamente dónde se encuentra.
-**Severidad:** Critica
-**Impacto:** Seguridad y privacidad.
-**Pasos para replicar:** Otorgar permiso a la app da la posibilidad de que fuentes maliciosas roben esta vital informacion.
-**Remediacion:** Configurar la app para que solo pida la ubicacion mientras este enfuncionamiento e implementar un sistema de certificados.

### 6,3. Permisos "criticos=android.permission.ACCESS_BACKGROUND_LOCATION".
-**Descripcion:** Permite que una aplicación acceda a la ubicación en segundo plano.
-**Severidad:** Critica
-**Impacto:** Rendimiento, seguridad y privacidad.
-**Pasos para replicar:** Otorgar permiso a la app da la posibilidad de que fuentes maliciosas roben esta vital informacion mientras incluso el telefono no este en uso, consumiendo bateria en el proceso.
-**Remediacion:** Configurar la app para que solo pida la ubicacion mientras este enfuncionamiento e implementar un sistema de certificados.

