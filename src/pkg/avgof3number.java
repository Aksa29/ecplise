package pkg;

import java.util.Scanner;

public class avgof3number {

	public static void main(String[] args) {
		System.out.println("enter the 3 numbers :");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
	int sum=0;
	int avg=0;
for(int i=1;i<=3;i++)
{
sum = sum + num;
avg = sum /3;

}
System.out.println("avg of 3 number =" +avg);
}
}