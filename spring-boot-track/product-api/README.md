# 01 — Product API en memoria

## Objetivo

Construir tu primera API REST con Spring Boot sin base de datos. La meta es entender el recorrido de una petición HTTP y conectar lo que ya sabes de Java con un backend real.

## Regla importante

No copies un CRUD completo de un tutorial. Resuelve cada bloque por separado y prueba antes de avanzar.

## Paso 1 — Crear y ejecutar el proyecto

Genera el proyecto desde Spring Initializr con:

- Maven
- Java 21
- Spring Boot estable 4.1.x
- Group: `com.luisrendon`
- Artifact: `product-api`
- Dependency: Spring Web

### Definition of Done
- [ ] El proyecto abre en IntelliJ
- [ ] Maven descarga dependencias correctamente
- [ ] La aplicación inicia sin errores
- [ ] Puedes identificar la clase con `@SpringBootApplication`
- [ ] Puedes explicar qué hace `SpringApplication.run(...)` a nivel general

## Ejercicio 1 — Hello endpoint

Crea un endpoint:

```http
GET /api/hello
```

Debe responder texto simple, por ejemplo:

```text
Spring Boot funcionando
```

### Restricción
Hazlo con un `@RestController`. No agregues Service todavía.

### Preguntas que debes poder responder
- [ ] ¿Qué hace `@RestController`?
- [ ] ¿Qué hace `@GetMapping`?
- [ ] ¿Por qué ya no necesitas `Scanner` para recibir una petición?
- [ ] ¿Quién llama al método del controller?

## Ejercicio 2 — Primer JSON

Crea una clase `Producto` con:

- `Long id`
- `String nombre`
- `double precio`
- `int stock`

Crea:

```http
GET /api/productos/demo
```

Debe devolver un objeto `Producto` y Spring debe convertirlo a JSON.

### Debes observar
- [ ] Devuelves un objeto Java, no un JSON escrito a mano
- [ ] El navegador/cliente recibe JSON
- [ ] Puedes explicar de forma general que Spring/Jackson serializa el objeto

## Ejercicio 3 — Lista de productos

Mantén temporalmente una:

```java
List<Producto>
```

en memoria con al menos 5 productos.

Implementa:

```http
GET /api/productos
```

Debe devolver todos los productos.

### Restricciones
- usa `List<Producto>`;
- no uses base de datos;
- no uses Streams todavía si un `for` te resulta más claro.

## Ejercicio 4 — Buscar por id

Implementa:

```http
GET /api/productos/{id}
```

Ejemplos:

```text
/api/productos/1
/api/productos/4
```

Busca el producto dentro de la lista.

### Primera versión permitida
Puedes devolver `Producto` o `null`. Después lo mejoraremos con `Optional` y `ResponseEntity`.

### Preguntas
- [ ] ¿Qué valor recibe el método cuando visitas `/api/productos/4`?
- [ ] ¿Para qué sirve `@PathVariable`?
- [ ] ¿Qué debería ocurrir profesionalmente si no existe el producto?

## Ejercicio 5 — Filtrar por precio

Implementa:

```http
GET /api/productos/precio?min=100
```

Debe devolver solamente productos cuyo precio sea mayor o igual al valor recibido.

Practicarás:
- `@RequestParam`
- `List`
- bucles/condiciones
- objetos

## Ejercicio 6 — Crear producto

Implementa:

```http
POST /api/productos
```

Debe recibir JSON como:

```json
{
  "nombre": "Monitor",
  "precio": 4500,
  "stock": 8
}
```

y agregar un nuevo producto a la lista.

### Restricciones iniciales
- no uses base de datos;
- genera el id dentro de la aplicación;
- valida al menos precio y stock no negativos;
- usa `@RequestBody`.

## Ejercicio 7 — Detectar el problema de diseño

Cuando los endpoints anteriores funcionen, responde en el PR:

1. ¿Qué responsabilidades tiene ahora el controller?
2. ¿Está haciendo demasiadas cosas?
3. ¿Qué lógica podría vivir en una clase `ProductoService`?
4. ¿Por qué sería útil separar HTTP de la lógica de productos?

**Todavía no refactorices hasta poder explicar el problema.** La siguiente etapa será precisamente Controller → Service.

## Reto opcional

Agrega:

```http
GET /api/productos/stock
```

que devuelva solo productos con `stock > 0`.

Después intenta una segunda versión con Stream API y compara cuál entiendes mejor.

## Commits sugeridos

No es obligatorio usar exactamente estos mensajes, pero sí separar el trabajo:

```text
feat: create first Spring Boot endpoint
feat: add product model and demo endpoint
feat: list products from memory
feat: find product by id
feat: filter products by minimum price
feat: create products from request body
```

## Definition of Done

- [ ] Proyecto Spring Boot ejecutándose
- [ ] `GET /api/hello`
- [ ] `GET /api/productos/demo`
- [ ] `GET /api/productos`
- [ ] `GET /api/productos/{id}`
- [ ] `GET /api/productos/precio?min=...`
- [ ] `POST /api/productos`
- [ ] Entiendes `@RestController`
- [ ] Entiendes `@GetMapping` / `@PostMapping`
- [ ] Entiendes `@PathVariable`
- [ ] Entiendes `@RequestParam`
- [ ] Entiendes `@RequestBody`
- [ ] Puedes explicar cómo un objeto Java termina enviado como JSON
- [ ] Hiciste varios commits pequeños
- [ ] Abriste PR sin hacer merge hasta revisar el código

## Lo siguiente

Cuando termines esta entrega, el siguiente refactor será:

```text
ProductoController
        ↓
ProductoService
        ↓
List<Producto>
```

Ahí aprenderás inyección de dependencias usando un problema que ya conoces, en lugar de memorizar IoC/DI de forma aislada.
