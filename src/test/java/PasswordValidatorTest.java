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






}