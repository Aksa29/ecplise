package interface1;

interface bascianimal{
	
	public void eat();
	public void sleep();
}
public  class human extends monkey1 implements bascianimal{

	@Override
	public void eat() {
System.out.println("human has eat food");		
	}

	@Override
	public void sleep() {
System.out.println("human must sleep 8hrs");		
	}
	 
 }

public class inpgm {

	public static void main(String[] args) {
human ob=new human();
ob.eat();
ob.sleep();
ob.bite();
ob.jump();
	}

}
