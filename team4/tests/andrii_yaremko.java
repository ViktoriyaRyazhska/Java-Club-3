import andrii_yaremko.*;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
public class andrii_yaremko {
    Task3 task3 = new Task3();
    Task6 task6 = new Task6();
    Task9 task9 = new Task9();
    Task12 task12 = new Task12(1,"a");
    
    Task18 task18 = new Task18();
    Task21 task21 = new Task21();
    Task24 task24 = new Task24();
    Task29 task29 = new Task29();
    Task33 task33 = new Task33();
    Task37 task37 = new Task37();
    Task41 task41 = new Task41();
    Task45 task45 = new Task45();
    Task49 task49 = new Task49();
    Task53 task53 = new Task53();
    Task57 task57 = new Task57();
    Task61 task61 = new Task61();
    Task65 task65 = new Task65();
    Task69 task69 = new Task69();
    Task73 task73 = new Task73();

    @Test
    public void to_binary() {
        assertEquals("1", task6.to_binary(1));
        assertEquals("10", task6.to_binary(2));
        assertEquals("11", task6.to_binary(3));
        assertEquals("101", task6.to_binary(5));
    }
   @Test
    public void makeNegative(){
        Assertions.assertEquals(-42.0,task9.makeNegative(42.0));
   }
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        Assertions.assertEquals(4, task3.getVolumeOfCubiod(1, 2, 2));
        Assertions.assertEquals(63, task3.getVolumeOfCubiod(6.3, 2, 5));
    }
    @Test
    public void opposite() {
        Assertions.assertEquals(-1.0, task18.opposite(1.0));
    }
    @Test
    public void addSalaryAndBonuses() {
        boolean wellConfigured=unicodeTest();
        assertEquals((wellConfigured?"£":"\u00A3")+"100000",task21.addSalaryAndBonuses(10000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"250000",task21.addSalaryAndBonuses(25000, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"10000",task21.addSalaryAndBonuses(10000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"60000",task21.addSalaryAndBonuses(60000, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"20",task21.addSalaryAndBonuses(2, true));
        assertEquals((wellConfigured?"£":"\u00A3")+"78",task21.addSalaryAndBonuses(78, false));
        assertEquals((wellConfigured?"£":"\u00A3")+"678900",task21.addSalaryAndBonuses(67890, true));
    }

    public boolean unicodeTest(){
        System.out.println("\u00A3 == £:"+"\u00A3".equalsIgnoreCase("£"));
        System.out.println("if previous result was false or had ? symbol then perhaps you need to escape unicode due to misconfiguration");
        return "\u00A3".equalsIgnoreCase("£");
    }
    @Test
    public void testBasics()
    {
        System.out.println("Basic Tests");
        MatcherAssert.assertThat(task24.operations(4.0, 7.0, "+"), is(11.0));
        MatcherAssert.assertThat(task24.operations(15.0, 8.0, "-"), is(7.0));
        MatcherAssert.assertThat(task24.operations(5.0, 5.0, "*"), is(25.0));
        MatcherAssert.assertThat(task24.operations(49.0, 7.0, "/"), is(7.0));
    }
    @Test
    public void basicTests() {
        assertEquals("One", task29.enough("1"));
        assertEquals("Three", task29.enough("3"));
        assertEquals("Five", task29.enough("5"));
    }


//33-45

    @Test
    public void simpleTest(){
        assertTrue("empty string", task49.encode("").equals(""));
        assertTrue("abcdef string", task49.encode("abcdef").equals("4bcd3f"));
    }
    @Test
    public void one() {
        assertEquals("11515", task33.humanYearsCatYearsDogYears(1));
    }
    @Test
    public void reverse() {
        assertEquals("[5, 4, 3, 2, 1]",task37.reverse(5));
    }

    @Test
    public void test1() throws Exception {

        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                task53.sayHello("John Smith", "Phoenix", "Arizona"));
    }
    @Test public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", task57.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", task57.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", task57.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", task57.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", task57.noSpace("8j aam"));
    }
    @Test
    public void position() {
        assertEquals(1, task61.position("a"));
        assertEquals(26, task61.position("z"));
        assertEquals(5, task61.position("e"));
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", task45.gap(2,100,110));
        assertEquals("[103, 107]", task45.gap(4,100,110));
        assertEquals("[359, 367]", task45.gap(8,300,400));
        assertEquals("[337, 347]", task45.gap(10,300,400));
    }
    @Test
    public void abbrevName() {
        assertEquals("S.H", task65.abbrevName("Sam Harris"));
        assertEquals("P.F", task65.abbrevName("Patrick Feenan"));
        assertEquals("E.C", task65.abbrevName("Evan Cole"));
        assertEquals("P.F", task65.abbrevName("P Favuzzi"));
        assertEquals("D.M", task65.abbrevName("David Mendieta"));
    }
    @Test
    public void toAlternativeString() {
        assertEquals("HELLO WORLD", task69.toAlternativeString("hello world"));
        assertEquals("hello world", task69.toAlternativeString("HELLO WORLD"));
        assertEquals("HELLO world", task69.toAlternativeString("hello WORLD"));
        assertEquals("hEllO wOrld", task69.toAlternativeString("HeLLo WoRLD"));
        assertEquals("Hello World", task69.toAlternativeString(task69.toAlternativeString("Hello World")));
        assertEquals("12345", task69.toAlternativeString("12345"));
        assertEquals("1A2B3C4D5E", task69.toAlternativeString("1a2b3c4d5e"));
        assertEquals("sTRINGuTILS.TOaLTERNATINGcASE", task69.toAlternativeString("StringUtils.toAlternatingCase"));
    }



























}
