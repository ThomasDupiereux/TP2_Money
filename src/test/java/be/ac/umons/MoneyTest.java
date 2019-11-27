package be.ac.umons;

import org.junit.*;



import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest extends TestCase{
    protected Money money_1;
    protected Money money_2;
    protected Money money_3;
    protected Money money_4;
    protected Money money_5;
    protected Money money_6;

    public MoneyTest(String name){
        super(name);
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("tearDownClass");
    }

    @Before
    public void setUp() {
        money_1 = new Money(20, "EUR");
        money_2 = new Money(14, "EUR");
        money_3 = new Money(17, "DLR");
        money_4 = new Money(26, "CHF");
        money_5 = new Money(-4, "EUR");
        money_6 = new Money(27, "DLR");
    }

    @After
    public void tearDown() {

    }

    /**
     * Test of amount method, of class Money.
     */
    @Test
    public void testAmount() {
        System.out.println("Amount Test");
        Money instance = new Money(12, "Euro");
        int expResult = 23;
        int result = instance.amount();
        assertNotEquals(expResult, result);
    }



    /**
     * Test of currency method, of class Money.
     */
    @Test
    public void testCurrency() {
        System.out.println("Currency Test");
        Money instance = new Money(124, "Euro");
        String expResult = "Euro";
        String result = instance.currency();
        assertEquals(expResult, result);
    }


    /**
     * Test of add(Money) method, of class Money.
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd_Money() throws Exception {
        System.out.println("Add(Money) Money Test");
        Money m = new Money(2, "Euro");
        Money instance = new Money(180, "Euro");
        Money expResult = new Money(323, "Euro");
        Money result = instance.add(m);
        assertFalse("There are Not Equals", expResult.amount()==result.amount() && expResult.currency().equals(result.currency()));
    }

    /**
     * Test of add(amount,currency) method, of class Money.
     * @throws java.lang.Exception
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("Add(amount,currency) Money Test");
        int amount = 10;
        String currency = "Euro";
        Money instance = new Money(13, "Euro");
        Money expResult = new Money(23, "Euro");
        Money result = instance.add(amount,currency);
        assertTrue("There are Equals", expResult.amount()==result.amount() && expResult.currency().equals(result.currency()));
    }


}