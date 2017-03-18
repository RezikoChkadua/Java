 ## Overview

 Create RESTful web-service for Loan Application management and scoring:

 LoanApplication when created consists of

  * Personal ID
  * First Name
  * Last Name
  * Birth Date
  * Employer
  * Salary
  * Total existing liabilities (payment per month)
  * Requested Amount
  * Requested Term

There should be ability to **List**, **Create** and **Delete** applications, to **Mark** applications as **Approved**, **Manual** or **Rejected** and to assign credit score to the application.

When applications are listed there should be a possibility to specify sorting field and order (ASC/DESC).

### Scoring

Each application can be assigned a score which is calculated as follows:

`Score = (Sum of last name letter positions in the alphabet (a = 1, z = 26)) + Salary * 2 - Liabilities * 3 + (year of birth) - (month of birth) - (Julian day of the year of birth (1st Feb = 32, etc.))`
114 + 5000 - 1500 + 1987 - 4 - 120

When scoring is applied, if score is < 4500, application should be rejected, if it is > 5000, application should be approved, otherwise marked as manual.

## Technologies

Language: Java or Kotlin

RDBMS: preferrably: any embedded SQL database via JPA, otherwise: any embedded/in-memory storage

Project Management: preferrably: Gradle, otherwise: Maven

Tests: preferrably Spock, otherwise JUnit


## Other Requirements

Solution should be submitted as a link to a bitbucket or github repository which has this file as a README.

The solution should be submitted before the deadline stated in the email and it is okay to send it incomplete, just make it runnable and implement as many requirements as you can within the allocated time.

If you are willing, you can use the next day to complete the task and notify us about it before 21:00. So you have two check points 21:00 of due date and 21:00 the next day.

## Bonus requirements

Create front-end, any web or java based approach would do (HTML5/JavaScript, javafx, swing, etc.).