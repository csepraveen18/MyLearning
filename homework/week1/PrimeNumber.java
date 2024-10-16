package homework.week1;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =12;
		boolean flag = false;
		if (num==0 || num==1) {
			System.out.println("0 and 1 are not prime numbers");
			}
	
		for (int i = 2; i < num/2; i++) {
			
		 if (num%i==0)
			{
			flag =true;
			break;
			}}
			
		if (flag==false)
		{
		System.out.println("prime number");
		}
		else 
		{System.out.println("not prime number");}
	
	}
}
