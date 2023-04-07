# Simple CRUD-Student-Management

This is a simple CRUD (Create, Read, Update, Delete) application built with Spring Boot and DataJPA, which allows users to perform basic operations on a database.

## Prerequisites
To build and run this project, you need to have the following installed:

- Java 8
- Spring Boot
- DataJPA
- MySQL
- Maven
- MySQL Workbench

## Usage
The API endpoints available are:

- GET /studentList - Returns a list of all students
- GET /users/{id} - Returns a specific user by their ID
- POST /saveStudent - Creates a new student
- PUT /updateStudent - Updates an existing student by their ID
- DELETE /deleteStudent/{studentId} - Deletes a student by their ID

