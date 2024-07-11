package interface1;
class monkey1{
	public void jump() {
		System.out.println("monkey has ability to jump fast");
	}
	public void bite() {
		
		System.out.println("if monkey bite, take TT immediately");	
	}}
	class human extends monkey1{
		public void speak() {
			System.out.println("human has able to speak");
		}
		
	}
	

public class monkey {

	public static void main(String[] args) {
   human ob=new human();
   ob.speak();
   ob.bite();
   ob.jump();
	}

}
