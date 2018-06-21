import java.io.*;
class math
{
 int a,b,c;
void getdata() throws IOException
{
 DataInputStream x=new DataInputStream(System.in);
System.out.println("ARITHMETIC OPERATION");
System.out.println("******************************");
System.out.println("Enter the value of a:");
a=Integer.parseInt(x.readLine());
System.out.println("Enter the value of b:");
b=Integer.parseInt(x.readLine());
}
void cal1()
{
 c=a+b;
System.out.println("Sum:"+c);
 }
void cal2()
{
 c=a-b;
System.out.println("Sub:"+c);
 }
void cal3()
{
 c=a+b;
System.out.println("Sum:"+c);
 }
void cal4()
{
 c=a+b;
System.out.println("Sum:"+c);
 }
}
class num
{
 public static void main(String args[])
 {
 math m=new math();
m.getdata();
m.cal1();
m.cal2();
m.cal3();
m.cal4();
}
}

