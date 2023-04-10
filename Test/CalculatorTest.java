import com.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void initialTest() {
        Assert.assertTrue(true);
    }

    // addNums
    @Test
    public void addNums_Test() {
        double addNums = Calculator.addNums(2, 3);
        Assert.assertEquals(5, addNums, 0);
    }

    @Test
    public void notEquals_addNums_Test() {
        double addNums = Calculator.addNums(2, 2);
        Assert.assertNotEquals(7, addNums, 0);
    }

    // subNums
    @Test
    public void subtractNums_Test() {
        double subNums = Calculator.subtractNums(2, 3);
        Assert.assertEquals(-1, subNums, 0);
    }

    @Test
    public void notEquals_subNums_Test() {
        double subNums = Calculator.subtractNums(7, 2);
        Assert.assertNotEquals(3, subNums, 0);
    }

    //multiplyNums
    @Test
    public void multiplyNums_Test() {
        double multiplyNums = Calculator.multiplyNums(3, 3);
        Assert.assertEquals(9, multiplyNums, 0);
    }

    //divideNums
    @Test
    public void divideNums_Test() {
        double divideNums = Calculator.divideNums(12, 2);
        Assert.assertEquals(6, divideNums, 0);
    }
}
