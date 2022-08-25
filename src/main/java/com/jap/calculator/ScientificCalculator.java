package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num <= 0) {
			throw new CalculatorException("Enter any number greater than 0 ");
		}else {
			return Math.ceil(num);
		}
		//or else call ceil method of Math class and return the value


	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num<=0){
			throw new CalculatorException("Enter any number greater than 0 ");
		}else
		//or else call floor method of Math class and return the value
		return Math.floor(num);
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		if (num1<num2){
			throw new CalculatorException("Enter num1 is greater than num2");
		}else
		//else use Math pow method and return the value

		return (long) Math.pow(num1,num2);
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		if (num<=0){
			throw new CalculatorException("Enter number greater than 0");
		}else
			//or else call sqrt method of Math class and return the value

		return Math.sqrt(num);
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			System.out.println(scientificCalculator.cielOfANumber(10.4f));;
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			System.out.println(scientificCalculator.power(50,6));
		}catch (Exception e){
			throw new RuntimeException();
		}
		try {
			System.out.println(scientificCalculator.floorOfANumber(2.54f));
		}catch (Exception e){
			throw new RuntimeException();
		}
		try {
			System.out.println(scientificCalculator.squareRoot(5));
		}catch (Exception e){
			throw new RuntimeException();
		}
	}
}
