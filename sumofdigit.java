import java.io.*;
class sumofdigit
{
public static void main(String args[])throws IOException
	{
	int n,r=0,s=0;
	  DataInputStream x=new DataInputStream(System.in);
	System.out.println("Enter the value:");
	   n=Integer.parseInt(x.readLine());
	while(n>0)
		{
		r=n%10;
		s=s+r;
		n=n/10;
		}
					System.out.println("The answer is:"+s);
	}
}