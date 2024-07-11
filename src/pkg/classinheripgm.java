package pkg;	
	class vehicle{
		
		public void drive() {
		System.out.println("drive the car");
			}
		}
		class car extends vehicle{

			@Override
			public void drive() {
				System.out.println("Repairing a car");
				super.drive();
			}	
	}
	public class classinheripgm {
	public static void main(String[] args) {
		car ob=new car();
		ob.drive();
		
		
	}

}
