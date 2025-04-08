# 🏥 Health Care Management System – Kubernetes Deployment

This project is a Kubernetes-based deployment of a **microservice-driven health care management system**, developed for CS 548 — *Enterprise Software Architecture and Design (Spring 2025)* at Stevens Institute of Technology.

---

## 📦 Architecture Overview

The system is composed of the following components:

1. **Database Server (`cs548db`)**  
   PostgreSQL instance initialized from a custom Docker image.

2. **Domain Microservice (`clinic-domain`)**  
   Core logic that handles patients, providers, and treatments.

3. **Frontend Web Application (`clinic-webapp`)**  
   Browser-based UI to interact with the domain microservice.

4. **RESTful Web Service (`clinic-rest`)**  
   Web interface that exposes APIs for integration and client apps.

---

## 🚀 Deployment Flow (Kubernetes)

### 1. **Database Deployment**
- YAML: `clinic-database-deploy.yaml` & `clinic-database-service.yaml`
- Exposed via `NodePort` for use with IntelliJ and internal services.

### 2. **Domain Microservice**
- YAML: `clinic-domain-deployment.yaml` & `clinic-domain-service.yaml`
- Communicates with database using environment variables.
- Available internally and through `NodePort`.

### 3. **Frontend Web Application**
- YAML: `clinic-webapp-deployment.yaml` & `clinic-webapp-service.yaml`
- Exposed on port **8080**:

### 4. **REST Web Service**
- YAML: `clinic-rest-deployment.yaml` & `clinic-rest-service.yaml`
- Exposed on port **9090**:

---

## 🛠 Technologies Used

- **Kubernetes** (local via Docker Desktop)
- **Docker** (custom images for each service)
- **PostgreSQL**
- **Java / Jakarta EE (Payara Micro)**
- **IntelliJ IDEA** (Database Tool for testing)
- **kubectl** (to manage and describe pods/services)

---

## ✅ Features Demonstrated

- CI/CD deployment with custom Docker images
- Independent scaling and restart policy per microservice
- Logs from webapp and REST service confirming backend interaction
- Working frontend and REST client access
- IntelliJ connected to PostgreSQL via exposed NodePort
- Cleanly separated service layers (database, backend, REST API, frontend)

---

## 📸 Screenshots & Video Demo

- 📹 **Screen Recording**: Demonstrates complete deployment and system in action  
(_includes docker builds, kubectl usage, browser & IntelliJ tests_)

---

## 📁 Project Structure


---

## 👤 Author

**Vidhi Palan**  
📧 [vidhipalan4@gmail.com](mailto:vidhipalan4@gmail.com)  
🔗 [GitHub](https://github.com/vidhipalan)  
🎓 Stevens Institute of Technology, MSCS '25

---

