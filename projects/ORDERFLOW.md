# OrderFlow — Proyecto principal de portafolio

OrderFlow será una API backend para gestionar clientes, productos y pedidos. El proyecto evolucionará junto con el roadmap para demostrar aprendizaje real, no un tutorial terminado de una sola vez.

## Etapa 1 — Java puro

Modelar:

- Customer
- Product
- Order
- OrderItem

Practicar:

- POO
- colecciones
- excepciones
- streams
- reglas de negocio

## Etapa 2 — PostgreSQL

Diseñar tablas para:

- customers
- products
- orders
- order_items

Practicar:

- claves primarias y foráneas
- JOINs
- restricciones
- consultas agregadas

## Etapa 3 — Spring Boot REST API

Arquitectura inicial:

```text
controller
service
repository
dto
entity
exception
config
```

Endpoints mínimos:

```text
POST   /customers
GET    /customers/{id}
GET    /customers
POST   /products
GET    /products
GET    /products/{id}
POST   /orders
GET    /orders/{id}
GET    /orders
PATCH  /orders/{id}/status
```

## Reglas de negocio

- no crear pedidos sin productos;
- cantidades mayores que cero;
- productos inexistentes deben producir error controlado;
- calcular subtotal por línea;
- calcular total del pedido;
- manejar estados de pedido;
- impedir transiciones de estado inválidas.

Estados sugeridos:

```text
CREATED
CONFIRMED
SHIPPED
DELIVERED
CANCELLED
```

## Etapa 4 — Persistencia

Usar:

- Spring Data JPA
- Hibernate
- PostgreSQL
- migraciones de base de datos como mejora posterior

## Etapa 5 — Testing

Crear pruebas para:

- cálculo de totales;
- creación de pedidos;
- validaciones;
- cambios de estado;
- service layer;
- endpoints principales;
- integración con PostgreSQL/Testcontainers como objetivo adicional.

## Etapa 6 — Seguridad

Agregar:

- usuarios;
- password hashing;
- autenticación;
- roles;
- endpoints protegidos.

## Etapa 7 — Docker y CI

El repositorio final debe poder ejecutarse con:

```bash
docker compose up
```

GitHub Actions debe ejecutar automáticamente:

1. build;
2. tests;
3. validación en cada Pull Request.

## Qué debe demostrar este proyecto a un reclutador

- Java Core sólido;
- POO aplicada;
- diseño de API REST;
- Spring Boot;
- SQL/PostgreSQL;
- JPA/Hibernate;
- manejo de errores;
- validación;
- testing;
- Git profesional;
- Docker;
- CI/CD básico;
- documentación técnica.

## Definition of Done final

- [ ] README profesional con arquitectura y ejecución
- [ ] API documentada con OpenAPI/Swagger
- [ ] PostgreSQL
- [ ] validaciones
- [ ] manejo global de errores
- [ ] tests unitarios
- [ ] tests de integración principales
- [ ] Dockerfile
- [ ] docker-compose
- [ ] GitHub Actions
- [ ] historial de commits entendible
- [ ] features trabajadas mediante branches/PRs
- [ ] proyecto explicable en una entrevista técnica
