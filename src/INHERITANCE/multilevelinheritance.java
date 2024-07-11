package INHERITANCE;
class father
{
	public void fathermethod()
	{
		System.out.println("fathermethod");
	}
}
class son extends father{
	public void sonmethod()
	{
		System.out.println("sonmethod");
	}
}
class grandson extends son{
	public void grandsonmethod()
	{
		System.out.println("grandsonmethod");
	}
}
public class multilevelinheritance {

	public static void main(String[] args) {
grandson ob= new grandson();
ob.fathermethod();
ob.sonmethod();
ob.grandsonmethod();
	}

}
