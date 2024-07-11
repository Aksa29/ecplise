package pkg;

import java.util.Scanner;

public class Calculatorusingscanner {

	public static void main(String[] args) {

Scanner Calc =new Scanner(System.in);

int a, b;
System.out.println("enter a first number");
a= Calc.nextInt();

System.out.println("enter a second number");
b= Calc.nextInt();
System.out.println("enter a choice 1.add 2.sub 3.mul 4.div");
int choice= Calc.nextInt();
switch (choice)
{
case 1: System.out.println("sum="+ (a+b));
break;
case 2: System.out.println("sub="+(a-b));
break;
case 3: System.out.println("mul="+(a*b));
break;
case 4: System.out.println("div="+(a/b));
break;

	}
}

}
