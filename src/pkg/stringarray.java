package pkg;


import java.util.Scanner;

public class stringarray {

	public static void main(String[] args) {
String[] st = new String[3];
System.out.println("enter the string");
Scanner sc = new Scanner(System.in);
	for(int i=0;i<3;i++) {
	 st[i]= sc.next();	
}
System.out.println("entered the numbers");
//for(int i=0;i<3;i++)
//{
	//System.out.println(st[i]);
//	}

for(String v : st)
{
	
System.out.println(v);
}



	}

}
