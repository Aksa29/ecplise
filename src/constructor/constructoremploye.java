package constructor;

public class constructoremploye {
	int empid;
	String empname;
	public constructoremploye (int empid , String empname)
	{
		
		this.empid=empid;
		this.empname=empname;
		
	}
public static void main (String[] arg)
{
	constructoremploye emp=new constructoremploye(101,"abc");
	
	}


}

