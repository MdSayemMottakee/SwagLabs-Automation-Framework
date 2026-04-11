```md
# 🚀 Selenium Automation Framework – SwagLabs (SauceDemo)

## 📌 Overview

This project is a **UI Automation Testing Framework** built using **Selenium WebDriver, Java, TestNG, and Maven**. It automates end-to-end testing of an e-commerce demo application:

👉 https://www.saucedemo.com/

The framework follows the **Page Object Model (POM)** design pattern to ensure scalability, maintainability, and reusability.

---

# 🧠 What is Selenium?

**Selenium** is an open-source automation testing tool used to automate web applications across different browsers and platforms.

It is widely used in QA automation to simulate real user interactions like clicking buttons, entering text, and validating UI behavior.

---

## 🔹 Why Selenium?

- Open-source and free
- Supports multiple browsers (Chrome, Firefox, Edge)
- Supports multiple programming languages (Java, Python, C#, etc.)
- Strong community support
- Widely used in industry for UI automation

---

## 🔹 Selenium Components

- **Selenium WebDriver** → Core automation API
- **Selenium Grid** → Parallel execution across machines
- **Selenium IDE** → Record and playback tool

---

# 🎯 Project Objective

The goal of this project is to automate the main workflows of an e-commerce application:

✔ Login functionality  
✔ Product selection  
✔ Add to cart  
✔ Cart validation  
✔ Checkout process  
✔ Order completion  

---

# 🏗️ Framework Architecture

This project uses the **Page Object Model (POM)** design pattern.

### 📁 Project Structure

```

SwagLabs-Automation/
│
├── src/test/java/
│   ├── base/          # BaseTest (WebDriver setup & teardown)
│   ├── pages/         # Page classes (POM classes)
│   ├── tests/         # Test cases (TestNG tests)
│   ├── utils/         # Utility classes (future use)
│
├── testng.xml         # Test suite configuration
├── pom.xml            # Maven dependencies
└── README.md

````

---

# 🧱 Tech Stack

| Tool | Purpose |
|------|--------|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| TestNG | Test framework |
| Maven | Dependency management |
| IntelliJ IDEA | Development IDE |

---

# ⚙️ Setup Instructions

## 1️⃣ Prerequisites

Make sure you have installed:

- Java JDK 17+
- Maven
- IntelliJ IDEA
- Google Chrome Browser

---

## 2️⃣ Clone Repository

```bash
git clone https://github.com/your-username/swaglabs-automation.git
````

---

## 3️⃣ Import Project

* Open IntelliJ IDEA
* Click **Open Project**
* Select the project folder
* Wait for Maven to download dependencies

---

## 4️⃣ Install Dependencies

Maven will automatically download all required libraries from `pom.xml`.

If needed, run:

```bash
mvn clean install
```

---

# 🚀 How to Run Tests

## ▶️ Option 1: Run from IntelliJ

* Open `testng.xml`
* Right-click → Run

---

## ▶️ Option 2: Run Test Classes

* Right-click any test class (LoginTest, ProductTest, etc.)
* Click **Run**

---

## ▶️ Option 3: Run via Maven

```bash
mvn test
```

---

# 🧪 Test Scenarios Covered

## 🔐 Login Module

* Valid login
* Invalid login
* Locked user validation

---

## 📦 Product Module

* Product list visibility
* Add product to cart
* Validate cart count

---

## 🛒 Cart Module

* Open cart
* Verify items in cart
* Remove items from cart

---

## 💳 Checkout Module

* Enter user details
* Complete checkout process
* Verify success message

---

# 🧠 Framework Design Pattern

## ✔ Page Object Model (POM)

Each page contains:

* Locators
* Actions
* Reusable methods

### Example Pages:

* LoginPage.java
* ProductPage.java
* CartPage.java
* CheckoutPage.java

---

# 📊 Reporting

Currently using:

* TestNG default reports

Future improvements:

* Extent Reports (HTML dashboard)
* Screenshot on failure
* Allure Reports
* CI/CD integration

---

# ⚠️ Known Warnings (Safe to Ignore)

You may see:

### SLF4J Warning

```
Failed to load class "org.slf4j.impl.StaticLoggerBinder"
```

### Chrome CDP Warning

```
Unable to find CDP implementation matching version
```

👉 These are **non-blocking warnings** and do not affect test execution.

---

# 🚀 Future Enhancements

* Add Extent Reports
* Add Screenshot on failure
* Data-driven testing (Excel/JSON)
* Parallel execution (TestNG)
* CI/CD integration (Jenkins / GitHub Actions)
* API + UI combined framework

---

# 👨‍💻 Author

This project is built for **Selenium QA Automation practice and portfolio development**.

---

# 🎯 Learning Outcome

After completing this project, you will understand:

* Selenium WebDriver basics
* Real-world automation framework design
* Page Object Model (POM)
* TestNG execution flow
* End-to-end UI automation testing

```
```
