package Week1.exercises;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String username, password;
        int attemptRight = 3;
        int balance = 2000;
        Scanner input = new Scanner(System.in);

        while (attemptRight > 0) {
            //Get input
            System.out.println("Enter your username:");
            username = input.nextLine();
            System.out.println("Enter your password:");
            password = input.nextLine();
        //If credentials are correct
            if (username.equals("irmak@test.com") && password.equals("Patika!123.")) {
                System.out.println("Welcome!");
                int operation;
                // loop until user select 4 and exit.
                do {
                    System.out.println("Select an operation:\n1-Withdraw\n2-Deposit\n3-Balance Inquiry\n4-Exit");
                    operation = input.nextInt();
                    //do the operation according to the user input
                    switch (operation) {
                        case 1: {
                            System.out.println("Enter the amount you want to withdraw:");
                            int moneyWithdraw = input.nextInt();
                            if (moneyWithdraw > balance) {
                                System.out.println("Not enough credit");
                            } else {
                                //new balance
                                balance -= moneyWithdraw;
                                System.out.println("Balance: " + balance);
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the amount you want to deposit:");
                            int deposit = input.nextInt();
                            //new balance
                            balance += deposit;
                            System.out.println("Balance: " + balance);
                            break;
                        }
                        case 3: {
                            System.out.println("Balance: " + balance);
                            break;
                        }
                        case 4: {
                            System.out.println("Exiting...");
                            return;
                        }
                        default: {
                            System.out.println("Invalid operation");
                            break;
                        }
                    }
                } while (operation != 4);
            } else {
                //decrease attempt and if no attempt right left, blocked account.
                attemptRight--;
                System.out.printf("Invalid username or password! Remaining attempts: %d\n", attemptRight);
                if(attemptRight==0){
                    System.out.printf("Account is blocked");
                }
            }
        }
    }
}