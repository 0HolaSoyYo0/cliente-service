# Clientes Service 👥

## Descripción
Este microservicio es responsable de la gestión y persistencia de la información de los clientes. Forma parte de un ecosistema de microservicios y actúa como el servidor de recursos para los datos de identidad de los usuarios.

## Tecnologías y Dependencias
* **Java 25**
* **Spring Boot 4.0.6**
* **Spring Data JPA:** Para la persistencia de datos en base de datos relacional.
* **MySQL Driver:** Conector para la base de datos MySQL.
* **Lombok:** Para reducir el código repetitivo (Boilerplate) mediante anotaciones.
* **Validation:** Para asegurar la integridad de los datos de entrada en los modelos.
* **Spring Web:** Para la exposición de servicios REST.

## Arquitectura de Software
El proyecto implementa una arquitectura de capas estricta:
* `model`: Definición de entidades JPA.
* `repository`: Interfaces que extienden de `JpaRepository`.
* `service`: Lógica de negocio (Interfaces e Implementaciones).
* `controller`: Exposición de endpoints REST.

## Endpoints (CRUD)
| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| GET | `/api/clientes` | Listar todos los clientes. |
| GET | `/api/clientes/{id}` | Buscar un cliente por su ID. |
| POST | `/api/clientes` | Crear un nuevo cliente. |
| PUT | `/api/clientes/{id}` | Actualizar un cliente existente. |
| DELETE | `/api/clientes/{id}` | Eliminar un cliente por ID. |

## Tareas Pendientes 🛠️
- [ ] Implementar lógica completa de `Update` y `Delete` en la capa de Servicio.
- [ ] Refactorizar el método de listado para soportar proyecciones DTO.

## Configuración de Ejecución
Asegúrate de tener configurado el archivo `application.properties` con las credenciales de tu base de datos MySQL local:
```bash
./mvnw spring-boot:run
