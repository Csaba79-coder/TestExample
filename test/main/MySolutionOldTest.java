package main;

import org.junit.*;


public class MySolutionOldTest { // can run the whole class!


    int[] testArray = {1, 2, 3, 4, 5};
    static int[] arr;

    @BeforeClass
    public static void setUp() {
       arr = new int[] {1, 2, 3, 4, 5};
        System.out.println("Before class :)");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("The whole test's been finished!");
    }

    /*
    @Test
    public void testExample() { // can run 1by1
        int x = 10; // this one is the result of my method!!!

        Assert.assertEquals(10, x);
        // Assert.assertTrue(x == 10);
    }

    @Test
    public void testExample2() { // can run 1by1
        int x = 20; // this one is the result of my method!!!

        Assert.assertEquals(10, x);
        // Assert.assertTrue(x == 10);
    }
    */

    // 1 test 1 assert!!! :)

    @Before
    // runs before all tests!!!
    public void init() {
        // can get a value that can change, but!!! if a test changes it, you can get the original value if it is in before!
        // if any of the test change the value of your object, you can keep the original with this method!

        // there is a Person Class, where a person age is 35 now
        // there is a test for testing a year younger and older, than you have to run this person with age 35 before all the tests to keep the values!!!
        System.out.println("Test is running soon ...!");
    }

    @After
    public void tearDown() {
        System.out.println("Test finished ...!");
    }

    @Test
    public void getLastNumberTest() {
        // int[] arr = {1, 2, 3, 4, 5};

        int result = MySolution.getLastNumber(testArray);
        System.out.println("\tgetLastNumberTest is running ...");

        Assert.assertEquals(5, result);
        // Assert.assertEquals(5,  MySolution.getLastNumber(arr));
        // Assert.assertEquals(5, MySolution.getLastNumber(new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void getLastNumberTest2WithOneElementArr() {
        int[] arr = {5};

        int result = MySolution.getLastNumber(arr);

        // if there are more Assert in the test, and fails the test, than the test does not run further!
        Assert.assertEquals(5, result);
    }

    @Test
    public void countEvenNumbers() {
        int[] arr = {1, 2, 3, 4};

        int result = MySolution.countEvenNumbers(arr);

        Assert.assertEquals(2, result);
    }

    @Test
    public void findNumberTestPosNums() {
        int[] testArray = {1, 2, 3, 4, 5};

        // using the class testArray!!!
        int result = MySolution.findNumber(this.testArray, 3);
        Assert.assertEquals(2, result);
    }


}