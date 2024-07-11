package polymorphism;

	class shape {
	public void circle(){
		
		System.out.println("shape is circle");
	 
	}	
	}
class  semicircle extends shape{

	@Override
	public void circle() {
System.out.println("shape is semicircle");		
super.circle();
	}
	
	
}		
	public class methodoveriding {
	public static void main(String[] args) {
semicircle ob = new semicircle();
ob.circle();
	}

}
