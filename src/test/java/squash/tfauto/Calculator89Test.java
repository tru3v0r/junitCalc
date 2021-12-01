package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator89Test {

    @Test
    public void addSuccess89(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @Test
    public void multFailure89(){
        int first = 2;
        int second = 4;
        Assertions.assertTrue((first*second)==6, "Le résultat du calcul est incorrect. " + first + " * " + second + " n'est pas égal à 6");
    }
}
