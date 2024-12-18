# UTI Project API

This project is a Spring Boot RESTful API for managing UTI project details. It supports CRUD operations for project details stored in a MySQL database.

## Features

- **Add Project Details**: Add single or multiple project details.
- **Retrieve Project Details**: Get all project details or fetch by ID.
- **Update Project Details**: Update existing project details.
- **Delete Project Details**: Remove project details by ID.

## Technologies Used

- **Spring Boot**
- **Java 17**
- **MySQL**
- **Maven**
- **Lombok**

## Architecture Overview

This project follows a layered architecture comprising the following components:

### 1. Controller  
The controller handles incoming HTTP requests and delegates them to the service layer.  
It exposes endpoints for CRUD operations:
- **POST** `/addDetail` to add a single detail.  
- **POST** `/addDetails` to add multiple details.  
- **GET** `/Details` to fetch all details.  
- **GET** `/DetailsByID/{id}` to fetch details by ID.  
- **PUT** `/update` to update existing details.  
- **DELETE** `/delete/{id}` to delete details by ID.  

### 2. Service  
The service layer contains the business logic of the application. It interacts with the repository to:
- Save new project details.
- Fetch details from the database.
- Update existing details.
- Delete details by ID.  

The service layer ensures separation of concerns by acting as an intermediary between the controller and the repository.  

### 3. Entity  
The entity represents the data model used by the application.  
- Defined as a JPA entity with the `@Entity` annotation.  
- Mapped to a MySQL table named `UTI_PROJECT_DETAILS`.  
- Contains fields like `id`, `Team_members`, and `Role`.  

### 4. Repository  
The repository layer handles interactions with the database using Spring Data JPA.  
- Extends `JpaRepository` to provide built-in CRUD operations.  
- Simplifies database access with minimal custom code.  

## Prerequisites

- **Java 17 or higher**
- **MySQL database**
- **Maven**
- **Git**

