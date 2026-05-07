# Financial System MS

Sistema de finanzas personales basado en arquitectura de microservicios y arquitectura hexagonal (Ports & Adapters), desarrollado como proyecto de aprendizaje enfocado en buenas prácticas backend con Java y Spring Boot.

---

# Objetivo del proyecto

Este proyecto tiene como propósito profundizar conocimientos en:

- Arquitectura de microservicios
- Arquitectura hexagonal
- Clean Architecture
- Clean Code
- Diseño desacoplado y mantenible
- Casos de uso reales backend
- Comunicación entre servicios
- Patrones empresariales

El enfoque principal del proyecto es:

> Comprender la arquitectura antes de construir funcionalidades complejas.

---

# Enfoque de aprendizaje

El desarrollo del sistema se está realizando de manera progresiva:

- Paso a paso
- Entendiendo el propósito de cada capa
- Simulando un entorno empresarial real
- Evitando sobreingeniería temprana
- Priorizando desacoplamiento y mantenibilidad

---

#  Arquitectura general

El sistema utiliza:

- Arquitectura de Microservicios (global)
- Arquitectura Hexagonal (interna por servicio)

---

# Microservicios planeados

| Servicio | Responsabilidad |
|---|---|
| transaction-service | Gestión de transacciones financieras |
| budget-service | Gestión y validación de presupuestos |
| orchestrator-service | Coordinación de flujos y patrón Saga |
| notification-service | Envío de notificaciones |
| gateway-service | Punto de entrada y routing |

---

# Estructura del repositorio

```text
financial-system-ms/
│
├── transaction-service/
├── budget-service/
├── orchestrator-service/
├── notification-service/
├── gateway-service/
│
├── docker/
├── docs/
└── README.md
```

Cada microservicio posee:

- Independencia lógica
- Su propia configuración
- Su propio ciclo de vida
- Separación estricta de responsabilidades

---

#  Tecnologías

## Backend

- Java 17
- Spring Boot
- Maven

## Testing (planeado)

- JUnit
- Mockito

## Infraestructura futura

- Docker
- Jenkins
- SonarQube

## APIs

- REST

---

# Arquitectura interna

Cada microservicio sigue una estructura basada en:

```text
domain/
application/
infrastructure/
```

---

# Capas

## Domain

Núcleo del negocio.

Contiene:

- Entidades del dominio
- Reglas de negocio
- Puertos (interfaces)

No depende de frameworks.

---

## Application

Contiene:

- Casos de uso
- Orquestación de lógica de aplicación

No conoce infraestructura.

---

## Infrastructure

Contiene:

- Controllers
- Adapters
- Configuración Spring
- Persistencia
- Integraciones externas

---

# Arquitectura Hexagonal aplicada

La idea principal es:

> El dominio no debe depender de tecnologías externas.

Por ello:

- El dominio define contratos (Ports)
- La infraestructura implementa esos contratos (Adapters)

---

# Flujo implementado actualmente

Actualmente se encuentra implementado el flujo:

```text
POST /transactions
```

Flujo interno:

```text
HTTP Request -> Controller -> UseCase -> Port -> Adapter
```

---

# Estado actual del proyecto

## Completado

- Creación del monorepo
- Configuración Maven multi-module
- Creación de `transaction-service`
- Estructura hexagonal base
- Separación de capas
- Primer caso de uso funcional
- Endpoint REST funcional

---

# En progreso

Implementación de:

- DTOs de respuesta
- Validaciones
- Manejo global de errores
- Persistencia real con JPA

---

# Planeado

- PostgreSQL
- Dockerización
- Comunicación entre microservicios
- Patrón Saga
- JWT
- API Gateway
- CI/CD
- Observabilidad
- Mensajería asíncrona

---

# Endpoint actual

## Crear transacción

### Request

```http
POST /transactions
```

### Body

```json
{
  "amount": 1500,
  "type": "income"
}
```

### Response

```json
{
  "id": "8608ff87-da7f-4127-b8ef-05855ee074ba",
  "amount": 1500,
  "type": "INCOME",
  "createdAt": "2026-05-07T15:43:07.4102504"
}
```

---

# Conceptos aplicados actualmente

- Arquitectura Hexagonal
- Ports & Adapters
- Inversión de dependencias
- Separación de responsabilidades
- DTOs
- Casos de uso
- Dominio desacoplado
- Diseño orientado a negocio

---

# 🚫 Decisiones arquitectónicas importantes

- No usar MVC tradicional
- No acoplar dominio a Spring
- No usar entidades JPA dentro del dominio
- No compartir base de datos entre servicios
- No colocar lógica en controllers

---

# 🚀 Próximos pasos

- DTO Response
- Validaciones
- Exception Handler global
- Persistencia con JPA
- Base de datos PostgreSQL
- Docker
- Comunicación entre microservicios

---

# 📚 Objetivo final

Este proyecto busca simular una arquitectura backend moderna orientada a escenarios empresariales reales, permitiendo:

- Dominar arquitectura de microservicios
- Comprender arquitectura hexagonal correctamente
- Aplicar buenas prácticas de desarrollo backend
- Construir sistemas desacoplados y mantenibles