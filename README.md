# FinCore
Production-oriented personal-finance REST API based on the feature set of PersonalFinance.

## Stack
Java 21, Spring Boot 3.5, Spring Security/JWT, PostgreSQL, Flyway, JPA, Bean Validation, OpenAPI, Docker.

## Run in Eclipse
1. Start PostgreSQL: `docker compose up -d`
2. Import as Existing Maven Project (or Maven > Update Project).
3. Run `FincoreApplication` as Spring Boot App.
4. Open Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Main endpoints
- `POST /api/v1/auth/register`
- `POST /api/v1/auth/login`
- `GET /api/v1/users/me`
- `POST/GET /api/v1/accounts`
- `GET /api/v1/accounts/{id}`
- `POST /api/v1/accounts/transfer`
- `POST/GET /api/v1/transactions`
- `GET /api/v1/transactions/{id}`
- `POST/GET /api/v1/budgets`
- `PUT/DELETE /api/v1/budgets/{id}`
- `GET /api/v1/admin/users` (ADMIN)

Protected endpoints use `Authorization: Bearer <token>`.

## Production notes
Set DB credentials and a strong JWT secret through environment variables. Flyway owns schema changes; Hibernate uses `ddl-auto: validate`. Money uses `BigDecimal`; account mutations are transactional and transfers lock accounts in deterministic order.
