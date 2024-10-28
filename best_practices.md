# Detalle de las mejores practicas

## Sumario
- Total de buenas practicas implementadas: 4
- Criticas: 0
- Altas: 1
- Medias: 3
- Bajas: 1

# Practicas detalladas

### 1. Actualización de la Versión Mínima de Android.
-**Descripcion:** Aumentar el valor de minSdkVersion a 29 para garantizar que usuarios esten en versiones mas seguras de android.
-**Severidad:** Media
-**Impacto:** Disminuye la posibilidad de vulnerabilidad en la app.

### 2. Deshabilitar la Depuración.
-**Descripcion:** Establecer el valor de depuracion a false para asegurarnos de que la aplicacion no se pueda depurar en produccion.
-**Severidad:** Alta
-**Impacto:** Evitara que ingenieros inversos puedan depurar la app y acceder a informacion sensible del software.

### 3. Deshabilitar Copia de Datos.
-**Descripcion:** Desabilitar el backup de datos para que los datos del usuario no puedan ser copiados.
-**Severidad:** Media
-**Impacto:** Incrementa la seguridad y privacidad del usuario.

### 4. Revisión de Broadcast Receivers.
-**Descripcion:** Cambiar su opcion a false para evitar que otras apps interactuen con esta misma.
-**Severidad:** Media
-**Impacto:** Evita que posibles softwares maliciosos interactuen con los datos entregados y recibidos por la app.

### 5. Asegurar la Comunicación de Red utilizando HTTPS.
-**Descripcion:** Aseguramos la red cambiando las urls de http a https.
-**Severidad:** Baja
-**Impacto:** Asegura que haya una comunicacion estable y prescisa en la red.