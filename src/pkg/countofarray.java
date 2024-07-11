package pkg;

public class countofarray {

	public static void main(String[] args) {
System.out.println("enter the array :");
int ar[] ={88,4,-55,0,-40,10};
int size=ar.length;
int postivecount=0;
int negativecount=0;
int zero=0;
for(int i=0;i<ar.length;i++) {
	if(ar[i]>0) {
	postivecount++;
	}
	else if (ar[i]<0){
		negativecount++;
		
	}
	else {
	
	zero++;
	}
	}
System.out.println("positive count =" +postivecount);
System.out.println("negative count=" +negativecount);
System.out.println("zero ="+zero);
	}

}
