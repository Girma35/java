# Bank Account Class

This repository contains a Java class named `BankAccount` that represents a simple bank account. The class provides functionality to deposit, withdraw, and retrieve account information. Additionally, it includes the ability to calculate interest.

## Part 1: Creating a Bank Account Class

1. Create a new Java class named `BankAccount`.
2. Define the following attributes (member variables) to represent a bank account:
   - `accountNumber` (String)
   - `balance` (double)
   - `customerName` (String)
3. Implement a constructor that takes three arguments: `accountNumber`, `customerName`, and an initial `balance`. This constructor initializes the corresponding attributes of the object.

## Part 2: Adding Functionality with Methods

1. Create a method named `deposit` that takes an amount (double) as input and adds it to the account balance.
2. Create a method named `withdraw` that takes an amount (double) as input and subtracts it from the account balance, but ensures the balance doesn't go negative (print an error message if insufficient funds).
3. Create a method named `getAccountInfo` that returns a formatted string containing the account number, customer name, and current balance.

## Part 3: Testing Your BankAccount Class

1. In your `main` method, create two `BankAccount` objects with different account details and initial balances.
2. Use the `deposit` method to add some amount to each account.
3. Try to withdraw an amount exceeding the balance from one account and observe the behavior.
4. Use the `getAccountInfo` method to display the account information for both objects.

## Part 4: Adding Interest

1. Modify your class to include an attribute `interestRate` (double).
2. Implement a method named `calculateInterest` that calculates the interest earned based on the balance and interest rate.
3. Modify the `deposit` method to optionally accept an additional parameter for interest earned (can be 0.0 by default) and add it to the balance before any other deposits.

Feel free to explore and utilize the `BankAccount` class to practice and learn Java programming related to bank account management.
