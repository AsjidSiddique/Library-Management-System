# 📚 Library Management System (Admin Module)

**👨‍💻 Developer:** Asji Siddique  
**🔑 Login Credentials:**  
- **Username:** admin  
- **Password:** admin  

---

## 🎯 1. Objective & Introduction

**Objective:**  
Build a **Library Management System (Admin Module)** that enables administrators to manage books, students, and book borrowing transactions efficiently through a simple GUI.

### 🔍 Overview
- The system is designed without any database — all data is stored dynamically in memory using data structures.  
- Only **search by Book ID and Title** is implemented; there is **no category or sorting** functionality in the current version.  
- The system tracks:
  - 📦 Total Books  
  - 👥 Total Students  
  - 📖 Books Categories (represented simply by count but no detailed category management)  
  - ✅ Available Books  
  - 🔄 Borrowed Books  
- The Admin Dashboard uses clear, beautiful icons for intuitive navigation and statistics.

---

## 🛠️ 2. Tools and Technologies Used

- 💻 **Programming Language:** Java  
- 🛠️ **IDE:** NetBeans (with Swing GUI builder)  
- 🎨 **GUI Framework:** Java Swing  
- 💡 **Concepts:**  
  - Object-Oriented Programming (OOP) for clean class design (Book, Student, Transaction).  
  - Data Structures: Linked Lists for dynamic record management.  
  - Linear Search for record lookup by ID or Title (no sorting).

> ❗ **Note:** There is **no database or DB.java class** involved. All data is managed dynamically during runtime.

---

## 🏗️ 3. System Design

### 3.1 System Architecture

- The Admin Module is a standalone Java Swing application that manages book and student data fully in memory.  
- The dashboard shows live statistics with easy-to-read icons.

### 3.2 Class Design

- **Book Class:** Holds book ID, title, author, and availability status.  
- **Student Class:** Stores student ID, name, and borrowing status.  
- **Transaction Class:** Records borrow/return operations.  

### 3.3 Navigation and UI

- The sidebar menu uses expressive icons for navigation:
  - 🏠 Home  
  - 👥 Students Records  
  - ➕ Add Student  
  - 📚 Books Records  
  - ➕ Add Book  
  - 🔄 Borrow Book  
  - 📋 Books Transaction  

- The top bar displays current date/time and a logout button with clear iconography.

---

## 📂 4. Module Descriptions

### 4.1 📚 Book Management

- Add new books with ID and Title.  
- View all books and their availability status.  
- Search books by **Book ID or Title** (no sorting or category filtering).  
- Book Categories count is displayed but categories are not managed or editable.

### 4.2 👨‍🎓 Student Management

- Register new students with basic information.  
- View student list and their borrowed books count.

### 4.3 🔄 Borrow & Return Books

- Borrow books to students, updating availability status.  
- Return books to update records and availability.  
- Transactions are recorded dynamically.

---

## 🎨 5. Graphical User Interface (GUI)

### 5.1 Admin Dashboard

- Displays key stats with icons:  
  - 📦 Total Books  
  - 👥 Total Students  
  - 📚 Books Categories (count only)  
  - ✅ Available Books  
  - 🔄 Borrowed Books  
- Left sidebar with icon-labelled navigation buttons.  
- Top panel with current date/time and logout button.

### 5.2 Student Records & Add Student

- Forms to add students with icon-enhanced UI.  
- Lists student records with borrowing information.

### 5.3 Book Records & Add Book

- Forms to add new books by ID and Title only.  
- Lists all books with availability status and search feature by ID/Title.

### 5.4 Borrow Book Module

- Dropdowns with icons to select students and books for borrowing.  
- Borrow button to issue a book and update records.

---

## 🎉 6. Summary

This Admin Module of the Library Management System delivers a clean, icon-rich interface for managing library operations without a database. Its straightforward design focuses on:

- Managing books and students dynamically using Java data structures.  
- Searching books by ID or Title (no sorting or category filters).  
- Clear display of library stats using visually appealing icons.  
- Simple, intuitive navigation with icons to improve usability.  

This project serves as a solid foundation for future enhancements like sorting, detailed category management, and database integration.

---

**End of Document**  
**Developer:** Asji Siddique
