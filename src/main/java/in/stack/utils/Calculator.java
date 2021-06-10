package in.stack.utils;

import java.util.Arrays;

public class Calculator {
	
	public int add(int a,int b) {
		return a+b;
	}
     
	public int subtraction(int a,int b) {
		return a-b;
	}

	public int multiplication(int a,int b) {
		return a*b;
	}
	
	
	public int minOfArray(int[] input) {
		
		Arrays.sort(input);
		return input[0];
	}
	
	
	public void exceptionArise() {
		throw new ArithmeticException("Aritmetic exception test");
	}

}
