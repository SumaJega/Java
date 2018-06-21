import java.io.*;
class reverse1
{
   public static void main(String args[])throws IOException
    {
     int n,r=0,s=0;
    DataInputStream x=new DataInputStream(System.in);
    System.out.println("Enter the n value :");
    n=Integer.parseInt(x.readLine());
    while(n>0)
           {
                     r=n%10;
    	 s=r+(s*10);
    	 n=n/10;
             }
              System.out.println("The answer is :"+s);
      
}
}   