# 🧪 Selenium Complete POM Framework

This project demonstrates a **Page Object Model (POM)** based **Selenium Automation Framework** using **Java** and **TestNG**.  
It automates the login functionality of the [nopCommerce Admin Demo](https://admin-demo.nopcommerce.com/login) page.

---

## 🚀 Project Overview

**Project Name:** `selenium-complete-pom-framework`  
**Tested Website:** [https://admin-demo.nopcommerce.com/login](https://admin-demo.nopcommerce.com/login)  
**Language:** Java  
**Framework:** Selenium + TestNG  
**Design Pattern:** Page Object Model (POM)  
**Build Tool:** Maven  
**IDE Used:** Eclipse  

---

## 📂 Project Structure
selenium-complete-pom-framework/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── base/
│ │ │ │ └── BaseTest.java # Handles browser setup and teardown
│ │ │ │
│ │ │ ├── pages/
│ │ │ │ └── Login.java # Page Object for the login page
│ │ │ │
│ │ │ └── utils/ # Reserved for utility/helper classes
│ │ │
│ │ └── resources/ # Configuration files or data (if needed)
│ │
│ ├── test/
│ │ ├── java/
│ │ │ └── tests/
│ │ │ └── LoginTest.java # Test case class that extends BaseTest
│ │ │
│ │ └── resources/ # Test data (if needed)
│ │
│
├── test-output/ # TestNG auto-generated reports
│ ├── index.html # Main TestNG dashboard report
│ ├── emailable-report.html # Summary report (email format)
│ └── LoginSuite/LoginTest.html # Test class-specific report
│
├── pom.xml # Maven build configuration and dependencies
├── testing.xml # TestNG suite file (defines which tests to run)
└── README.md # Project documentation


---

## ⚙️ Core Files Description

### 🧩 1. BaseTest.java (`src/main/java/base/BaseTest.java`)
### 🧩 2. Login.java (src/main/java/pages/Login.java)
### 🧩 3. LoginTest.java (src/test/java/tests/LoginTest.java)
### 🧩 4. testing.xml (TestNG Suite File)
### 🧩 5. pom.xml (Maven Build Configuration)
Handles all browser-related setup and teardown operations.

### Test Reports
| Report Type      | File Path                               | Description                 |
| ---------------- | --------------------------------------- | --------------------------- |
| **Main Report**  | `test-output/index.html`                | Full execution summary      |
| **Email Report** | `test-output/emailable-report.html`     | Simplified HTML report      |
| **Class Report** | `test-output/LoginSuite/LoginTest.html` | Test class-specific results |
