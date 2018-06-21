import java.util.*;
class Math
{
	int a,b,c;
	void getdata( )
	{
		Scanner x=new Scanner(System.in);
		System.out.println( "Multiplication");
       		System.out.println("Input");
		System.out.println("Enter  the a value");
		a=x.nextInt( );
		System.out.println("Enter the value");
		b=x.nextInt( );
		System.out.println("Output");
	}
	void cal1( )
	{
		c=a*b;
		System.out.println("Multipication value  is:" +c);
	}
}
class num
{
	public static void main(String args[])
	{
		Math m=new Math();
		m.getdata();
		m.cal1();
	}
}