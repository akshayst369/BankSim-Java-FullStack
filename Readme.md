# 🏦 BankSim - Full Stack Java Web Application

> A comprehensive banking simulation system built with Java, demonstrating core banking operations and secure authentication.

---

## 📋 Table of Contents
- [Overview](#overview)
- [Key Features](#-key-features)
- [Tech Stack](#-tech-stack)
- [Architecture](#-architecture)
- [Project Structure](#-project-structure)
- [Installation & Setup](#-installation--setup)
- [Usage Guide](#-usage-guide)
- [Security Features](#-security-features)
- [API Endpoints](#-api-endpoints)
- [Database Schema](#-database-schema)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)
- [License](#-license)

---

## 📌 Overview

BankSim is a full-stack web application that simulates essential banking operations with a focus on **backend-centric development using Java Servlets, JDBC, and MySQL**. The application provides a secure, session-based authentication system with a responsive frontend interface.

**LinkedIn Project Showcase:**  
https://www.linkedin.com/posts/akshay-r369_javadevelopment-springframework-springboot-activity-7361089800747012098-F5B-?utm_source=share&utm_medium=member_desktop

---

## 🎯 Key Features

- ✅ **Account Management**
  - Create new bank accounts with auto-generated account numbers
  - Delete account with proper validation
  
- 🔐 **Authentication & Security**
  - Secure login with PIN authentication
  - Session-based user state management
  - SQL injection prevention using PreparedStatements
  
- 💳 **Banking Operations**
  - Deposit money to accounts
  - Withdraw money with balance validation
  - Real-time account balance updates
  
- 📊 **User Interface**
  - Dynamic dashboard after login
  - Responsive design for better UX
  - Intuitive navigation

---

## 🛠 Tech Stack

### Backend
| Component | Technology |
|-----------|-----------|
| **Language** | Java |
| **Framework** | Servlets, JSP |
| **Database Access** | JDBC |
| **Server** | Apache Tomcat |
| **Build Tool** | Maven/Gradle (if applicable) |

**Backend Setup Reference:**  
https://www.linkedin.com/feed/update/urn:li:activity:7351310320432287747/

### Frontend
| Component | Technology |
|-----------|-----------|
| **Markup** | HTML5 |
| **Styling** | CSS3 |
| **Interactivity** | JavaScript |

### Database
| Component | Technology |
|-----------|-----------|
| **DBMS** | MySQL |
| **Version** | 5.7+ recommended |

---

## 🏗 Architecture

### Design Pattern
The application follows a simplified **MVC (Model-View-Controller)** pattern with:
