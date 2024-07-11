package pkg;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
System.out.println("eneter the digit");
Scanner sc= new Scanner(System.in);
int temp=0;
int s=0;
int num= sc.nextInt();

while (num>0)
{
	
 temp = num%10;
s= s+ temp;
num=num/10;
}
System.out.println("sum of digit is "+s);
	}

}
