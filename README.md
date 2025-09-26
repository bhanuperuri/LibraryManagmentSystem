# 📚 Library Management System

A simple **Java-based Library Management System** built using **Object-Oriented Programming (OOP)** concepts.  
This console-based application allows adding books, registering users, issuing books, and returning them.

---

## 🚀 Features
- ➕ Add new books to the library  
- 👤 Add library users  
- 📖 Display all available books with their status  
- 📤 Issue books to users  
- 📥 Return issued books  
- ✅ Prevents issuing the same book twice  
- 🖥️ Interactive menu-driven console application  

---

## 🗂️ Project Structure
```

LibraryManagementSystem/
├─ src/
│  ├─ Book.java          # Represents a book
│  ├─ User.java          # Represents a library user
│  ├─ Library.java       # Handles library operations
│  └─ Main.java          # Entry point of the application
└─ .gitignore

````

---

## 🛠️ Technologies Used
- **Language:** Java  
- **IDE:** IntelliJ IDEA / VS Code  
- **Version Control:** Git & GitHub  
- **Concepts:** Classes, Objects, Encapsulation, Lists, Scanner for input  

---

## ⚙️ How to Run Locally
### 1. Clone the Repository
```bash
git clone https://github.com/bhanuperuri/LibraryManagmentSystem.git
````

### 2. Navigate to the Project Folder

```bash
cd LibraryManagmentSystem
```

### 3. Compile the Java Files

```bash
javac src/*.java
```

### 4. Run the Application

```bash
java -cp src Main
```

---

## 📋 Example Menu

```
===== Library Menu =====
1. Display Books
2. Issue Book
3. Return Book
4. Exit
```

---

## 📦 Sample Output

```
Book added: The Alchemist by Paulo Coelho (ISBN: ISBN101) [Available]
User added: User ID: 1, Name: Alice

===== Library Menu =====
1. Display Books
2. Issue Book
3. Return Book
4. Exit
Enter your choice: 2
Enter ISBN of book to issue: ISBN101
Enter User ID: 1
Book issued: The Alchemist to User ID: 1
```

---

## 🧑‍💻 Author

* **Bhanu Peruri**
* [GitHub Profile](https://github.com/bhanuperuri)

---
git add README.md
git commit -m "Add project README"
git push
````

Would you like me to add **screenshots** instructions to make the README more visually appealing?
