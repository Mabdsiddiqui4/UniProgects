package SingleUserATMSimulation;

import java.util.Scanner;

public class MultiUserATMSimulation_PART2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int[] accountNumbers = {1001, 1002, 1003}; //  0   ,  1   ,  2
        int[] PINs = {1234, 1111, 2222};
        double[] balances = {100.0, 150.0, 200.0}; // 1001 , 1002 , 1003
        double[] depositTotals = {0.0, 0.0, 0.0};  // 1001 , 1002 , 1003
        int[] withdrawalCounts = {0, 0, 0};        // 1001 , 1002 , 1003
        double[] MaxDeposit = {1000.0, 1000.0, 1000.0};
        double[] MaxWithdrawal = {1000.0, 1000.0, 1000.0};
        double[] transactions = new double[8];  //  1001,1001,1001,1002,1002,1002,1003,1003,1003 
        System.out.println("Welcome to the ATM Simulation!");
        while (!exit) {
            System.out.print("Enter your account number:");
            int acc = in.nextInt();
            while (findAccount(acc, accountNumbers) == -1) {
                System.out.println("No account in this number.");
                System.out.print("Enter your account number:");
                acc = in.nextInt();
            }
            System.out.print("Enter your PIN:");  //   PIN 
            int pin = in.nextInt();
            int attempts = 0;
            while (!validateUser(acc, PINs, pin) && attempts < 5) {
                attempts++;
                if (attempts < 5) {
                    System.out.println("Incorrect PIN. Try again. Remaining attempts: " + (5 - attempts));
                    System.out.print("Enter your PIN:");
                    pin = in.nextInt();
                } else {
                    System.out.println("Too many incorrect attempts. Account locked.");
                    exit = true;
                    break;
                }
            }
            while (!exit) {
                menu();
                int c = in.nextInt();

                switch (c) {
                    case 1:  // for print balens. Balance Inquiry
                        displayBalance(acc, balances);
                        break;
                    case 2:  // Cash Deposit.
                        System.out.print("Enter the amount to deposit: ");
                        double ind = in.nextDouble(); // in deposit user 
                        if (ind > 0) {
                            updateTransactions(transactions, acc, ind);
                            balances[acc] += ind;
                            depositTotals[acc] += ind;
                            System.out.println("Successfully deposited $" + ind + ". New balance: $" + balances[acc]);
                        } else {
                            System.out.println(" invalid amount. Deposit failed.");
                        }
                        break;
                    case 3: // Cash Withdrawal.
                        System.out.print("Enter the amount to Withdrawal: ");
                        double outW = in.nextDouble(); // out Withdrawal user 
                        if (outW > 0 && outW < balances[acc]) {
                            updateTransactions(transactions, acc, -outW);
                            balances[acc] -= outW;
                            depositTotals[acc] -= outW;
                            withdrawalCounts[acc]++;
                            System.out.println("Successfully Withdrawal $" + outW + ". New balance: $" + balances[acc]);
                        } else {
                            System.out.println("Insufficient balance or invalid amount. Withdrawal failed.");
                        }
                        break;
                    case 4: // Change PIN
                        System.out.print("Enter your current PIN:");
                        int oldPin = in.nextInt();
                        if (PINs[acc] == oldPin) {
                            System.out.print("Enter your new 4-digit PIN:");
                            int newPIN = in.nextInt();
                            while (!changePIN(PINs, newPIN, acc)) {

                                System.out.println("Invalid PIN. Must be 4 digits  ");
                                System.out.print("Enter your PIN:");
                                newPIN = in.nextInt();
                            }

                        } else { // if user put wronge PIN .
                            System.out.println("your current PIN wronge.");
                        }
                        break;
                    case 5:
                        printMiniStatement(transactions, acc);
                        break;
                    case 6: // Transfer Funds
                        System.out.print("Enter the target account number:");
                        int ac = in.nextInt();  //  other account number 
                        ac = findAccount(ac, accountNumbers); // Other account index
                        if (ac == -1) {
                            System.out.println("No account in this number.");
                            break;
                        }
                        System.out.print("Enter the amount to transfer:");
                        double amount = in.nextInt(); // Use double for transfer amount
                        if (amount > balances[acc]) {
                            System.out.println("Insufficient balance. Transfer failed.");
                            break;
                        }
                        transferFunds(acc, ac, amount, balances, accountNumbers);
                        updateTransactions(transactions, acc, -amount);
                        updateTransactions(transactions, ac, amount);

                        System.out.println("Successfully transferred $" + amount + " to account " + accountNumbers[ac]);
                        break;
                    case 7:  // Find Top Depositor
                        int TopDepositor = findTopDepositor(depositTotals);
                        System.out.println("Top depositor is account with ID: " + TopDepositor);
                        break;
                    case 8:  // Find Frequent Withdrawer
                        int fw = findFrequentWithdrawer(withdrawalCounts);
                        System.out.println("Most frequent withdrawer is user with ID: " + fw);
                    case 9: //Switch Account
                        break;
                    case 10: // Exit
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                if (c == 9) {
                    break;
                }
            }

        }

    }

    static int findAccount(int accountNumber, int[] accountNumbers) {
        for (int i = 0; i < accountNumbers.length; i++) {
            if (accountNumbers[i] == accountNumber) {
                return i;  // Return the index of the account
            }
        }
        return -1;  // Account not found
    }

    public static void displayBalance(int accountIndex, double[] balances) {
        System.out.printf("Your current balance is: $%.2f\n", balances[accountIndex]);  // if you want i can put this in the other mathoth
    }

    //public static int findAccount(int accountNumber, int[] accountNumbers) {
    //}
    public static void menu() {
        System.out.print("\nATM Menu:\n"
                + "1. Check Balance\n"
                + "2. Deposit Cash\n"
                + "3. Withdraw Cash\n"
                + "4. Change PIN\n"
                + "5. Mini Statement\n"
                + "6. Transfer Funds\n"
                + "7. Find Top Depositor\n"
                + "8. Find Frequent Withdrawer\n"
                + "9. Switch Account\n"
                + "10. Exit\n"
                + "Enter your choice: ");
    }

    public static boolean validateUser(int accountIndex, int[] PINs, int enteredPIN) {
        for (int i = 0; i < 3; i++) {
            if (PINs[i] == enteredPIN) {
                return true;
            }
        }
        return false;
    }

    public static void updateTransactions(double[] transactions, int userId, double amount) {
        switch (userId) {
            case 0:
                transactions[2] = transactions[1];
                transactions[1] = transactions[0];
                transactions[0] = amount;
                break;
            case 1:
                transactions[5] = transactions[4];
                transactions[4] = transactions[3];
                transactions[3] = amount;
                break;
            default:
                transactions[8] = transactions[7];
                transactions[7] = transactions[6];
                transactions[6] = amount;
                break;
        }
    }

    public static boolean changePIN(int[] oldPIN, int newPIN, int acc) {
        int digitCount = 0;
        int tempPIN = newPIN;

        while (tempPIN > 0) {
            tempPIN /= 10;  // Remove last digit
            digitCount++;    // Count digits
        }
        if (digitCount != 4) {
            return false;
        }
        oldPIN[acc] = newPIN;
        System.out.println("PIN successfully changed.");
        return true;
    }

    public static void transferFunds(int fromIndex, int toIndex, double amount, double[] balances, int[] accountNumbers) {
        balances[fromIndex] -= amount;
        balances[toIndex] += amount;
    }

    public static void printMiniStatement(double[] transactions, int userId) {
        switch (userId) {
            case 0:
                System.out.println("Mini Statement:");
                System.out.println(" 1. $" + transactions[0]);
                System.out.println(" 2. $" + transactions[1]);
                System.out.println(" 3. $" + transactions[2]);
                break;
            case 1:
                System.out.println("Mini Statement:");
                System.out.println(" 1. $" + transactions[3]);
                System.out.println(" 2. $" + transactions[4]);
                System.out.println(" 3. $" + transactions[5]);
                break;
            default:
                System.out.println("Mini Statement:");
                System.out.println(" 1. $" + transactions[6]);
                System.out.println(" 2. $" + transactions[7]);
                System.out.println(" 3. $" + transactions[8]);
                break;
        }
    }

    public static int findTopDepositor(double[] depositTotals) {
        double max = depositTotals[0];
        int topDepositor = 0;
        for (int i = 1; i < depositTotals.length; i++) {
            if (depositTotals[i] > max) {
                max = depositTotals[i];
                topDepositor = i;
            }
        }
        switch (topDepositor) {
            case 0:
                topDepositor = 1001;
                break;
            case 1:
                topDepositor = 1002;
                break;
            default:
                topDepositor = 1003;
                break;
        }
        return topDepositor;
    }

    public static int findFrequentWithdrawer(int[] withdrawalCounts) {
        double max = withdrawalCounts[0];
        int wtco = 0;
        for (int i = 1; i < withdrawalCounts.length; i++) {
            if (withdrawalCounts[i] > max) {
                max = withdrawalCounts[i];
                wtco = i;
            }
        }
        int[] accountNumbers = {1001, 1002, 1003};
        return accountNumbers[wtco];
    }

}
