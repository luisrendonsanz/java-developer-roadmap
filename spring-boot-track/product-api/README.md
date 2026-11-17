# Product API — Java 21, Spring Boot y PostgreSQL

API REST de productos desarrollada como práctica de **Backend Junior**. El código está organizado por capas para separar las peticiones HTTP, la lógica de aplicación y el acceso a datos.

> **Estado:** proyecto de aprendizaje en desarrollo. Se documentan las funciones presentes en el código; su funcionamiento no ha sido validado con una ejecución completa durante esta revisión.

## Stack

- Java 21, Maven y Spring Boot 4.1.1
- Spring Web MVC
- Spring Data JPA + PostgreSQL
- Bean Validation
- Docker Compose (contenedor PostgreSQL)

## Estructura

```text
src/main/java/com/luisrendon/product_api/
├── controllers/   # Endpoints y manejo global de errores
├── services/      # Lógica de aplicación
├── repositories/  # Acceso a datos con JpaRepository
├── models/        # Entidad Producto (JPA)
├── dto/           # DTO de entrada, salida y errores
└── Exception/     # Excepción para recursos inexistentes
```

Flujo principal: **Cliente → Controller → Service → Repository → PostgreSQL**.

## Endpoints presentes en el código

| Método | Ruta | Descripción | Respuesta configurada |
|---|---|---|---|
| GET | `/api/productos` | Listar productos | 200 |
| GET | `/api/productos/{id}` | Buscar por ID | 200 / 404 |
| GET | `/api/productos/precio?precio=100` | Filtrar por precio mínimo | 200 |
| GET | `/api/productos/demo` | Devolver el primer producto | 200 si existe |
| POST | `/api/productos` | Crear producto validado | 201 |
| PUT | `/api/productos/{id}` | Actualizar producto | 200 / 404 |
| DELETE | `/api/productos/{id}` | Eliminar y devolver el producto eliminado | 200 / 404 |

El parámetro real del filtro es **`precio`**, no `min`. El controlador de creación devuelve actualmente el DTO de solicitud; aún no devuelve el ID del recurso creado.

Ejemplo de solicitud de creación:

```http
POST /api/productos
Content-Type: application/json

{
  "nombre": "Monitor",
  "precio": 4500,
  "stock": 8
}
```

## Ejecución local

**Requisitos:** JDK 21, Docker con Compose y un puerto 5432 disponible.

1. Desde esta carpeta, crea un archivo `.env` local (está ignorado por Git) con tus propias credenciales:

   ```dotenv
   POSTGRES_DB=product_api
   POSTGRES_USER=product_api_user
   POSTGRES_PASSWORD=cambia_esta_clave_local
   ```

2. Inicia PostgreSQL:

   ```bash
   docker compose up -d
   ```

3. Copia `src/main/resources/application-example.properties` a `src/main/resources/application-dev.properties` (ignorado por Git). Ajusta la URL a `jdbc:postgresql://localhost:5432/product_api`, el usuario y la contraseña según tu `.env`.

4. Ejecuta la aplicación:

   ```bash
   ./mvnw spring-boot:run
   ```

   En Windows, usa `mvnw.cmd spring-boot:run`.

5. Con la base levantada y la configuración lista, puedes intentar las pruebas existentes:

   ```bash
   ./mvnw test
   ```

**Importante:** esta guía describe la configuración esperada. Aún hay que comprobarla en una instalación limpia y ampliar la suite de pruebas (actualmente solo se incluye un test de carga de contexto).

## Limitaciones y mejoras pendientes

- Se usa `double` para precios; conviene migrar a **BigDecimal** antes de usar el dominio en un contexto financiero.
- El filtrado por precio se hace sobre la lista recuperada, no con una consulta a la base.
- `/api/productos/demo` obtiene el primer elemento y puede fallar si no hay productos.
- Falta comprobar errores de validación y unificar el contrato de respuesta HTTP.
- Las pruebas automatizadas son mínimas; faltan pruebas unitarias, de API e integración.
- No se documenta autenticación ni autorización; no debe desplegarse como servicio público sin revisarlas.

## Objetivo

Demostrar y seguir mejorando fundamentos de APIs REST, diseño por capas y persistencia. Las siguientes mejoras deben acompañarse de pruebas y ejemplos de uso reproducibles.
