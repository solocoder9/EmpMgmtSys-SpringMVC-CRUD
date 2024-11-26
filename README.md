# 🏢 Employee Management System

Employee Management System is a Java-based web application that allows administrators to manage employee records efficiently. The system supports adding, viewing, updating, and deleting employee information and includes user authentication for secure access. It is built using Spring MVC, Spring ORM (Hibernate), MySQL, JSP, Bootstrap, and Maven.

## Table of Contents

- [🌟 Features](#features)
- [💻 Technologies Used](#technologies-used)
- [🛠️ Setup Instructions](#setup-instructions)
- [🚀 Usage](#usage)
- [🤝 Contributing](#contributing)
- [📝 License](#license)

## 🌟 Features

1. **Employee Management:**
   - **Add Employee:** Allows administrators to add new employees with details like name, email, department, and salary.
   - **View All Employees:** Displays a list of all employees in the system.
   - **View Employee Details:** Enables administrators to view detailed information of a single employee by ID.
   - **Update Employee Information:** Allows updating of existing employee records.
   - **Delete Employee:** Enables the removal of employee records from the system.

2. **User Authentication:**
   - Secure login functionality for administrators.

3. **Responsive UI:**
   - Designed with Bootstrap for a user-friendly and responsive interface.

4. **Database Integration:**
   - Uses Hibernate ORM for seamless interaction with a MySQL database (`employee_mgmt_db`).

5. **MVC Architecture:**
   - Built with Spring MVC for clean separation of concerns and maintainability.

## 💻 Technologies Used

- Java
- Spring MVC
- Spring ORM (Hibernate)
- MySQL
- JSP
- Bootstrap
- Maven

## 🛠️ Setup Instructions

Follow these steps to set up the **Employee Management System** on your local environment:

1. **Prerequisites:**
   - JDK (Java Development Kit) installed.
   - MySQL installed with a database named `employee_mgmt_db`.
   - Maven installed.
   - Eclipse IDE (or any Java IDE) installed.

2. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/EmployeeMgmtSystem.git
   ```

3. **Import the Project into Eclipse:**
   - Open Eclipse IDE.
   - Select `File` > `Import` > `Existing Maven Projects`.
   - Browse to the cloned repository and select the project.

4. **Configure MySQL Database:**
   - Ensure MySQL server is running.
   - Create a database named `employee_mgmt_db`:
     ```sql
     CREATE DATABASE employee_mgmt_db;
     ```
   - Add a table for employees with fields such as ID, name, email, department, and salary.

5. **Modify Hibernate Configuration:**
   - Open the `hibernate.cfg.xml` file in the project directory.
   - Update the database connection details (URL, username, password) according to your MySQL setup.

6. **Run the Application:**
   - Right-click the project in Eclipse and select `Run As` > `Run on Server`.
   - Access the application in your browser at `http://localhost:8080/EmployeeMgmtSystem`.

## 🚀 Usage

1. **Home Page:**
   - Navigate to the application URL. The home page will display the available options.

2. **Add a New Employee:**
   - Click on "Add Employee" and fill in the required fields to add a new employee.

3. **View Employees:**
   - Click on "View All Employees" to see a list of employees or search for a specific employee by ID.

4. **Update Employee Information:**
   - Select an employee to update and modify the necessary fields.

5. **Delete Employee:**
   - Select an employee to delete from the list.

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -am 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Create a new Pull Request.

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.
