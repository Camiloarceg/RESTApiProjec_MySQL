# REST API Project with MySQL

This project is a simple and clean implementation of a RESTful API for managing `Student` entities using Spring Boot. It demonstrates full CRUD (Create, Read, Update, Delete) operations and persists data in a MySQL database. It is designed to serve as a learning project or a base template for larger applications.

## Features

- Full CRUD operations for `Student` entities
- RESTful architecture using Spring Boot
- MySQL integration for data persistence
- JPA for ORM (Object Relational Mapping)
- Clean and modular code structure

## Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman (for testing the endpoints)

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 17 or later
- Maven
- MySQL Server
- IDE of your choice (e.g., IntelliJ IDEA, Eclipse)
- Postman or similar API testing tool

### Setup Instructions

1. **Clone the Repository**

```
git clone https://github.com/Camiloarceg/RESTApiProjec_MySQL.git
cd RESTApiProjec_MySQL
```

2. **Configure MySQL Database**

- Create a database named `studentdb` (or your preferred name).
- Update the `application.properties` file located in `src/main/resources/` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3. **Build and Run the Project**

```bash
./mvnw spring-boot:run
```

Or run it directly from your IDE.

### API Endpoints

| Method | Endpoint            | Description         |
|--------|---------------------|---------------------|
| GET    | /students           | Get all students    |
| GET    | /students/{id}      | Get student by ID   |
| POST   | /students           | Create new student  |
| PUT    | /students/{id}      | Update a student    |
| DELETE | /students/{id}      | Delete a student    |

### Example JSON

```json
{
  "firstName": "Juan",
  "lastName": "Perez",
  "email": "juan.perez@example.com"
}
```
## Author

Camilo Arce
