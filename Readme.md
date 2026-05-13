# 🏦 BankSim - Full Stack Java Web Application

## 📌 Overview
BankSim is a full-stack web application that simulates core banking operations. Built with Java Servlets and MySQL, it provides a secure and functional banking experience with real-world features like session management and SQL injection prevention.

🔗 **LinkedIn Project Showcase:**  
https://www.linkedin.com/posts/akshay-r369_javadevelopment-springframework-springboot-activity-7361089800747012098-F5B-?utm_source=share&utm_medium=member_desktop

🔗 **Initial Backend Setup Guide:**  
https://www.linkedin.com/feed/update/urn:li:activity:7351310320432287747/

---

## 🚀 Features

| Feature | Description |
|---------|-------------|
| 💳 Account Creation | Auto-generated account numbers with user details |
| 🔐 Secure Login | PIN-based authentication with session management |
| 💰 Deposit | Add funds to your account |
| 💸 Withdrawal | Withdraw with real-time balance validation |
| 🗑️ Account Deletion | Permanently remove account and data |
| 🛡️ Security | PreparedStatement queries to prevent SQL injection |
| 📊 Dashboard | Dynamic user dashboard post-login |

---

## 🛠 Tech Stack

| Layer | Technology |
|-------|-----------|
| **Backend** | Java Servlets, JSP |
| **Database** | MySQL with JDBC |
| **Server** | Apache Tomcat |
| **Frontend** | HTML5, CSS3, JavaScript |
| **Architecture** | MVC Pattern |

---

## 🧠 Architecture Overview

```
┌─────────────────────────────────────────────────────────┐
│                    CLIENT LAYER                         │
│         HTML5 | CSS3 | JavaScript Frontend              │
└────────────────────┬────────────────────────────────────┘
                     │ HTTP Request
                     ▼
┌─────────────────────────────────────────────────────────┐
│              CONTROLLER LAYER                           │
│        LoginServlet (Central Hub)                       │
│  ├─ Login Handler                                       │
│  ├─ Account Creation                                    │
│  ├─ Deposit Processing                                  │
│  ├─ Withdraw Processing                                 │
│  └─ Delete Account                                      │
└────────────────────┬────────────────────────────────────┘
                     │ JDBC
                     ▼
┌─────────────────────────────────────────────────────────┐
│              DATABASE LAYER                             │
│            MySQL Database                               │
│  ├─ Users Table                                         │
│  └─ Transactions Table                                  │
└─────────────────────────────────────────────────────────┘
```

---

## 📋 Core Components

### Backend Components

| Component | Role |
|-----------|------|
| **LoginServlet** | Main controller handling all banking operations |
| **JDBC Connection** | Database connectivity and query execution |
| **Session Management** | User authentication state tracking |
| **PreparedStatement** | Secure SQL query execution |

### Database Schema

| Table | Purpose |
|-------|---------|
| **Users** | Stores account holder information, PIN, balance |
| **Transactions** | Logs all deposit/withdrawal operations |

---

## 🔄 User Flow Diagram

```
START
  │
  ├─► [New User?]
  │   └─► Account Creation ─► Auto-Gen Account# ─► DB Store
  │
  ├─► [Existing User?]
  │   └─► Login (PIN Auth) ─► Session Created ─► Dashboard
  │       │
  │       ├─► Deposit Money ─► Update Balance
  │       │
  │       ├─► Withdraw Money ─► Balance Check ─► Process/Reject
  │       │
  │       └─► Delete Account ─► Remove from DB
  │
  END
```

---

## 🔐 Security Features

| Security Measure | Implementation |
|------------------|-----------------|
| **SQL Injection Prevention** | PreparedStatement with parameterized queries |
| **Session Security** | HTTP Session-based authentication |
| **PIN Authentication** | User-defined secure PIN verification |
| **Balance Validation** | Prevents overdraft transactions |

---

## 📊 Entity Relationship

```
┌─────────────┐         ┌──────────────┐
│    USERS    │ 1----∞ │ TRANSACTIONS │
├─────────────┤         ├──────────────┤
│ account_id  │◄────────┤ account_id   │
│ name        │         │ trans_date   │
│ pin         │         │ amount       │
│ balance     │         │ type         │
│ created_at  │         │ balance_after│
└─────────────┘         └──────────────┘
```

---

## 🎯 Project Structure

```
BankSim-Java-FullStack/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── servlets/
│   │   │       └── LoginServlet.java
│   │   ├── webapp/
│   │   │   ├── index.jsp (Login Page)
│   │   │   ├── dashboard.jsp (Main Dashboard)
│   │   │   ├── create_account.jsp
│   │   │   └── css/ (Styling)
│   │   └── resources/
│   │       └── db.properties (DB Config)
│   └── test/
├── WebContent/
│   └── WEB-INF/
│       └── web.xml (Servlet Configuration)
├── lib/ (JDBC Drivers)
├── Readme.md
└── .gitignore
```

---

## ⚡ Quick Start

### Prerequisites
- Java 8+
- MySQL Server
- Apache Tomcat 9+
- JDBC MySQL Driver

### Setup Steps

1. **Create Database**
   ```sql
   CREATE DATABASE banksim;
   ```

2. **Configure Connection**
   - Update `db.properties` with your MySQL credentials

3. **Deploy**
   - Deploy WAR file to Tomcat

4. **Access Application**
   - Navigate to `http://localhost:8080/BankSim`

---

## 🎓 Learning Outcomes

This project demonstrates:
- ✅ Java Servlet-based web development
- ✅ JDBC and database operations
- ✅ MVC architectural pattern
- ✅ Session management
- ✅ SQL security best practices
- ✅ Full-stack integration

---

## 📝 License
Open source - Feel free to use and modify

---

## 👤 Author
**Akshay R** - Java Full Stack Developer
