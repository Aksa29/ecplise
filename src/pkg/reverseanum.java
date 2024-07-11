package pkg;

import java.util.Scanner;

public class reverseanum {

	public static void main(String[] args) {
		Scanner rev = new Scanner (System.in);
		System.out.println("enter a number=");
		int num = rev.nextInt();
		int temp=num;
		int reverse =0;
while (num!=0) {        //250!=0	//25!=0
	int remainder = num % 10;		//250%10=25	//25 %10=5
	reverse = reverse * 10 + remainder;			//0*10+25=25	///25*10+5=
	num = num/10;		//256/10=25
	
}
System.out.println("reverse of number=" + reverse);
if(reverse==temp)
{
	System.out.println("number is palindrome");
	}
else
{
	System.out.println("number is not palindrome");

}
	}

}
