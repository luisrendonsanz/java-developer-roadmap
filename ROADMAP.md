# Roadmap Java Backend Jr — 24 semanas

Este plan está diseñado para priorizar el 20% de conocimientos que permite comprender y practicar el 80% del trabajo cotidiano de un backend Java Jr.

## Ajuste de ruta — Spring Boot en paralelo

Después del checkpoint de fundamentos + POO esencial, **no es obligatorio esperar hasta terminar todas las semanas de Java Core para comenzar Spring Boot**.

La ruta se trabaja desde ahora en dos carriles:

### Carril A — Backend con Spring Boot
1. Primera API REST en memoria
2. `@RestController`, rutas y parámetros
3. separación `Controller → Service`
4. inyección de dependencias
5. CRUD en memoria con `List`
6. DTOs, validación y manejo de errores
7. persistencia con JPA/Hibernate
8. PostgreSQL
9. testing
10. evolución de OrderFlow

### Carril B — Java que se refuerza mientras construyes
- herencia y polimorfismo
- interfaces y clases abstractas
- `equals`, `hashCode`, `toString`
- `List`, `Set`, `Map`
- excepciones
- lambdas, Streams y `Optional`

**Regla:** si Spring Boot utiliza un concepto de Java que todavía no está sólido, se hace un ejercicio corto de Java y luego se vuelve inmediatamente al backend.

El material práctico de este carril comienza en [`spring-boot-track/README.md`](spring-boot-track/README.md).

---

## Fase 1 — Java Core y POO (Semanas 1–6)

### Semana 1 — Fundamentos de Java
- JDK, JVM y compilación
- Variables y tipos de datos
- Operadores
- Condicionales
- Bucles
- Métodos
- Arrays
- Debugger del IDE
- 20–30 ejercicios pequeños

**Entrega:** aplicación de consola con menú y varias operaciones.

### Semana 2 — POO esencial
- Clases y objetos
- Encapsulamiento
- Constructores
- `this`
- Métodos de instancia y estáticos
- Composición

**Entrega:** sistema de biblioteca en consola.

### Semana 3 — POO aplicada
- Herencia
- Polimorfismo
- Interfaces
- Clases abstractas
- `equals`, `hashCode`, `toString`
- Principios SOLID a nivel introductorio

**Entrega:** sistema de pagos extensible.

### Semana 4 — Colecciones y genéricos
- List
- Set
- Map
- Iteración
- Comparator / Comparable
- Genéricos

**Entrega:** gestor de productos y clientes.

### Semana 5 — Excepciones, archivos y fechas
- Excepciones checked / unchecked
- Excepciones personalizadas
- `try/catch/finally`
- Files / Paths
- LocalDate / LocalDateTime

**Entrega:** importador y exportador de datos en archivos.

### Semana 6 — Lambdas y Streams
- Functional interfaces
- Lambdas
- Stream API
- map / filter / reduce
- Optional

**Entrega:** módulo de reportes sobre una colección de ventas.

> Estas semanas siguen siendo importantes, pero desde el checkpoint de POO esencial pueden completarse en paralelo con el Spring Boot Track.

---

## Fase 2 — SQL, Git y fundamentos backend (Semanas 7–9)

### Semana 7 — SQL
- Modelo relacional
- SELECT
- INSERT / UPDATE / DELETE
- WHERE
- JOIN
- GROUP BY
- Índices
- PK / FK
- Normalización básica

**Entrega:** base PostgreSQL para OrderFlow.

### Semana 8 — Git y GitHub profesional
- commits pequeños
- branches
- merge
- pull requests
- conflictos
- `.gitignore`
- README técnico

**Entrega:** trabajar una feature mediante branch + PR.

### Semana 9 — HTTP y REST
- HTTP
- request / response
- métodos HTTP
- códigos de estado
- JSON
- REST
- idempotencia
- Postman / Bruno

