package pkg;

import java.util.Scanner;

public class y_ndowhile {

	public static void main(String[] args) {
char op;
int sum=0;
do {
	System.out.println("enter the two number");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2= sc.nextInt();

sum = sum+num1+num2;	
	System.out.println("Do you want to perform another operation, Y/N :" );
	 op = sc.next().charAt(0);
	
}while(op=='Y'|| op=='y');
System.out.println("sum of two number=" +sum);

	}

}
