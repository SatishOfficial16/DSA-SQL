import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
		    int n=sc.nextInt();
		    int c[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        c[i]=sc.nextInt();
		    }
		    int w[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        w[i]=sc.nextInt();
		    }
		    
		    int max=0;
		    if(c.length==1)
		    {
		        max=w[0];
		        System.out.println(max);
		        continue;
		    }
		    
		    Queue<Integer> q=new LinkedList<>();
		    
		    for(int i=0;i<n;i++)
		    {
		        int temp=0;
		       for(int j=i;j<n;j++)
		       {
		           if(q.isEmpty()||!q.contains(c[j]))
		           {
		               q.offer(c[j]);
		               temp+=w[j];
		               if(temp>max)
		               {
		                   max=temp;
		               }
		           }
		           else{
		               q.clear();
		               break;
		           }
		       }
		    }
		    
		    System.out.println(max);
		    t--;
		}

	}
}
