package pkg;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class stringfunction {

	public static void main(String[] args) {
  //concat
		String s1= "hi";
		String s2= "morning";
		String s3= "welcome to luminar";
		String s4= new String("Hi");
		System.out.println(s1.concat(s2));  //himorning
		System.out.println(1+2+s1+3+4);     //3hi34
		
		
		//equals
		 System.out.println(s1.equals(s3));  //false
		 System.out.println(s1.equalsIgnoreCase(s3)); //true
		 
		 //tolowercase
		 //touppercase
		 System.out.println(s1.toLowerCase());
		 System.out.println(s2.toUpperCase());
		 
		 //length
		 
		 System.out.println(s1.length());
		 
		 //startswith and endswith
		 System.out.println(s3.startsWith("welcome"));
		 System.out.println(s3.endsWith("luminar"));
		 
		 //trim
		 System.out.println(s3.trim());
		 //replace
		 System.out.println(s3.replace("hi", "hello"));
		 
		 //contains
		 System.out.println(s4.contains("welcome"));
		//split
String[] ar= s4.split("  ");
for(String a: ar)
{
	System.out.println(a);
	}
//substring
//charAt
//tocharArray

System.out.println(s2.substring(1,4)); // welcome o/p-elc
System.out.println(s1.charAt(1));
char[] c=s1.toCharArray();
for(char c1:c)
{
	System.out.println(c1);}





 }

}
