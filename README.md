# 💰 Finance Manager – Backend Application

Finance Manager is a Spring Boot–based backend application designed to help users systematically manage their personal finances. It provides structured APIs for handling income, expenses, categories, transactions, and budgets with a strong emphasis on clean architecture, database design, and maintainable business logic.

> ⚠️ **Note:** Authentication and authorization (Spring Security / JWT) are intentionally excluded in the current version to keep the focus on core business logic and domain modeling. Security will be integrated in a future release.

---

## 📌 Overview

Managing personal finances is often challenging, especially for students and young professionals. Small, frequent expenses—such as food, travel, subscriptions, and shopping—are easy to overlook. Over time, these untracked expenses accumulate, making it difficult to understand spending habits or maintain a healthy budget.

Finance Manager addresses this problem by offering a centralized backend system that enables users to record, categorize, and analyze their financial data in a structured and reliable way. By exposing RESTful APIs, the application can be easily integrated with any frontend (web, mobile, or desktop).

---

## 🎯 Project Objectives

* Provide a structured backend for managing personal finance data
* Enable accurate tracking of income and expenses
* Support category-based and monthly budget planning
* Promote clean backend architecture and separation of concerns
* Offer extensible APIs for future feature growth

---

## 🚀 Features

* 👤 User management
* 🗂️ Category management (INCOME / EXPENSE)
* 💸 Transaction tracking
* 📊 Budget planning (monthly, category-based)
* 🛢️ PostgreSQL database integration
* 🔁 RESTful API design
* 🧪 API testing using Postman

---

## ⚙️ How the System Works

1. Users are created and managed within the system.
2. Each user defines categories for income and expenses (e.g., Salary, Food, Travel).
3. Transactions are recorded under specific categories with amount, type, and date.
4. Budgets can be configured per category on a monthly basis.
5. The system tracks used amounts against budget limits to help analyze spending behavior.

All interactions are exposed via REST APIs, making the backend independent of any specific client application.

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot** – Application framework
* **Spring Data JPA** – ORM and data persistence
* **PostgreSQL** – Relational database
* **Maven** – Build and dependency management
* **Postman** – API testing

---

## 🗄️ Database Design

### User

* `id` (PK)
* `email`
* `password`
* `full_name`
* `created_at`

### Category

* `id` (PK)
* `name`
* `type` (INCOME / EXPENSE)
* `user_id` (FK)

### Transaction

* `id` (PK)
* `user_id` (FK)
* `category_id` (FK)
* `amount`
* `type` (INCOME / EXPENSE)
* `description`
* `txn_date`
* `created_at`

### Budget

* `id` (PK)
* `user_id` (FK)
* `category_id` (FK)
* `amount_limit`
* `month`
* `year`
* `used_amount`

---

## 🧩 Architectural Notes

* Follows layered architecture (Controller → Service → Repository)
* DTOs can be introduced to decouple API contracts from entities
* Business logic is isolated in service classes
* Database schema is normalized for scalability and consistency

---

## 🚀 Future Enhancements

* Authentication & authorization using Spring Security and JWT
* Advanced financial analytics and reports
* Recurring transactions support
* Export data to CSV or Excel
* Frontend integration (Web / Mobile)

---

## 👨‍💻 Developer Notes

* **Project Name:** Finance Manager
* **Type:** Backend Application
* **Framework:** Spring Boot
* **Database:** PostgreSQL
* **Purpose:** Structured and scalable backend for personal finance management

---

## 📄 License

This project is intended for educational and personal use. Licensing can be added as per future distribution requirements.
