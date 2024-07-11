package pkg;

public class whilepg1 {

	public static void main(String[] args) {
int num=1458, count =0;
while(num>0)  //1458>0  //145>0	//14>0	//1>0
{
	
 num = num /10;    //1458/10=145  //145/10=14	//14/10=1 	//1>0
count++;           //1				//2			//3			//4
}
System.out.println( "count =" +count);	
}

}
