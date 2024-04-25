package Week1.exercises;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args){
        String validUsername = "patika@test.com";
        String validPassword = "patika.!12";
        String resetPassword;
        String newPassword;

        Scanner input = new Scanner(System.in);
        // Get the username
        System.out.println("Username: ");
        String username = input.nextLine();

        //Get the password
        System.out.println("Password: ");
        String password = input.nextLine();

        /*If username is not correct, we will not check password either,
        username must be correct for the reset operation*/
        if(!(username.equals(validUsername))){
            System.out.println("Please enter a valid username.");
        }
        /*If username and password is correct, user is logged in*/
        else if(username.equals(validUsername) && password.equals(validPassword)){
            System.out.println("Succesfully logged in.");
        }

        /*If username is correct but password is wrong, ask for the new  password*/
        else if (username.equals(validUsername) && !(password.equals(validPassword))){
            System.out.println("Do you want to reset your password?: ");
            System.out.println("Y\nN");
            resetPassword = input.nextLine().toUpperCase();

            if(resetPassword.equals("Y")){
                System.out.println("Enter your new password: ");
                newPassword = input.nextLine();
                    if(newPassword.equals(validPassword)){
                        System.out.println("You should enter a password which is not same with the previous. " +
                                "Please enter a different password!");
                    }
                    else{
                        System.out.println("New password is created.");
                    }
            }
            //If user does not want to reset it, it will not reset.
            else{
                System.out.println("The reset password operation will not be performed.");
            }
        }
    }
}
