package INHERITANCE;

class animal{
	public void animalmethod()
	{
		System.out.println("animal");
	}
}
class lion extends animal
{
public void lionmethod()
{
System.out.println("lion");	
}
}
class tiger extends animal
{
public void tigermethod()
{
	System.out.println("tiger");
	}
}

public class heriachalinheritance {

	public static void main(String[] args) {
tiger t= new tiger();
t.tigermethod();
t.animalmethod();

lion l= new lion();
l.lionmethod();
l.animalmethod();
	}

}
