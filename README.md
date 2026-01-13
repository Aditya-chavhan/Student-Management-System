# 🎓 Student Management System

A **full-stack Student Management System** built using **Java, Spring Boot, MySQL, and Thymeleaf**.  
This project allows users to **add, view, update, and delete student records** using a clean MVC architecture.

---

## 🚀 Features

- Add new students  
- View all students  
- Update student details  
- Delete student records  
- MVC architecture  
- MySQL database integration  
- Thymeleaf-based UI  

---

## 🛠️ Tech Stack

| Layer       | Technology |
|------------|------------|
| Backend    | Java, Spring Boot |
| Frontend   | Thymeleaf |
| Database   | MySQL |
| ORM        | Spring Data JPA |
| Build Tool | Maven |

---

## 📁 Project Structure

StudentManagementSystem/
│

├── pom.xml

│

├── src/main/java/com/student/management/

│ ├── StudentManagementSystemApplication.java

│ │

│ ├── controller/

│ │ └── StudentController.java

│ │

│ ├── service/

│ │ ├── StudentService.java

│ │ └── StudentServiceImpl.java

│ │

│ ├── repository/

│ │ └── StudentRepository.java

│ │

│ └── model/

│ └── Student.java

│

└── src/main/resources/

├── application.properties

└── templates/

├── index.html

├── add_student.html

└── update_student.html


---

## ⚙️ Prerequisites

- Java 17+
- Maven
- MySQL
- VS Code / IntelliJ IDEA

---

## 🧩 Database Setup

1. Start MySQL server  
2. Create database:

```sql
CREATE DATABASE student_db;
```

## ▶️ How to Run the Project

1. Open the project folder in VS Code

2. Ensure MySQL is running

3. Run the application:
```bash
mvn spring-boot:run
```

Open browser and visit:
```ardiuno
http://localhost:8080
```
