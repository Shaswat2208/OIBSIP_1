
```markdown
# Online Reservation System (Java)

This repository contains a simple command-line based Online Reservation System implemented in Java.

## Description

The Online Reservation System allows users to log in, make reservations, cancel reservations, and exit the system. User authentication is based on predefined credentials stored in memory. Reservations are stored using a PNR (Passenger Name Record) system and include details such as passenger name, train details, class type, date of journey, and journey route.

## Features

- **Login System**: Authenticate users using predefined credentials.
- **Reservation**: Book a train reservation specifying train number, class type, date of journey, and journey details.
- **Cancellation**: Cancel a reservation using the generated PNR.
- **Interactive Menu**: Users interact with the system via a command-line menu.

## Usage

To use the Online Reservation System:

1. **Clone** the repository to your local machine.
2. **Compile** the `OnlineReservationSystem.java` file.
   ```
   javac OnlineReservationSystem.java
   ```
3. **Run** the compiled program.
   ```
   java OnlineReservationSystem
   ```
4. Follow the prompts to log in, make reservations, and cancel reservations.

## Example

Here's a brief example of how the system operates:

```
Welcome to Online Reservation System
Enter username: user1
Enter password: password1
Login successful!

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 1

Reservation System
Please fill out the following details:
Enter your name: John Doe
Enter train number: Train1
Enter class type: 1st Class
Enter date of journey (DD/MM/YYYY): 12/06/2024
Enter journey from (place): A
Enter journey to (destination): B

Reservation successful!
PNR Number: PNR123
Details:
John Doe: Sample Train Name, 1st Class, 12/06/2024, A to B

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 2

Cancellation System
Enter PNR number for cancellation: PNR123
Details for PNR PNR123:
John Doe: Sample Train Name, 1st Class, 12/06/2024, A to B
Press OK to confirm cancellation (yes/no): yes
Reservation with PNR PNR123 has been cancelled.

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 3

Thank you for using Online Reservation System. Goodbye!
```

## Author

This program is developed by Shaswat Swarup Sahoo.

Feel free to explore, modify, and use this Online Reservation System for learning or practical purposes.
```
