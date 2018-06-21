import java.io.*;
class sams
{
public static void main(String args[])throws IOException
{
int n;
String s1,s2,s3;
DataInputStream x=new DataInputStream(System.in);
System.out.print("Enter the string");
s1=x.readLine();
System.out.print("Enter the string2");
s2=x.readLine();
n=s1.compareTo(s2);
if(n<0)
System.out.print(s2+"is greater then"+s1);
if(n>0)
System.out.print(s1+"greater than"+s2);
if(n==0)
System.out.print(s1+" and "+s2+" is equal "); 
//System.out.print("the length is"+s3);
}
}
