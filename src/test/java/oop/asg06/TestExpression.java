package oop.asg06;

//import oop.asg06.Addition;
//import oop.asg06.Expression;
//import oop.asg06.Numeral;
//import oop.asg06.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: chauttm
 * Date: 10/19/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestExpression {
    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }

    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals(4, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }
	
	@Test
    public void testSubtractionEvaluate() {
        Expression two = new Numeral(4);
		Expression two1 = new Numeral(2);
        //Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Subtraction(two, two1);
        assertEquals(2, twoPlusTwoSquare.evaluate());
    }
	
	@Test
    public void testSubtractionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Subtraction(two, twoSquare);
        assertEquals("(2 - 2^2)", twoPlusTwoSquare.toString());
    }
	
	@Test
    public void testMultiplicationEvaluate() {
        Expression two = new Numeral(4);
		Expression two1 = new Numeral(2);
        //Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Multiplication(two, two1);
        assertEquals(8, twoPlusTwoSquare.evaluate());
    }
	
	@Test
    public void testMultiplicationToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Multiplication(two, twoSquare);
        assertEquals("(2 * 2^2)", twoPlusTwoSquare.toString());
    }
}
