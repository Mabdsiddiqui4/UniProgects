package SingleUserATMSimulation;

import java.util.Scanner;

public class SingleUserATMSimulation_PART1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        double b = 100.0; // balance .
        int p = 1234; // PIN. double MaxDeposit = 5000.0; // Maximum daily of deposit
        double Tl = 0.0, Tll = 0.0, Tlll = 0.0;
        double MaxDeposit = 5000.0; // Maximum daily of deposit
        double MaxWithdrawal = 4000.0; // Maximum daily of withdrawal
        System.out.println("Welcome to the ATM Simulation! .");// this is for welcome
        System.out.println("Please enter your (PIN):");
        //int pin = in.nextInt();
        boolean ispin = authenticateUser(p);
        while (ispin && !exit) {
            options();
            int c = in.nextInt(); // This is a user choice in the options
            switch (c) {
                case 1:  // for print balens. Balance Inquiry
                    displayBalance(b);
                    break;
                case 2:  // Cash Deposit.
                    System.out.print("Enter the amount to deposit: ");
                    double ind = in.nextDouble(); // in deposit user 
                    if (chak(ind, MaxDeposit)) {
                        b = deposit(ind, b);
                        MaxDeposit -= ind;
                        Tlll = Tll;
                        Tll = Tl;
                        Tl = ind;
                    } else {
                        System.out.print("Your daily deposit limits is : $" + MaxDeposit + "$.or invalid amount");
                    }

                    break;
                case 3: // Cash Withdrawal.
                    System.out.print("Enter the amount to Withdrawal: ");
                    double outW = in.nextDouble(); // out Withdrawal user 
                    if (chak(outW, MaxWithdrawal) && (outW <= b)) {
                        b = withdraw(outW, b);
                        MaxWithdrawal -= outW;
                        Tlll = Tll;
                        Tll = Tl;
                        Tl = -outW;
                    } else {
                        System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
                    }
                    break;
                case 4: // Change PIN
                    System.out.print("Enter your current PIN:");
                    int oldPin = in.nextInt();
                    if (chakOldPin(p, oldPin)) {
                        System.out.print("Enter your new 4-digit PIN:");
                        int newPIN = in.nextInt();
                        while (!changePIN(p, newPIN)) {
                            System.out.println("Invalid PIN. Must be 4 digits ");
                            System.out.print("Enter your PIN:");
                            newPIN = in.nextInt();
                        }
                        p = newPIN;
                        System.out.println("PIN successfully changed.");
                    } else { // if user put wronge PIN .
                        System.out.println("your current PIN wronge.");
                    }
                    break;
                case 5: // Mini Statement.
                    printMiniStatement(Tl, Tll, Tlll);
                    break;
                case 6: // Exit.
                    exit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("wrong choice.");
            }
        }

    }

    public static boolean authenticateUser(int actualPIN) {
        Scanner in = new Scanner(System.in);
        int r = 0;// when he wrong.
        while (r < 5) {
            // System.out.println("Please enter your PIN:");
            int userpin = in.nextInt();
            r++;
            if (userpin == actualPIN) {
                return true;
            } else {
                System.out.println("wrong pin re-pin! you have chanse:" + (5 - r));
            }
        }
        return false;
    }

    public static void options() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Balance Inquiry");
        System.out.println("2. Cash Deposit");
        System.out.println("3. Cash Withdrawal");
        System.out.println("4. Change PIN");
        System.out.println("5. Mini Statement");
        System.out.println("6. Exit");
        System.out.print("Choose an option: ");
    }

    public static void displayBalance(double balance) {
        System.out.println("balance is : $" + balance);
    }

    public static boolean chak(double amount, double max) {
        return (amount > 0 && amount <= max);
    }

    public static double deposit(double amount, double balance) {
        double newb = balance + amount;
        System.out.println("Successfully deposited $" + amount + ". New balance: $" + newb);
        return newb;
    }

    public static double withdraw(double amount, double balance) {
        double newb = balance - amount;
        System.out.println("Successfully Withdrawal $" + amount + ". New balance: $" + newb);
        return newb;
    }

    public static boolean changePIN(int oldPIN, int newPIN) {
        int digitCount = 0;
        int tempPIN = newPIN;

        while (tempPIN > 0) {
            tempPIN /= 10;  // Remove last digit
            digitCount++;    // Count digit
        }
        return digitCount == 4;
    }

    public static boolean chakOldPin(int PIN, int oldPIN) {
        return (PIN == oldPIN);
    }

    public static void printMiniStatement(double t1, double t2, double t3) {
        System.out.println("Mini Statement:");
        System.out.println(" 1. $" + t1);
        System.out.println(" 2. $" + t2);
        System.out.println(" 3. $" + t3);
    }
}
