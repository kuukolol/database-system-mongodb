## **Student Database Management System**

This is a small Java project designed to serve as a simple **Student Database Management System**. It allows users to manage student records using **MongoDB** as the database backend. The project is a learning exercise aimed at exploring MongoDB's integration with Java for CRUD (Create, Read, Update, Delete) operations.

---

### **Features**
- **Add Students**: Insert new student records into the MongoDB database.
- **View Students**: Retrieve and display all student records from the database.
- **Update Student Records**: Update specific student details (name, year, section) based on their unique ID.
- **Delete Students**: Remove a student record from the database using their ID.

---

### **Project Structure**
```
|-- src/
|   |-- Main.java           # Entry point for the application
|   |-- StudentDatabase.java # Core class for database operations
|   |-- Student.java         # Data class representing a student
|   |-- studentSystem.java   # Interface for CRUD operations
|-- lib/                    # Folder containing MongoDB driver JARs
|   |-- bson-5.2.1.jar
|   |-- bson-record-codec-5.2.1.jar
|   |-- mongodb-driver-core-5.2.1.jar
|   |-- mongodb-driver-legacy-5.2.1.jar
|   |-- mongodb-driver-sync-5.2.1.jar
|-- README.md               # Documentation for the project
```

---

### **Sample Interaction**
Here’s an example of how the program works:

1. **Adding a Student**:
   ```
   Enter student name: John Doe
   Enter student ID: S101
   Enter student year: 2
   Enter student section: A
   Successfully added new student to the database.
   ```

2. **Viewing All Students**:
   ```
   ---List of Students---
   Name: John Doe
   ID: S101
   Year: 2
   Section: A
   --------------------
   ```

3. **Updating a Student**:
   ```
   Enter student ID to update: S101
   Enter new student name (leave empty to keep current): John D.
   Enter new student year (0 to keep current): 3
   Enter new student section (leave empty to keep current): B
   Successfully updated student info.
   ```

4. **Deleting a Student**:
   ```
   Enter student ID to delete: S101
   Student with ID S101 deleted.
   ```

---


### **License**
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).

---