**Entrega:** diseño de los endpoints de OrderFlow antes de Spring Boot.

> HTTP/REST se aprenderá también de forma práctica desde la primera API de Spring Boot; esta semana sirve para consolidar la teoría y el diseño.

---

## Fase 3 — Spring Boot (Semanas 10–15)

Esta fase representa la profundización formal. El primer contacto con Spring Boot puede comenzar antes mediante `spring-boot-track/`.

### Semana 10 — Spring Boot esencial
- Spring Initializr
- IoC / DI
- Beans
- Controller
- Service
- Repository
- configuración

### Semana 11 — APIs REST
- `@RestController`
- DTOs
- request validation
- ResponseEntity
- manejo global de errores

### Semana 12 — JPA / Hibernate
- entidades
- relaciones
- repositories
- consultas
- paginación
- transacciones

### Semana 13 — Arquitectura limpia para Jr
- Controller → Service → Repository
- DTO / Mapper
- separación de responsabilidades
- paquetes por feature o capa

### Semana 14 — Validación y manejo de errores
- Bean Validation
- excepciones de dominio
- `@ControllerAdvice`
- respuestas de error consistentes

### Semana 15 — Seguridad básica
- Spring Security
- autenticación vs autorización
- password hashing
- JWT a nivel práctico
- roles

**Entrega de fase:** OrderFlow API funcional con PostgreSQL y autenticación.

---

## Fase 4 — Testing y calidad (Semanas 16–18)

### Semana 16 — JUnit
- unit tests
- assertions
- Arrange / Act / Assert
- casos felices y casos límite

### Semana 17 — Mockito
- mocks
- stubs
- verify
- testing de services

### Semana 18 — Integración
- `@SpringBootTest`
- tests de controller
- tests de repository
- Testcontainers como objetivo adicional

**Entrega:** suite de pruebas del proyecto principal.

---

## Fase 5 — Docker, CI/CD y producción básica (Semanas 19–21)

### Semana 19 — Docker
- imagen
- contenedor
- Dockerfile
- variables de entorno
- docker compose

### Semana 20 — CI/CD
- GitHub Actions
- build
- ejecutar tests
- pipeline por Pull Request

### Semana 21 — Observabilidad y configuración
- profiles
- logging
- health checks
- Spring Boot Actuator
- configuración segura

**Entrega:** proyecto levantable con Docker y pipeline automático.

---

## Fase 6 — Portafolio y entrevistas (Semanas 22–24)

### Semana 22 — Pulir OrderFlow
- refactor
- documentación
- OpenAPI / Swagger
- datos demo
- README profesional

### Semana 23 — Entrevistas técnicas
- Java Core
- POO
- Collections
- SQL
- HTTP
- Spring Boot
- Git
- ejercicios de código

### Semana 24 — Postulación
- GitHub limpio
- CV orientado a backend Java
- LinkedIn
- proyecto destacado
- simulación de entrevista
- comenzar aplicaciones

---

# Rutina recomendada

Cada sesión de estudio debe repartir el tiempo aproximadamente así:

1. **Teoría:** entender el concepto necesario para la tarea del día.
2. **Ejercicios:** resolver un problema corto sin tutorial paso a paso.
3. **Proyecto:** aplicar lo aprendido a una aplicación real.
4. **Repaso:** explicar con tus propias palabras qué hiciste.
5. **Git:** subir el progreso en commits claros.

Durante el Spring Boot Track, prioriza aproximadamente **70% construcción backend / 30% refuerzo Java**.

# Criterio para avanzar

Avanza cuando puedas:

- explicar el tema sin depender de definiciones memorizadas;
- escribir un ejemplo desde cero;
- detectar errores básicos;
- usarlo dentro de un pequeño proyecto;
- leer código ajeno que lo utilice.

No busques dominar cada detalle antes de continuar. La profundidad vendrá al reutilizar los conceptos durante las APIs y OrderFlow.
