import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @ParameterizedTest
    @CsvSource ({"qwertyui,8,true",
            "qwertyui,4,true",
            "GSd21g666gs,8,true",
            "aDDm1ee,8,false", //7 characters
            "qwertyuio,8,true"}) // 9 characters
    void hasMinLength_shouldReturnTrue_WhenPasswordMinimumSymbolHas(String txt, int numb, boolean check){
        assertEquals(PasswordValidator.hasMinLength(txt,numb),check);
    }

    @ParameterizedTest
    @CsvSource ({"qwe3tyui,true",
            "qwerty7i,true",
            "GSd21@1gg_?s,true",
            "aDDm11n66,true",
            "qwertyui,false"})
    void containsDigit_shouldReturnTrue_WhenPasswordDigitHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsDigit(txt),check);
    }
    @ParameterizedTest
    @CsvSource ({"Qwe3tyui,true",
            "qwerTY7i,true",
            "GSd21$@1gg_?s,true",
            "aDDm11n$,true",
            "qwertyui,false"})
    void containsUpperAndLower_shouldReturnTrue_WhenPasswordUpperAndLowerLetterHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsUpperAndLower(txt),check);}

    @ParameterizedTest
    @CsvSource ({"Qwe3tyui,true",
            "qwerTY7i,true",
            "GSd21$@1gg_?s,true",
            "aDDm11n$,true",
            "QWERTZUI,false"})
    void containsLower_shouldReturnTrue_WhenPasswordLowerLetterHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsLower(txt),check);}
    @ParameterizedTest
    @CsvSource ({"Qwe3tyui,true",
            "qwerTY7i,true",
            "GSd21$@1gg_?s,true",
            "aDDm11n$,true",
            "qwertyui,false"})
    void containsUpper_shouldReturnTrue_WhenPasswordUpperLetterHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsUpper(txt),check);}

    @ParameterizedTest
    @CsvSource ({"password,true",
            "admin,true",
            "GSd21$@1gg_?s,false",
            "aDDm11n$,false",
            "GSd21$@1gg_?s,false"})
    void isCommonPassword_shouldReturnTrue_WhenPasswordCommonIs(String txt, boolean check){
        assertEquals(PasswordValidator.isCommonPassword(txt),check);}
    @ParameterizedTest
    @CsvSource ({"GSd21$@1gg_?s,true",
            "admin$,true",
            "GSd21$@1gg_?s,true",
            "aDDm11n$,true",
            "Password,false"})
    void containsSpecialChar_shouldReturnTrue_WhenPasswordSpecialCharHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsSpecialChar(txt),check);}
    @ParameterizedTest
    @CsvSource ({"GSd21$@1gg_?s,true",
            "aDDm11n$,true",
            ", false",            // null
            "Ui23_0a, false",    //7 characters
            "Character$, false", // Hasnt digital
            "characte$1,false", // No Upper letter
            "CHARACTER$1,false",// No lower letter
            "Character1,false",// No special character
            "Password,false",})  // Common Password
    void isValid_shouldReturnTrue_WhenPasswordValidIs(String txt, boolean check){
        assertEquals(PasswordValidator.isValid(txt),check);}



}










