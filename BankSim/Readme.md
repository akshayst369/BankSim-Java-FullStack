# 🏦 BankSim - Full Stack Java Web Application

## 📌 Overview
BankSim is a full-stack web application that simulates basic banking operations such as account creation, login, deposit, withdrawal, and account deletion. The project demonstrates backend-focused development using Java Servlets and database integration.
LinkedIn - https://www.linkedin.com/posts/akshay-r369_javadevelopment-springframework-springboot-activity-7361089800747012098-F5B-?utm_source=share&utm_medium=member_desktop&rcm=ACoAAFaT1pIBI6IDPbdc9C-wnGtvEpYmXGaio_s
---

## 🚀 Features
- Create a new bank account (auto-generated account number)
- Secure login with PIN authentication
- Deposit money
- Withdraw money with balance validation
- Delete account functionality
- Session-based authentication
- Dynamic dashboard after login

---

## 🛠 Tech Stack

### Backend
- Java (Servlets, JSP)
- JDBC
- Apache Tomcat
- The link below showcases the Initial Backend Setup
https://www.linkedin.com/posts/akshay-r369_java-jsp-servlet-activity-7351310320432287747-5kwS?utm_source=share&utm_medium=member_desktop&rcm=ACoAAFaT1pIBI6IDPbdc9C-wnGtvEpYmXGaio_s

### Frontend
- HTML5
- CSS3
- JavaScript



### Database
- MySQL

---

## 🧠 Architecture
- Uses a **single controller servlet (LoginServlet)** to handle:
  - Login
  - Account creation
  - Deposit
  - Withdraw
  - Delete account
- Follows a simplified **MVC pattern**
- Uses **HTTP sessions** for user state management
- Uses **PreparedStatement** to prevent SQL injection

---

## 📂 Project Structure
BankSim/
│
├── src/main/java/com/bank/
│ ├── LoginServlet.java
│ └── LogoutServlet.java
│
├── src/main/webapp/
│ ├── login.jsp
│ ├── style.css
│ └── WEB-INF/web.xml

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/BankSim.git

2. Configure Database

Create database in MySQL:
CREATE DATABASE BankSim;

USE BankSim;

CREATE TABLE accounts (
    acc_number VARCHAR(30) PRIMARY KEY AUTO_INCREMENT,
    pin VARCHAR(10),
    balance DOUBLE
);

3. Update DB Credentials

Modify in LoginServlet.java:
jdbc:mysql://localhost:3306/BankSim
username: root
password: your_password

4. Deploy on Tomcat
Import project into Eclipse
Configure Apache Tomcat
Run the server
Open:
http://localhost:8080/BankSim

🧪 Key Learnings
Backend-centric full stack development
Servlet lifecycle and request handling
Session management and authentication
JDBC integration with MySQL
Debugging Tomcat deployment issues
Building dynamic UI with JSP and JavaScript

📈 Future Improvements
Add transaction history
Implement password hashing
Use MVC framework (Spring Boot)
Improve UI/UX with modern frontend frameworks

👨‍💻 Author
Akshay

⭐ If you like this project, consider giving it a star!

---

