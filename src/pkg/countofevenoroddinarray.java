package pkg;

public class countofevenoroddinarray {

	public static void main(String[] args) {
int ar[] = {2,40,3,8,5,1,9};
int size = ar.length;
int counteven=0;
int countodd=0;
for(int i=0;i<size;i++)
{
	if((ar[i]%2)==0)
	{
		counteven++;
	}
	else {
		countodd++;
	}
}
System.out.println("countof even= "+counteven);	
System.out.println("count of odd ="+countodd);
	}

}
