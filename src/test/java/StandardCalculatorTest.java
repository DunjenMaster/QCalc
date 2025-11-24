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
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(30, actualResult);
    }

    @Test
    @DisplayName("Testing Substraction Operation")
    public void testSubstractionOperation(){
        standardCalculator.subtract(24,12);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    @DisplayName("Testing Multiplication Operation")
    public void testMultiplicationOperation(){
        standardCalculator.multiply(5,5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(25, actualResult);
    }

    @Test
    @DisplayName("Testing Division Operation")
    public void testDivisionOperation(){
        standardCalculator.divide(10,2);
        double actualCalculator = standardCalculator.getResult();
        Assertions.assertEquals(5, actualCalculator);
    }


    @Test
    @DisplayName("Testing Addition Operation with Double Data Type")
    public void testAdditionOperationWithDoubleDataType(){
        standardCalculator.add(10.0,10.2);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(20.2, actualResult);
    }

    @Test
    @DisplayName("Testing Subtraction Operation with Double Data Type")
    public void testSubtractionOperationWithDoubleDataType(){
        standardCalculator.subtract(15.5,5.2);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(10.3, actualResult);
    }

    @Test
    @DisplayName("Testing Multiplication Operation with Double Data Type")
    public void testMultipleOperationWithDoubleDataType(){
        standardCalculator.multiply(5.0,5.0);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(25.0,actualResult);
    }

}
