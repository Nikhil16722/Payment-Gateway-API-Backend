# 💳 Payment Gateway API Backend

🚀 A production-ready Payment Gateway Backend built using **Spring Boot, PostgreSQL, and Railway Cloud**.

This project demonstrates real-world backend architecture including REST APIs, JPA/Hibernate ORM, database integration, security configuration, and cloud deployment.

---

## 🌐 Live Demo

🔗 **Deployed URL:**  
https://payment-gateway-api-backend-production.up.railway.app

🔗 **Users API (Live DB Data):**  
https://payment-gateway-api-backend-production.up.railway.app/api/users

🔗 **GitHub Repository:**  
https://github.com/Nikhil16722/Payment-Gateway-API-Backend

---

## 🏗️ Tech Stack

| Layer | Technology |
|-------|------------|
| Backend | Spring Boot 4 |
| Database | PostgreSQL |
| ORM | Spring Data JPA (Hibernate) |
| Security | Spring Security |
| Build Tool | Maven |
| Cloud | Railway |
| Language | Java 21 |

---

## 📂 Project Architecture
com.payment.gateway
│
├── controller → REST Controllers
├── service → Business Logic Layer
├── repository → JPA Repository Layer
├── model → Entity Classes
├── config → Security & App Config
└── resources
└── templates → UI (Thymeleaf)


This follows proper **Layered Architecture** used in enterprise backend systems.

---

## 🧩 Features Implemented

✔ RESTful API Architecture  
✔ PostgreSQL Database Integration  
✔ One-to-Many Entity Mapping (User → Payments)  
✔ Spring Security Configuration  
✔ Cloud Deployment (Railway)  
✔ Live Database Connectivity  
✔ Clean Professional UI Homepage  
✔ Maven Build & Dependency Management  

---

## 🗃️ Database Design

### 👤 User Entity
- id (Primary Key)
- fullName
- email (Unique)
- password
- One-to-Many relationship with Payments

### 💰 Payment Entity
- id
- amount
- paymentDate
- referenceNumber
- Many-to-One relationship with User

Demonstrates real relational database modeling.

---

## ⚙️ How to Run Locally

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Nikhil16722/Payment-Gateway-API-Backend.git
cd Payment-Gateway-API-Backend

### 2️⃣ Configure PostgreSQL

Update application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/payment_db
spring.datasource.username=your_username
spring.datasource.password=your_password

### 3️⃣ Run Application:

.\mvnw clean install 
.\mvnw clean install -DskipTests 

.\mvnw spring-boot:run

Application runs at:

http://localhost:8080

☁️ Cloud Deployment

This project is deployed on Railway Cloud with:

1.Environment variables for DB
2.Managed PostgreSQL instance
3.Continuous deployment from GitHub
4.Public production URL

Demonstrates DevOps & cloud integration skills.

🧠 Key Concepts Demonstrated

1.REST API Design
2.Dependency Injection
3.Hibernate ORM Mapping
4.DTO & Layer Separation
5.Security Configuration
6.Environment-Based Configuration
7.Cloud Deployment Workflow
8.Maven Lifecycle
9.Production Readiness

📊 Sample API Response
[
  {
    "id": 1,
    "fullName": "Nikhil Kumar",
    "email": "nikhil@example.com",
    "payments": []
  }
]

Shows real-time data fetched from PostgreSQL.

Why This Project Matters

This project demonstrates:

✔ Backend Development Skills
✔ Database Design & Integration
✔ Security Implementation
✔ Cloud Deployment Experience
✔ Clean Code Structure
✔ Real Production-Style Architecture

It is not just a CRUD project — it is structured like an enterprise backend service.

👨‍💻 Author

Nikhil Lingala

> Java Backend Developer
> Spring Boot Enthusiast
> Cloud Deployment Experience
> REST API Architecture

📬 Contact

If you are a recruiter or hiring manager interested in backend development skills, feel free to connect.
