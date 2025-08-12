# 1.🚗 Car Inventory System

This is a **Car Inventory System** built using **Object-Oriented Programming (OOP)** concepts in Java.  
The application helps manage car details, validate input using **Regular Expressions**, and handle errors using **Exception Handling**.

---

## 📖 About the Project
The **Car Inventory System** allows users to:
- Add new cars to the inventory.
- View all cars currently in the system.
- Search for cars by their registration number.
- Validate inputs (fuel type, registration number, year, etc.).
- Navigate through a **menu-driven interface** using `switch-case`.

It’s designed for **learning purposes**, but follows **industry-standard coding practices** like encapsulation, clean code structure, and modular design.

---

## 🛠️ Features
- **Add Car Details**  
  (Name, Year, Price, Fuel Type, Registration Number)
- **Data Validation**  
  - Regex-based validation for registration numbers  
  - Fuel type restriction to `Petrol` or `Electric`
- **Switch-Case Menu** for easy navigation
- **Getter & Setter** methods for encapsulation
- **Custom Exceptions** for invalid inputs
- **User-friendly Console Output**

---

## 📂 Project Structure
CarInventorySystem/
├── Car.java                   # POJO class for car details
├── Constant.java              # Stores constant values (e.g., regex patterns)
├── CustomException.java       # Defines user-defined exceptions
├── Inventory.java             # Contains main inventory logic and main method
└── README.md                  # Project documentation
---

## 🖥️ Technologies Used
- **Java (JDK 8 or higher)**
- **OOP Concepts** (Encapsulation, Abstraction)
- **Regular Expressions (Regex)**
- **Custom Exceptions**
---

## ▶️ How to Run
   ```bash
   git clone https://github.com/your-username/CarInventorySystem.git
   cd CarInventorySystem
   java Inventory.java
   ```
## 📌Example Menu
- TaskList:
1.Add Car Details(Name,Year,Price,FuelStatus(P/E),Registration No.)
2.Remove the Car Details by Registration No.
3.Show the list of Cars
4.Show the list of Petrol Cars
5.Show the list of electric Cars
0.Exit

## 📊Sample Output

1
Enter the Car name:
Honda EV
Enter the year:
2023
Enter the Price:
1200000
Enter the FuelStatus:(Petrol= P | Electric= E)
E
Enter the Registration No.:
MH23GH3456
Car Added...



   
