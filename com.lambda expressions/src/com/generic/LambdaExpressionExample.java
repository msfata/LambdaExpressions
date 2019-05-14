
package com.generic;

/**
 * @author msfata ProgrammingHelp
 *
 */
interface Math {
	int cal(int x, int y);
}

public class LambdaExpressionExample {
	private int calculate(int x, int y, Math math) {
		return math.cal(x, y);
	}

	public static void main(String[] args) {
		Math add = (int x, int y) -> x + y;
		LambdaExpressionExample t = new LambdaExpressionExample();
		System.out.println(t.calculate(10, 5, add));
	}
}