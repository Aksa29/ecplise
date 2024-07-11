package pkg;

public class operators {
public static void main (String[] args)
{	int a=10, b=40;

	System.out.println("arithematical operators------");
	System.out.println("a+b="+(a+b));
System.out.println("a-b"+(a-b));
System.out.println("a*b="+(a*b));// quotient
	System.out.println("a%b="+(a%b));   //remainder
	
	
	System.out.println("assigment operators------");
	System.out.println("a+b="+(a+=b));// a+b=a
	System.out.println("a-b="+(a-=b));
	System.out.println("a*b="+(a*=b));
	System.out.println("a%b="+(a%=b));
	
	
	
	System.out.println("Logical operators------");
	String username="abcd";
	String pass="12ghj";
	
	System.out.println(username=="abcd"&& pass=="12ghj");
	System.out.println(username=="abcd"|| pass=="12ghj");
	System.out.println(!(username=="abcd") );
	System.out.println(username=="abcd"&& pass=="12ghj");
	System.out.println(username=="abcd"&& pass=="444j");
	
	
String s= "hello";
String s1= "world";
System.out.println(s+s1);

//++increment by 1
//--decrement by 1

int v=10;
System.out.println(v++);
System.out.println(++v);
System.out.println(v--);
System.out.println(--v);


//ternary
int v1 = 5, v2=6;
String ans = v1>v2 ? "v1 is greater" : "v2 is greater";
System.out.println(ans);














	

	
	
	



	

	
	
	
	
	


}
}
