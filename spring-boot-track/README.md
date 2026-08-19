# Spring Boot Track — aprender construyendo

Este track empieza cuando ya puedes trabajar con clases, objetos, encapsulamiento, constructores y lógica Java básica. No exige dominar todo Java Core antes de comenzar.

## Objetivo

Pasar de programas de consola a APIs backend reales mientras se refuerzan los conceptos de Java que Spring Boot vaya necesitando.

## Stack inicial

- Java 21
- Spring Boot 4.1.x
- Maven
- Spring Web
- IntelliJ IDEA
- Postman, Bruno o el cliente HTTP de IntelliJ
- Git + GitHub

Al principio **no agregues base de datos, Lombok, Security ni JPA**. Primero debes entender el flujo HTTP y las responsabilidades de Controller y Service.

## Configuración del primer proyecto en Spring Initializr

- Project: Maven
- Language: Java
- Spring Boot: versión estable 4.1.x
- Group: `com.luisrendon`
- Artifact: `product-api`
- Name: `product-api`
- Packaging: Jar
- Java: 21
- Dependency inicial: `Spring Web`

## Ruta práctica

### Etapa 0 — Primera API en memoria
Construir `product-api` sin base de datos.

Aprenderás:
- estructura de un proyecto Spring Boot
- `@SpringBootApplication`
- servidor embebido
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PathVariable`
- `@RequestParam`
- `@RequestBody`
- JSON
- códigos HTTP básicos

Material: [`01-product-api/README.md`](01-product-api/README.md)

### Etapa 1 — Service e inyección de dependencias
Mover la lógica fuera del controller.

Aprenderás:
- `@Service`
- constructor injection
- IoC / DI a nivel práctico
- separación de responsabilidades
- interfaces cuando aporten valor

### Etapa 2 — CRUD y errores
Completar Create, Read, Update y Delete en memoria.

Aprenderás:
- búsqueda por id
- `Optional`
- excepciones de dominio
- `ResponseEntity`
- respuestas `200`, `201`, `204`, `400`, `404`

### Etapa 3 — DTOs y validación
Separar lo que entra/sale de la API de los objetos internos.

Aprenderás:
- DTOs
- Bean Validation
- `@Valid`
- manejo global de errores
- `@ControllerAdvice`

### Etapa 4 — Persistencia
Reemplazar la lista en memoria por una base de datos.

Aprenderás:
- JPA / Hibernate
- `@Entity`
- `JpaRepository`
- H2 para practicar
- PostgreSQL para el proyecto real

## Regla de trabajo

Cada ejercicio debe seguir este flujo:

1. crear una rama desde `main`;
2. implementar una tarea pequeña;
3. probarla manualmente;
4. hacer un commit descriptivo;
5. continuar con la siguiente tarea;
6. abrir PR cuando la issue esté completa;
7. explicar qué hace tu código antes del merge.

## Refuerzo Java paralelo

Si una tarea requiere un concepto que todavía no dominas, haz un ejercicio corto y vuelve a la API:

- interfaces → una interfaz con 2 implementaciones;
- Collections → `List<Producto>` con búsqueda/alta/baja;
- excepciones → lanzar y capturar una excepción propia;
- Streams → filtrar y buscar productos;
- `Optional` → representar búsquedas que pueden no encontrar resultado.

No conviertas el refuerzo de Java en otra barrera para avanzar.
