import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {


    @ParameterizedTest
    @CsvSource ({"qwertyui","8","True",
                 "qwertyui","4","True",
                 "qwertyui","12","False"})
    void hasMinLength_shouldReturnTrue_WhenPasswordMinimumSymbolHas(String txt, int numb, boolean check){
        assertEquals(PasswordValidator.hasMinLength(txt,numb),check);
    }

    @ParameterizedTest
    @CsvSource ({"qwe3tyui","True",
                 "qwerty7i","True",
                 "qwertyui","False"})
    void containsDigit_shouldReturnTrue_WhenPasswordDigitHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsDigit(txt),check);
    }
    @ParameterizedTest
    @CsvSource ({"Qwe3tyui","True",
                 "qwerTY7i","True",
                 "qwertyui","False"})
    void containsUpperAndLower_shouldReturnTrue_WhenPasswordUpperAndLowerLetterHas(String txt, boolean check){
        assertEquals(PasswordValidator.containsUpperAndLower(txt),check);}

    @ParameterizedTest
    @CsvSource ({"password","True",
                 "admin","True",
                 "GSd21$@1gg_?s","False"})
    void isCommonPassword_shouldReturnTrue_WhenPasswordCommonIs(String txt, boolean check){
        assertEquals(PasswordValidator.isCommonPassword(txt),check);}
    @ParameterizedTest
    @CsvSource ({"GSd21$@1gg_?s","!@#$%^&*()-_+={}[]|:;'<>,.?/","True",
                 "admin$","!@#$%^&*()-_+={}[]|:;'<>,.?/","True",
                 "Password","!@#$%^&*()-_+={}[]|:;'<>,.?/","False"})
    void containsSpecialChar_shouldReturnTrue_WhenPasswordSpecialCharHas(String txt, String allowed, boolean check){
        assertEquals(PasswordValidator.containsSpecialChar(txt, allowed),check);}




}