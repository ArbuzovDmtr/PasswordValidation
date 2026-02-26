public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min){
        return password.length() >= min;
    };

    public static boolean containsDigit(String password){
        String number="0123456789";
        for(int i=0; i<password.length();i++){
            if(number.contains(""+password.charAt(i))){
                return true;
            }
        }
        return false;
    };
    public static boolean containsUpper(String password) {
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }

        } return false;
    }
    public static boolean containsLower(String password) {
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(password.charAt(i))){
                return true;
            }

        } return false;
    }
    public static boolean containsUpperAndLower(String password){
        return containsLower(password)&&containsUpper(password);};

    public static boolean isCommonPassword(String password){
        String [] ListOfCommonPasswords ={"123456","admin","12345678","password",
                "admin123","root","passwort","abc123","qwerty","654321",
                "87654321","123123","asdfgh","user","test"};
        for(String commonPass:ListOfCommonPasswords){
            if(commonPass.equals(password.toLowerCase())){
                return true;
            }
        }
        return false;
        }; // kleine interne Liste
    // Bonus:
    public static boolean containsSpecialChar(String password){
        String SpecialChar="!@#$%^&*()-_+={}[]|:;'<>,.?/";
        for(int i=0; i<password.length();i++){
            if(SpecialChar.contains(""+password.charAt(i))){
                return true;
            }
        }

        return false;};


    // Optionale Gesamtsicht:
    public static boolean isValid(String password){
        return hasMinLength(password,8)&&containsDigit(password)
                &&containsUpperAndLower(password)&&containsSpecialChar(password)
                &&!isCommonPassword(password);}; // nutzt die obenstehenden Checks

}


