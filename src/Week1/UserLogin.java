package Week2;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args){
        String validUsername = "patika@test.com";
        String validPassword = "patika.!12";
        int resetPassword;
        String newPassword;

        Scanner input = new Scanner(System.in);
        // Get the username
        System.out.println("Username: ");
        String username = input.nextLine();

        //Get the password
        System.out.println("Password: ");
        String password = input.nextLine();

        if(username.equals(validUsername) && password.equals(validPassword)){
            System.out.println("Succesfully logged in.");
        }
        else if (username.equals(validUsername) && !(password.equals(validPassword))){
            System.out.println("Do you want to reset your password?: ");
            System.out.println("1-Yes\n2-No");
            resetPassword = input.nextInt();

            if(resetPassword==1){
                int i=0;
                System.out.println("Enter your new password: ");
                newPassword = input.nextLine();
                newPassword = input.nextLine();
                //User can enter a not valid password for three times during the reset password operation.
                while(i<3){
                    if(newPassword.equals(validPassword)){
                        i++;
                        System.out.println("You should enter a password which is not same with the previous. " +
                                "Please enter a different password:");
                        newPassword = input.nextLine();

                    }
                    else{
                        System.out.println("New password is created.");
                        break;
                    }
                }

            }
            else{
                System.out.println("The reset password operation will not be performed.");
            }
        }
        else{
            System.out.println("Please enter a valid username.");
        }
    }
}
