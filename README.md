# 💰 Finance Manager – Backend Application

Finance Manager is a Spring Boot–based backend application designed to help users manage their income, expenses, categories, transactions, and budgets.
This project focuses on clean backend architecture, database design, and RESTful APIs.

⚠️ Note: Authentication & authorization (Spring Security / JWT) are intentionally excluded for now to focus on core business logic. 
  They will be added in a future version.
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
 # 🚀 Features

👤 User management

🗂️ Category management (INCOME / EXPENSE)

💸 Transaction tracking

📊 Budget planning (monthly, category-based)

🛢️ PostgreSQL database integration

🔁 RESTful APIs

🧪 Tested using Postman
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
# 🛠️ Tech Stack
Layer	                        Technology
Language	                     Java
Framework	                     Spring Boot
ORM                         Spring Data JPA (Hibernate)
Database	                     PostgreSQL
Build Tool                   	 Maven
API Testing	                     Postman
------------------------------------------------------------------------------------------------------------------------------------------------------------------
 # 📂 Project Structure
Finance-manager/
├── src/main/java/spring/Finance/manager
│   ├── Control        # REST Controllers
│   ├── Entity         # JPA Entities
│   ├── Repos          # JPA Repositories
│   ├── Services       # Business Logic
│   └── FinanceManagerApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
└── README.md
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
# 🗄️ Database Design
 # User

id (PK)

email

password

full_name

created_at

# Category

id (PK)

name

type (INCOME / EXPENSE)

user_id (FK)

# Transaction

id (PK)

user_id (FK)

category_id (FK)

amount

type (INCOME / EXPENSE)

description

txn_date

created_at

# Budget

id (PK)

user_id (FK)

category_id (FK)

amount_limit

month

year

used_amount
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
# FINANCE MANAGER 
In day-to-day life, managing personal finances is difficult, especially for students and young professionals.
Many people spend money on small daily expenses such as food, travel, shopping, and subscriptions without properly tracking them. Over time, these untracked expenses accumulate, making it hard to understand where money is being spent and why savings are reducing.

I personally faced this problem, as I noticed that I was spending more money outside without a clear understanding of my expenses. Without a proper system to record income and expenses, it became difficult to analyze spending habits, control unnecessary expenses, and maintain a balanced budget.

Most people either rely on memory or use unstructured methods like notes, which are inefficient and error-prone. There is a need for a simple and organized solution that allows users to record their income and expenses, view summaries, and understand their financial behavior.

The Finance Manager application is created to solve this problem by providing a centralized platform where users can:

Record income and expenses

Categorize spending

View total income, total expenses, and remaining balance

Analyze spending patterns over time

This helps users make better financial decisions, reduce unnecessary spending, and develop better money management habits.