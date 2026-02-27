import java.util.Scanner;


public class Main {
    static void main() {

        System.out.println("Enter your password:");
        Scanner scaner = new Scanner(System.in);
        String password = scaner.nextLine();
        if(PasswordValidator.isValid(password)){
            System.out.println("Your password is valid");
        }
        else {System.out.println("Your password is invalid");}

    }
}

