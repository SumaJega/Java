import java.io.*;
class add1
{
public static void main(String args[])throws IOException
{
int a,b,c;
DataInputStream x=new DataInputStream(System.in);
System.out.print("Enter a value :");
a=Integer.parseInt(x.readLine());
System.out.print("Enter b value :");
b=Integer.parseInt(x.readLine());
c=a+b;
System.out.print("the answer is:"+c);
}
}