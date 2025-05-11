# 🚚 EKart Delivery Service (Kafka Consumer)

## 📘 Project Description

The **EKart Delivery Service** is a Spring Boot microservice that functions as a **Kafka Consumer**. It listens to messages published on the `notification` topic by the **E-Commerce Producer Service** (e.g., Flipkart's purchase system), and logs the purchase-related data for delivery tracking.

Once it receives the data, the service stores it in a local database table for future use such as delivery assignment, tracking, or analytics.

---

## 🔁 Key Features

- **Kafka Message Consumption**: Subscribes to the `notification` topic and receives real-time purchase notifications.
- **Message Logging**: Prints received messages to the console.
- **Data Persistence**: Saves messages to the database in a `Delivery` table for tracking purposes.

---

## 🛠 Technologies Used

- **Java 17** – Core language
- **Spring Boot** – Application framework
- **Apache Kafka** – Message broker for asynchronous communication
- **KafkaListener** – To consume Kafka messages
- **Spring Data JPA** – For database operations
- **PostgreSQL / H2** – For message persistence
- **Lombok (optional)** – Reduces boilerplate code in the model layer

---

## 📦 Kafka Integration

This microservice is tightly coupled with the **Flipkart E-Commerce Producer** service, and specifically listens on the Kafka topic:

```yaml
topic: notification
groupId: my-group
