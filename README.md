# 💰 Financial System Microservices

Sistema de finanzas personales basado en arquitectura de microservicios, diseñado para simular un entorno real de backend empresarial utilizando Java y Spring Boot.

---

## 📌 Descripción

Este proyecto implementa una plataforma para la gestión de finanzas personales, incluyendo:

- Registro de transacciones (ingresos y gastos)
- Control de presupuestos
- Validación de límites financieros
- Notificaciones
- Orquestación de flujos mediante patrón Saga

El objetivo principal es aplicar buenas prácticas de:

- Arquitectura de microservicios
- Clean Code
- Diseño por capas
- Orquestación de servicios
- Comunicación entre servicios

---

## 🏗️ Arquitectura

El sistema está construido como un **monorepo de microservicios**, donde cada servicio es independiente.

### 🔹 Servicios

| Servicio | Descripción |
|----------|------------|
| transaction-service | Gestión de transacciones financieras |
| budget-service | Control y validación de presupuestos |
| orchestrator-service | Orquestación de flujos (Saga pattern) |
| notification-service | Envío de notificaciones |
| gateway-service | Punto de entrada (API Gateway) |

---

## 🧱 Estructura del proyecto
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


---

## ⚙️ Tecnologías utilizadas

- Java 17
- Spring Boot
- Maven
- JPA / Hibernate
- H2 (desarrollo)
- Docker (próximamente)
- REST APIs

---

## 🧠 Principios aplicados

- Separación de responsabilidades
- Arquitectura por capas:
    - Domain
    - Application
    - Infrastructure
- Comunicación entre microservicios
- Orquestación centralizada
- DTOs para transferencia de datos
- Validaciones con Bean Validation

---

## 🚀 Ejecución del proyecto

### Prerrequisitos

- Java 17+
- Maven
- IDE (IntelliJ recomendado)

---

### ▶️ Ejecutar un microservicio

Desde cada carpeta:

```bash
cd transaction-service
mvn spring-boot:run