public final class PasswordValidator {

    public static boolean hasMinLength(String password, int min){return true;};

    public static boolean containsDigit(String password){return true;};
    public static boolean containsUpperAndLower(String password){return true;};
    public static boolean isCommonPassword(String password){return true;}; // kleine interne Liste
    // Bonus:
    public static boolean containsSpecialChar(String password, String allowed){return true;};
    // Optionale Gesamtsicht:
    public static boolean isValid(String password){return true;}; // nutzt die obenstehenden Checks
}


