package pkg;

import java.util.Scanner;

public class counttotalnuminstring {

	public static void main(String[] args) {
System.out.println("enter the string: ");
Scanner sc = new Scanner(System.in);
String string = sc.nextLine();
int count =0;
for (int i=0;i<string.length();i++) {
	if(string.charAt(i)!=' ') {
		count++;
	}
}
System.out.println("count of string:"+count);


	}

}
