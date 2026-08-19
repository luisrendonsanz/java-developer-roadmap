# Java Backend Developer Roadmap — 24 semanas

Este repositorio es mi sistema de entrenamiento para pasar de fundamentos de Java a estar listo para postularme como **Java Backend Developer Jr**.

## Objetivo

Construir habilidades demostrables en:

- Java 21 y Java Core
- Programación Orientada a Objetos
- Colecciones, genéricos, excepciones, streams y lambdas
- SQL y PostgreSQL
- Spring Boot
- APIs REST
- JPA / Hibernate
- Testing con JUnit y Mockito
- Git y GitHub
- Docker
- CI/CD
- Seguridad básica
- Proyecto de portafolio backend

## Cómo usar este repositorio

1. Sigue el plan de [`ROADMAP.md`](ROADMAP.md).
2. Los fundamentos y ejercicios de Java están organizados en `fase-1/`.
3. Desde el checkpoint de POO esencial, Spring Boot se estudia en paralelo mediante [`spring-boot-track/`](spring-boot-track/README.md).
4. Cada bloque debe terminar con código subido a GitHub, no solamente teoría.
5. Los ejercicios pequeños deben convertirse en commits frecuentes.
6. El proyecto principal crecerá durante el roadmap y servirá como pieza de portafolio.

## Regla principal

> Aprender → practicar → construir → explicar → subir a GitHub.

No se considera dominado un tema hasta poder usarlo sin copiar un tutorial completo y explicar las decisiones tomadas.

## Estrategia actual

El roadmap ya no exige terminar todo Java Core antes de tocar Spring Boot. La ruta actual usa dos carriles en paralelo:

- **Carril backend:** Spring Boot, HTTP, REST, Controller, Service, Repository y persistencia.
- **Carril Java:** reforzar POO aplicada, Collections, excepciones, Streams y otros huecos cuando aparezcan en problemas reales.

Esto permite empezar a construir backend real sin abandonar las bases.

## Proyecto principal

Durante el roadmap construiremos **OrderFlow**, una API backend de gestión de pedidos que evolucionará desde Java puro hasta Spring Boot, PostgreSQL, testing, seguridad, Docker y CI/CD.

Consulta [`projects/ORDERFLOW.md`](projects/ORDERFLOW.md).

## Spring Boot — punto de entrada

La primera etapa será una API de productos en memoria. Empieza aquí:

- [`spring-boot-track/README.md`](spring-boot-track/README.md)
- `spring-boot-track/01-product-api/README.md`

## Estado actual

- [x] Repositorio creado
- [x] Roadmap estructurado
- [x] Fundamentos de Java
- [x] POO esencial — checkpoint suficiente para avanzar
- [ ] POO aplicada — reforzar en paralelo
- [ ] Collections — reforzar en paralelo
- [ ] Excepciones — reforzar en paralelo
- [x] Inicio de Spring Boot habilitado
- [ ] Primera API REST en memoria
- [ ] SQL + PostgreSQL
- [ ] JPA / Hibernate
- [ ] Testing
- [ ] Docker + CI/CD
- [ ] OrderFlow terminado
- [ ] Preparación de entrevistas
- [ ] Comenzar postulaciones
