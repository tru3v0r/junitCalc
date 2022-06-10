package squash.tfauto;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Parameterized Calculator ")
public class ParameterizedCalculatorTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 12, 3, 8})
    public void parameterizedAddition(int b){
        int a = 5;
        Assertions.assertTrue((a+b)==17,"Le résultat du" +
                "calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @ParameterizedTest
    @CsvSource(value = {"3:14", "5:8", "10:12", "13:4"}, delimiter = ':')
    public void parameterizedCsvAddition(int a, int b) {
        int expected = 17;
        Assertions.assertTrue(a+b==expected,"Le résultat du" +
                "calcul est incorrect. " + a + " + " + b + " n'est pas égal" +
                " à " + expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 12, 3, 8})
    public void parameterizedMultiplication(int b){
        int a = 2;
        Assertions.assertTrue((a*b)==6,"Le résultat du" +
                "calcul est incorrect. " + a + " * " + b + " n'est pas égal à 6");
    }
}
