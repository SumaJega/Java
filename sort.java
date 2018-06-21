import java.io.*;
import java.lang.*;
class sort
  {
  	public static void main(String args[])throws IOException
   	 {
    		 int n,i,j,t;
    		 DataInputStream d=new DataInputStream(System.in);
     		 int a[]=new int[10];
     		 System.out.println("Enter the Limit");
     		 n=Integer.parseInt(d.readLine());
    		 System.out.println("Enter the No");
    		 for(i=0;i<n;i++)
    		 {
    		 	a[i]=Integer.parseInt(d.readLine());
    		 }
   		  for(i=0;i<n;i++)
    		 {
    			 for(j=i+1;j<n;j++)
   			  {
     				if(a[i]>a[j])
                     			{
    				 t=a[i];
    				 a[i]=a[j];
    				 a[j]=t;
				}
    			  }
    		 }
    	 
    	 System.out.println("Result");
    	 for(i = 0;i < n; i++)
    	 {
    		 System.out.println(a[i]);
    	 }
}    
}
	 
    	 

     