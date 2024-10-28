# Tips de seguridad

## Sumario
- Total de tips de seguridad implementados: 4
- Criticas: 0
- Altas: 1
- Medias: 3
- Bajas: 0

# Practicas detalladas

### 1. Proteger contra ataques de red.
-**Descripcion:** Asegúrate de que todas las solicitudes de red se realicen a través de HTTPS para protegerse contra ataques de intermediarios.
-**Seguridad:** Media
-**Impacto:** Impedimos o monimizamos el ataque de personmas mediante los links utilizados en el software.

### 2. Implementar Autenticación y Autorización Seguras.
-**Descripcion:** Utilizar autenticación utilizando tokens JWT. Esto permite una forma segura de autenticar a los usuarios.
-**Seguridad:** Alta
-**Impacto:** Al utilizar JWT nos aseguramos de que siempre sea un usuario el que este interactuando con el servidor de forma correcta.

### 3. Proteger contra Inyección SQL.
-**Descripcion:** Usar consultas preparadas en lugar de concatenar cadenas para evitar la inyección SQL.
-**Seguridad:** Media
-**Impacto:** Incrementa la seguridad y privacidad del usuario.

### 4. Protección contra Reverse Engineering.
-**Descripcion:**  Utiliza herramientas como ProGuard o R8 para ofuscar el código y dificultar la ingeniería inversa..
-**Seguridad:** Media
-**Impacto:** Ofuscar el codigo nos permite que al inegnieros inversos intentar acceder a la informacionde la app, esta no este totalmente disponibles para ellos.