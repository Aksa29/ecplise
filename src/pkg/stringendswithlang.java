package pkg;

import java.util.Scanner;

public class stringendswithlang {

	public static void main(String[] args) {
  System.out.println("enter a string :");
  Scanner sc = new Scanner(System.in);
  String string = sc.nextLine();
  
  if(string.endsWith("language")){
	  
	  System.out.println("string is endswith language");
	 
  }
  else {
	  System.out.println("string not endswith language");
  }
	}

}
