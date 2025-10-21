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
