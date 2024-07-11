package pkg;

import java.util.Scanner;

public class armstrongnum {

	public static void main(String[] args) {
		

Scanner armstrong = new Scanner(System.in);
int s=0;

System.out.println("enter a number");
int num= armstrong.nextInt();
int temp=num;
while (num>0)
{
	int a = num%10;
	s= s+a*a*a;
	num=num/10;

}
//System.out.println("num="+s)	;


if (s==temp)
{
	System.out.println("num is armstrong");
}
else
{
System.out.println("num is not armstrong");
}
	
	}

}
