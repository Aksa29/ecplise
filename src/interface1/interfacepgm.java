package interface1;
interface car1{
	
	public void acceleration();
	public void sppedlimit();
}
class maruti implements car1
{

	@Override
	public void acceleration() {
System.out.println("maruti acceleration");		
	}

	@Override
	public void sppedlimit() {
System.out.println("maruti speed");	
	}
	class lambo implements car1
	{

		@Override
		public void acceleration() {
System.out.println("lambo accele:");			
		}

		@Override
		public void sppedlimit() {
System.out.println("lambo speed");			
		}}
	
public class interfacepgm {

	public static void main(String[] args) {

		
	}

}
	
