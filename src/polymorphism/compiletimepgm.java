package polymorphism;

public class compiletimepgm {  //methodoverloading

	public static void main(String[] args) {
compiletimepgm ob = new compiletimepgm();
ob.add();
ob.add(44,20);
ob.add(10, 2.4);
ob.add(10, 10);
ob.add(10, 20,10);
	}



public void add()
{
	int a= 20, b=25;
	int c = a+b;
	System.out.println("sum="+c);
}

public void add(int a, double b)
{
double c = a+b;
System.out.println("sum=" +c);
}
public void add(double a, int b)
{
double c = a+b;
System.out.println("sum=" +c);
}
public void add(int a, int b)
{
int c = a+b;
System.out.println("sum=" +c);
}
public void add(int a, int b,int d)
{
int c = a+b+d;
System.out.println("sum=" +c);
}

}