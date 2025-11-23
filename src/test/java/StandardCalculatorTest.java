import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.qcalc.StandardCalculator;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    public void setup(){
        standardCalculator = new StandardCalculator();
    }


    @Test
    @DisplayName("Testing Addition Operation")
    public void testAdditionOperation(){
        standardCalculator.add(25,5);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(30, actualResult);
    }

    @Test
    @DisplayName("Testing Substraction Operation")
    public void testSubstractionOperation(){
        standardCalculator.substract(24,12);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    @DisplayName("Testing Multiplication Operation")
    public void testMultiplicationOperation(){
        standardCalculator.multiply(5,5);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(25, actualResult);
    }

    @Test
    @DisplayName("Testing Division Operation")
    public void testDivisionOperation(){
        standardCalculator.divide(10,2);
        int actualCalculator = standardCalculator.getResult();
        Assertions.assertEquals(5, actualCalculator);
    }

}
