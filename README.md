# plainselenium
This is a sample of a lightweight Selenium WebDriver-based end-to-end test automation framework.
The framework supports parallel test execution and implements the Page Object pattern in a graceful way allowing to create self-explainable tests with less code.
The sample is designed in a way so WebDriver instance is available neither in the test classes nor in the page classes, that forces the automation engineer to follow the page object paradigm, use utility methods and allows to avoid code duplication.


The project is in active development. Please check the [list of features](https://github.com/flodek/plainselenium/issues) to be implemented yet.

## Tech Stack
* Java 11 (why not :))
* Selenium WebDriver
* TestNG

## Usage
Make sure you have Java 11 and maven installed. Execute **mvn clean test** command.

Do not forget to put driver executable files in the root folder of the project.
