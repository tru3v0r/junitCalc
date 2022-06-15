package squash.tfauto;

import org.junit.jupiter.api.*;

@DisplayName("Repeated Calculator Test")
public class RepeatedCalculatorTest {

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void RepeatedAdditionSuccess(RepetitionInfo repetitionInfo){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17,"Le résultat du" +
                "calcul" + repetitionInfo.getCurrentRepetition() + '/' +
                repetitionInfo.getTotalRepetitions() + " est incorrect. "
                + a + " + " + b + " n'est pas égal à 17");
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void RepeatedAdditionFailure(RepetitionInfo repetitionInfo){
        int a = 5;
        int b = 8;
        Assertions.assertTrue((a+b)==17,"Le résultat du" +
                "calcul" + repetitionInfo.getCurrentRepetition() + '/' +
                repetitionInfo.getTotalRepetitions() + " est incorrect. "
                + a + " + " + b + " n'est pas égal à 17");
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void repeatedMultiplicationSuccess(RepetitionInfo repetitionInfo){
        int a = 2;
        int b = 3;
        Assertions.assertTrue((a*b)==6,"Le résultat du" +
                "calcul" + repetitionInfo.getCurrentRepetition() + '/' +
                repetitionInfo.getTotalRepetitions() + " est incorrect. "
                + a + " * " + b + " n'est pas égal à 6");
    }

    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void repeatedMultiplicationFailure(RepetitionInfo repetitionInfo){
        int a = 2;
        int b = 4;
        Assertions.assertTrue((a*b)==6,"Le résultat du" +
                "calcul" + repetitionInfo.getCurrentRepetition() + '/' +
                repetitionInfo.getTotalRepetitions() + " est incorrect. "
                + a + " * " + b + " n'est pas égal à 6");
    }

}
