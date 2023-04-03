package corejava.day1;

import java.util.Scanner;

public class DifferenceOfNumber {

	public static int getDiffOfdigits()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get the difference of digits");
		int num = sc.nextInt();
		int temp = num; 
		int result = 0;
		num = num / 10;
//		System.out.println(num);
		
		temp = temp % 10;
//		System.out.println(temp);
		if(num > 0)
		{
			result = num - temp;
			System.out.println("result is  " +  result);
//			return result;
		}
		 if(num < 0)
		{
			 result = -3;
			return -1;
		}
		else if(num > 99)
		{
			return -2;
		}
//		
		else if(num  == 0 && num <= 9)
		{
			return -1;
		}
		
			return result;
		}
	
	public static void main(String[] args) {
		getDiffOfdigits();

	}

}
