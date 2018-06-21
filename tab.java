import java.io.*;
class tab
{
public static void main(String args[])throws IOException
{
int n,i,s;
DataInputStream x=new DataInputStream(System.in);
System.out.print("Enter n value");
n=Integer.parseInt(x.readLine());
for(i=1;i<=10;i++)
{

System.out.println(i+"*"+n+"="+i*n);
}
}
}