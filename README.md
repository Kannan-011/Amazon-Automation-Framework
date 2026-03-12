# Amazon-Automation-Framework
Project Overview

This project is a Selenium Automation Framework developed using Java, Selenium WebDriver, TestNG, and Maven.

The framework automates the Amazon product search and purchase flow using the Page Object Model (POM) design pattern.

Tech Stack

• Java • Selenium WebDriver • TestNG • Maven • Page Object Model (POM) • PageFactory

Project Structure AmazonAutomationFramework │ ├── src/main/java │ ├── base │ │ BasePage.java │ │ │ ├── pages │ │ HomePage.java │ │ PurchaseIphonePage.java │ │ BuyingIphone17Pro.java │ │ │ ├── utils │ │ ScreenshotUtil.java │ ├── src/test/java │ └── tests │ BaseTest.java │ AmazonPurchaseTest.java │ ├── src/test/resources │ testng.xml │ └── pom.xml Test Scenario

The automation script performs the following steps:

Open Amazon website

Select Electronics from the search dropdown

Search for iPhone 17 Pro

Scroll the search results page

Click the first iPhone product

Switch to the product window

Capture the product price

Add the product to the cart

Verify the cart count

Framework Features

✔ Page Object Model (POM) design pattern ✔ PageFactory (@FindBy) for element initialization ✔ TestNG test execution ✔ Maven dependency management ✔ Reusable WebDriver setup using BaseTest ✔ Screenshot utility for failure handling

How to Run the Project

Clone the repository

git clone

Open the project in Eclipse or IntelliJ

Run the TestNG suite

testng.xml Learning Outcome

Through this project I gained hands-on experience with:

• Selenium WebDriver automation • Framework design using Page Object Model • TestNG test execution • Maven dependency management • Handling multiple browser windows • Scrolling using JavaScriptExecutor

Author

Kannan K

Automation Testing Enthusiast
