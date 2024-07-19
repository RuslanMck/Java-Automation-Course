package calculator;

import classwork.calculator.Calculator;
import org.junit.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void setUp(){
        calculator = new Calculator();
        System.out.println("Test start");
    }

    @Before
    public void beforeEachTest(){
        System.out.println("beforeEachTest");
    }

    @After
    public void afterEachTest(){
        System.out.println("afterEachTest");
    }

    @Test
    public void testAddition(){
        Assert.assertEquals(4, calculator.calculate("2 + 2"));
    }

    @Test
    public void testSubtraction(){
        Assert.assertEquals(3, calculator.calculate("5 - 2"));
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Test end");
    }
}
