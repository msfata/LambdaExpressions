
package com.generic;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author msfata ProgrammingHelp
 *
 */
interface Calculate {
	int calculate(int a, int b);
}

public class LambdaExpressionMath {

	private int calculate(int a, int b, Calculate c) {
		return c.calculate(a, b);
	}

	public static void main(String[] args) {
		LambdaExpressionMath calc = new LambdaExpressionMath();
		Calculate add = (int a, int b) -> a + b;
		Calculate min = (int a, int b) -> a - b;
		Calculate mult = (int a, int b) -> a * b;
		Calculate devi = (int a, int b) -> a / b;
		System.out.println(calc.calculate(10, 5, add));
		System.out.println(calc.calculate(10, 5, min));
		System.out.println(calc.calculate(10, 5, mult));
		System.out.println(calc.calculate(10, 5, devi));
	}

	@Test
	void additionTest() {
		LambdaExpressionMath calc = new LambdaExpressionMath();
		Calculate add = (int a, int b) -> a + b;
		assertEquals(15, calc.calculate(10, 5, add));
	}

	@Test
	void deductionTest() {
		LambdaExpressionMath calc = new LambdaExpressionMath();
		Calculate min = (int a, int b) -> a - b;
		assertEquals(5, calc.calculate(10, 5, min));
	}

	@Test
	void multiplicationTest() {
		LambdaExpressionMath calc = new LambdaExpressionMath();
		Calculate mult = (int a, int b) -> a * b;
		assertEquals(50, calc.calculate(10, 5, mult));
	}

	@Test
	void devissionTest() {
		LambdaExpressionMath calc = new LambdaExpressionMath();
		Calculate devi = (int a, int b) -> a / b;
		assertEquals(2, calc.calculate(10, 5, devi));
	}
}
