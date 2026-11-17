# Java Backend Developer · Aprendizaje y proyectos

Repositorio de práctica para desarrollar habilidades de **Java Backend Junior** con Java 21, Spring Boot, APIs REST y persistencia.

> Este repositorio documenta una formación en curso. Las tecnologías del plan de estudio no significan que todas estén implementadas o dominadas.

## Proyecto con código: Product API

**[Explorar Product API](spring-boot-track/product-api/)** · [Guía técnica](spring-boot-track/product-api/README.md)

API REST de productos construida con **Java 21, Spring Boot 4.1.1, Spring Data JPA y PostgreSQL**.

En el código actual se pueden revisar:
- Endpoints HTTP para listar, buscar, filtrar, crear, actualizar y eliminar productos.
- Separación entre **Controller, Service y Repository**.
- Entidad JPA, DTOs, validaciones de solicitudes y manejo de errores 404.
- Configuración local de PostgreSQL mediante Docker Compose.

**Estado:** implementación presente en el repositorio, pero aún faltan pruebas automatizadas completas y una verificación de ejecución reproducible. Es un proyecto de aprendizaje, no una aplicación presentada como lista para producción.

## Organización

| Carpeta o documento | Contenido |
|---|---|
| [Product API](spring-boot-track/product-api/) | Aplicación Spring Boot y código fuente |
| [Spring Boot Track](spring-boot-track/README.md) | Etapas y objetivos del aprendizaje backend |
| [Fundamentos Java](fase-1/) | Prácticas de Java Core y POO |
| [Roadmap de 24 semanas](ROADMAP.md) | Ruta de aprendizaje |
| [OrderFlow](projects/ORDERFLOW.md) | Diseño del proyecto de pedidos **planificado**, aún no presentado como implementación terminada |

También mantengo un [roadmap de ejercicios Spring Boot](https://github.com/luisrendonsanz/springboot-junior-roadmap), centrado en los enunciados y criterios de aceptación.

## Conocimientos practicados

**Con evidencia en Product API:** Java 21, Spring MVC, HTTP/REST, inyección de dependencias, DTOs, Bean Validation, JPA y PostgreSQL.

**En el plan de aprendizaje:** JUnit/Mockito, Docker y CI/CD, seguridad y OpenAPI. Su mención aquí no implica que estén concluidos.

## Próximos pasos

- [ ] Hacer reproducible la ejecución desde un clon limpio.
- [ ] Añadir pruebas de servicio, controlador e integración.
- [ ] Mejorar el manejo de respuestas de error y casos límite.
- [ ] Documentar ejemplos de peticiones y respuestas probados.
- [ ] Publicar un proyecto backend final con pruebas y guía de ejecución.

Mi objetivo es **aprender construyendo, explicar las decisiones técnicas y mostrar evidencia verificable en GitHub**.
