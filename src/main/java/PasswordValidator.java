public final class PasswordValidator {

    public static boolean IsNotNull(String password){
        return password != null;
    }
    public static boolean hasMinLength(String password, int min){
        if (IsNotNull(password)) {

        return password.length() >= min;
    }
        return false;
    }
    public static boolean containsDigit(String password){
        if(IsNotNull(password)){
        String number="0123456789";
        for(int i=0; i<password.length();i++){
            if(number.contains(""+password.charAt(i))){
                return true;
            }
        }}
        return false;
    }
    public static boolean containsUpper(String password) {
        if(IsNotNull(password)){
        for (int i = 0; i < password.length(); i++) {
            if(Character.isUpperCase(password.charAt(i))){
                return true;
            }

        } }return false;
    }
    public static boolean containsLower(String password) {
        if(IsNotNull(password)){
        for (int i = 0; i < password.length(); i++) {
            if(Character.isLowerCase(password.charAt(i))){
                return true;
            }}

        } return false;
    }
    public static boolean containsUpperAndLower(String password){
        return containsLower(password)&&containsUpper(password);}

    public static boolean isCommonPassword(String password){
        String [] ListOfCommonPasswords ={"123456","admin","12345678","password","password1!",
                "admin123","root","passwort","meinpasswort","abc123","qwerty","654321",
                "87654321","123123","asdfgh","user","test"};
        if(IsNotNull(password)){
        for(String commonPass:ListOfCommonPasswords){
            if(commonPass.equals(password.toLowerCase())){
                return true;
            }
        }}
        return false;
        } // kleine interne Liste
    // Bonus:
    public static boolean containsSpecialChar(String password){
        if(IsNotNull(password)){
        String SpecialChar="!@#$%^&*()-_+={}[]|:;'<>,.?/";
        for(int i=0; i<password.length();i++){
            if(SpecialChar.contains(""+password.charAt(i))){
                return true;
            }
        }}

        return false;}


    // Optionale Gesamtsicht:
    public static boolean isValid(String password){
        return hasMinLength(password,8)&&containsDigit(password)
                &&containsUpperAndLower(password)&&containsSpecialChar(password)
                &&!isCommonPassword(password);} // nutzt die obenstehenden Checks

    public static int WhyNotValid(String password){
        int reason=0;
        if(!hasMinLength(password,8)){reason+=1;}
        if (!containsDigit(password)) {reason+=2;}
        if (!containsUpperAndLower(password)) {reason+=4;}
        if (!containsSpecialChar(password)) {reason+=8;}
        if (isCommonPassword(password)) {reason+=16;}
        return reason;
        }


}


