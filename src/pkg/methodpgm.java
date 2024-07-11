package pkg;

public class methodpgm {

	public static void main(String[] args) {
		
	methodpgm  ob = new methodpgm();
	ob.add();
	int value = ob.sub();
	System.out.println("subtraction "+value);
	ob.mul(20,30);
	double v= ob.div(30,2);
	System.out.println("division= "+v);
	
	}
//method without parameter and without returntype
	public void add()
	{
	int a=10,b=20, c;
	c=a+b;
	System.out.println(c);
	}
	
	//method with returntype without parameter 
	
	public int sub()
	{
		int a=50,b=20,s;
		s=a-b;
		return(s);
	
	}
	
	//method without return type and with parameter
	
	
public void mul(int a, int b) {
	int c= a*b;
	System.out.println("multiplication="+c);
}

//method with returntype and with parameter
public double div(int a, int b)
{
double c= a/b;
return c;
}
}

