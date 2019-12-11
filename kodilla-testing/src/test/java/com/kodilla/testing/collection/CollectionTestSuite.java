package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testCaseEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        ArrayList<Integer> evens = exterminator.exterminate(numbers);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(null, evens);
    }
    @Test
    public void testCaseMixedNumbers(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(12);
        numbers.add(5);
        numbers.add(35);
        numbers.add(78);
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        ArrayList<Integer> evens = exterminator.exterminate(numbers);
        System.out.println("Testing mixed numbers list");
        //Then
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(12);
        expected.add(78);
        Assert.assertEquals(expected, evens);
    }
}
