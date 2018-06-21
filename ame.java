import java.io.*;
class ame
{
   public static void main(String args[])throws IOException
    {
     int n,r=0,s=0,t;
    DataInputStream x=new DataInputStream(System.in);
    System.out.println("Enter the n value :");
    n=Integer.parseInt(x.readLine());
    t=n;
    while(n>0)
           {
                     r=n%10;
    	 s=(r*r*r);
    	 n=n/10;
             }
if(t==s)
              System.out.println("The given number is amestrong number");
else
        System.out.println("The given number is not amestrong number");
      
}
}   