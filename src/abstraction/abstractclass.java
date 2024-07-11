package abstraction;
abstract class car{
	
	abstract public void accelaration();
	abstract public void speedlimit();
	public void carcolour() {
		System.out.println("car colour is black");
	}
	
}
class kia extends car{

	@Override
	public void accelaration() {
System.out.println("accelaration of kia");		
	}

	@Override
	public void speedlimit() {
System.out.println("sppedlimit of kia");		
	}
	
}
class BMW extends car{

	@Override
	public void accelaration() {
System.out.println("accelaration of bmw");		
	}

	@Override
	public void speedlimit() {
System.out.println("spedlimit of bmw");		
	}}

public class abstractclass {

	public static void main(String[] args) {
kia ob=new kia() ;
ob.accelaration();
ob.speedlimit();

BMW ob1=new BMW();
ob1.accelaration();
ob1.speedlimit();
ob1.carcolour();}

}
