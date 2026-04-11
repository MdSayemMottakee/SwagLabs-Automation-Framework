# 🚀 Selenium Automation Framework – SwagLabs (SauceDemo)

## 📌 Overview

This project is a **UI Automation Testing Framework** built using **Selenium WebDriver, Java, TestNG, and Maven**. It automates end-to-end testing of the SauceDemo e-commerce application.

**Target Site:** [https://www.saucedemo.com/](https://www.saucedemo.com/)

The framework follows the **Page Object Model (POM)** design pattern to ensure scalability, maintainability, and reusability.

---

## 🧠 What is Selenium?

**Selenium** is an open-source automation testing tool used to automate web applications across different browsers and platforms. It is widely used in QA automation to simulate real user interactions like clicking buttons, entering text, and validating UI behavior.

### 🔹 Selenium Components
* **Selenium WebDriver** → Core automation API for browser interaction.
* **Selenium Grid** → Enables parallel execution across different machines/OS.
* **Selenium IDE** → A record-and-playback tool for quick prototyping.

---

## 🏗️ Framework Architecture

This project uses the **Page Object Model (POM)**. This design pattern creates an object repository for web elements, reducing code duplication and improving test maintenance.

### 📁 Project Structure

```text
SwagLabs-Automation/
│
├── src/test/java/
│   ├── base/          # BaseTest (WebDriver setup & teardown)
│   ├── pages/         # Page classes (Locators & Actions)
│   ├── tests/         # TestNG test cases
│   └── utils/         # Helper & Utility classes
│
├── testng.xml         # Test suite configuration
├── pom.xml            # Maven dependencies
└── README.md
```

---

## 🧱 Tech Stack

| Tool | Purpose |
| :--- | :--- |
| **Java** | Programming Language |
| **Selenium WebDriver** | Browser Automation |
| **TestNG** | Test Execution & Assertions |
| **Maven** | Dependency Management |
| **IntelliJ IDEA** | Development IDE |

---

## ⚙️ Setup & Installation

### 1️⃣ Prerequisites
Ensure you have the following installed:
* **Java JDK 17+**
* **Maven**
* **Google Chrome Browser**

### 2️⃣ Clone & Import
```bash
# Clone the repository
git clone [https://github.com/your-username/swaglabs-automation.git](https://github.com/your-username/swaglabs-automation.git)

# Navigate to directory
cd swaglabs-automation
```
1. Open **IntelliJ IDEA**.
2. Select **Open** and choose the project folder.
3. Allow Maven to download dependencies (or run `mvn clean install` in the terminal).

---

## 🚀 Running the Tests

| Method | Command / Action |
| :--- | :--- |
| **Maven (Terminal)** | `mvn test` |
| **TestNG Suite** | Right-click `testng.xml` → **Run** |
| **Specific Test** | Right-click a class in `src/test/java/tests/` → **Run** |

---

## 🧪 Test Scenarios Covered

* **🔐 Login:** Valid/Invalid credentials and locked-out user checks.
* **📦 Products:** Visibility, sorting, and adding items to the cart.
* **🛒 Cart:** Item verification and removal.
* **💳 Checkout:** Form submission and order success validation.

---

## 📊 Reporting & Future Roadmap

Currently, the framework uses **TestNG default reports**. Future enhancements include:
* ✅ **Extent Reports:** Interactive HTML dashboards.
* ✅ **Screenshots:** Automatic capture on test failure.
* ✅ **CI/CD:** Integration with GitHub Actions or Jenkins.
* ✅ **Data Driven:** Testing via Excel or JSON files.

---

## ⚠️ Known Non-Blocking Warnings
You may encounter these in the console; they **do not** affect test results:
* `SLF4J: Failed to load class...`: Occurs if a specific logger binder is missing.
* `Unable to find CDP implementation...`: Occurs when the Selenium version is slightly ahead/behind the Chrome version.

---
