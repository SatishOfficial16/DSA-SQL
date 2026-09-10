import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        b[i]=sc.nextInt();
		    }
		    
		    int count=0;
		    if(a[0]>=b[0])
		    {
		        count++;
		    }
		    
		    for(int i=1;i<n;i++)
		    {
		        if((a[i]-a[i-1])>= b[i])
		        {
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		   
		}
		
		

	}
}
