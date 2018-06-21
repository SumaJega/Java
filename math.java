import  java.util.*;
class math
{
   int a,b,c;
   void getdata()
    {
	Scanner x=new Scanner(System.in);
	System.out.println("ARITHMETIC OPERATION");
	System.out.println("---------------------------------------");
	System.out.println("INPUT");
	System.out.println("---------");
	System.out.println("Enter The A Value:");
	a=x.nextInt();
	System.out.println("Enter The B value:");
	b=x.nextInt();
	System.out.println("OUTPUT");
	System.out.println("-------------");
   }
void cal1()
{
    	c=a+b;
	System.out.println("ADDITION VALUE: "+c);
}
void cal2()
{
    	c=a-b;
	System.out.println("SUBRACTION VALUE: "+c);
}
void cal3()
{
    	c=a*b;
	System.out.println("MULTIPICATION VALUE: "+c);
}
void cal4()
{
    	c=a/b;
	System.out.println("DIVISION VALUE: "+c);
}
}
class num
{
	public static void main(String[] args)
	{
	   math m=new math();
	   m.getdata();
	   m.cal1();
	   m.cal2();
	   m.cal3();
	   m.cal4();
	 }
}