# Order Processing Microservice

This repository contains a **Spring Boot Java 21** microservice designed for **order processing** using **RabbitMQ** for messaging and **MongoDB** for data persistence.

---

## 🛠️ **Technologies Used**  
- **Java 21** – Latest long-term support version of Java for enhanced performance and modern language features.  
- **Spring Boot** – Framework for rapid development and microservice architecture.  
- **RabbitMQ** – Message broker for handling asynchronous communication between services.  
- **MongoDB** – NoSQL database for flexible and scalable data storage.  
- **Docker** – For containerized deployment and testing.  

---


## 🚀 **Features**  
✅ **Receive and process orders** – Listens to incoming order messages from RabbitMQ.  
✅ **Persist orders** – Stores order details in MongoDB.  
✅ **Order validation** – Validates the order data before processing.  
✅ **Status updates** – Sends status updates for processed orders.  
✅ **Error handling** – Graceful handling of processing errors and logging.  

---

## 🔄 **RabbitMQ Message Flow**  
1. The service listens to an **order queue** in RabbitMQ.  
2. Upon receiving an order message, it validates the order data.  
3. If valid, it persists the order in MongoDB and updates the status.  
4. Sends an acknowledgment or rejection message back to RabbitMQ.  
