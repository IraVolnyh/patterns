# Pattern Project Example using Selenium + Selenide

This project is an example of how to use various design patterns in automated testing with Selenium and Selenide. In this project, we have used Builder, Factory, Decorator, and Page Object Model (POM) patterns.

## Prerequisites

To run this project, you need to have the following software installed on your machine:

* Java (version 8 or higher)
* Maven
* Selenium
* Selenide

## Design Patterns Used

### Builder Pattern
In this project, I have used the Builder pattern to create a flexible and easy-to-use test data builder. The TestScenarioBuilder is the product being built, and the TestExamples class and testSearch test contains the builder.

### Factory Pattern
In this project, I have used the Facade pattern to simplify the interface of close Custom Popup on the web page. The Facade class provides a simple interface for interacting with modal popup and the TestExamples class contains this function.

### Decorator Pattern
In this project, I have used the Decorator pattern to add custom assertions to Selenide framework. The CustomAssertions class adds the ability to check width of web elements.

### Page Object Model (POM)
The Page Object Model is a design pattern used to create more maintainable and scalable test suites. In this project, I have used the POM pattern to encapsulate the functionality and elements of the web page in a separate class. 
