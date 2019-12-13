package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        ShapeCollector collector = new ShapeCollector(shapes);
        //When
        collector.addFigure(new Circle(5));
        //Then
        Assert.assertEquals(1, shapes.size());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Square square = new Square(4);
        shapes.add(square);
        ShapeCollector collector = new ShapeCollector(shapes);
        //When
        boolean result = collector.removeFigure(new Circle(3));
        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Triangle triangle = new Triangle(2, 5);
        shapes.add(triangle);
        ShapeCollector collector = new ShapeCollector(shapes);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapes.size());
    }

    @Test
    public void testGetFigure() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5));
        ShapeCollector collector = new ShapeCollector(shapes);
        //When
        Shape shape = collector.getFigure(0);
        //Then
        Assert.assertEquals(shapes.get(0), shape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Square(5));
        shapes.add(new Square(6));
        ShapeCollector collector = new ShapeCollector(shapes);
        //When
        String result = collector.showFigures();
        //Then
        Assert.assertEquals("square 25.0\nsquare 36.0\n", result);
    }
}
