import java.util.Scanner;


public class Main {
    static void main() {
        String password;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
            if(!PasswordValidator.isValid(password)){
                System.out.println("Your password is invalid");
                if((PasswordValidator.WhyNotValid(password)&1)!=0)
                    { System.out.println("Password length minimum 8 characters");}
                if((PasswordValidator.WhyNotValid(password)&(1<<1))!=0)
                    { System.out.println("At least one digit");}
                if((PasswordValidator.WhyNotValid(password)&(1<<2))!=0)
                    { System.out.println("At least one uppercase letter and one lowercase letter");}
                if((PasswordValidator.WhyNotValid(password)&(1<<3))!=0)
                    { System.out.println("At least one special character");}
                if((PasswordValidator.WhyNotValid(password)&(1<<4))!=0)
                    { System.out.println("This password is common password");}
            }
        }
        while (!PasswordValidator.isValid(password));
        System.out.println("Your password is valid");

    }
}

