# Online Reservation System

This repository contains a simple command-line based Online Reservation System implemented in Java. This system allows users to authenticate, make reservations, cancel reservations, and manage train booking details.

## Features

- **Authentication:** Users can log in using predefined credentials.
- **Reservation:** Users can make reservations by providing necessary details such as name, train number, class type, date of journey, and journey details.
- **Cancellation:** Users can cancel their reservations by providing the PNR (Passenger Name Record) number.
- **Data Storage:** Uses `HashMap` to store credentials and reservations.

## Usage

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Shaswat2208/OIBSIP_1.git
   cd OIBSIP_1
   ```

2. **Compile the Java program:**
   ```bash
   javac OnlineReservationSystem.java
   ```

3. **Run the program:**
   ```bash
   java OnlineReservationSystem
   ```

4. **Follow the on-screen instructions to use the Online Reservation System.**

## Example

```plaintext
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
PNR Number: PNR3
Details:
John Doe: Sample Train Name, 1st Class, 12/06/2024, A to B

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 2

Cancellation System
Enter PNR number for cancellation: PNR3
Details for PNR PNR3:
John Doe: Sample Train Name, 1st Class, 12/06/2024, A to B
Press OK to confirm cancellation (yes/no): yes
Reservation with PNR PNR3 has been cancelled.

Main Menu:
1. Make a Reservation
2. Cancel Reservation
3. Exit
Enter your choice: 3
Thank you for using Online Reservation System. Goodbye!
```

## Contributing

Contributions are welcome! Please feel free to fork the repository and submit pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
