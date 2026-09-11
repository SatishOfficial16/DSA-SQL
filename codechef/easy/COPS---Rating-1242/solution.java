import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

         Scanner sc =new Scanner(System.in);
         int t=sc.nextInt();
         while (t-->0)
         {
             int m=sc.nextInt();
             int x=sc.nextInt();
             int y=sc.nextInt();
             
             int cops[]=new int [m];
             for(int i=0;i<m;i++)
             {
                 cops[i]=sc.nextInt();
             }
             
             int cover=x*y;
             int safe =0; int min=0; int max=0;
             ArrayList<int[]> ar =new ArrayList<>();
             Arrays.sort(cops);
             for(int i=0;i<m;i++)
             {
                 min= cops[i]-cover;
                 if(min<1)
                 {
                     min =1;
                 }
                 
                 max=cover+cops[i];
                 if(max>100)
                 {
                     max=100;
                 }
                  if(ar.size()==0)
                  {
                      ar.add(new int[]{min,max});
                  }
                  else 
                  {
                      int temp[]=new int[2];
                      temp=ar.get(ar.size()-1);
                      if(temp[1]>=min)
                      {
                          temp[1]=Math.max(temp[1],max);
                      }
                      else{
                          ar.add(new int[]{min,max});
                      }
                  }
             }
             int result=0;
             int first=ar.get(0)[0];
             int s=ar.size();
             if(first!=0)
             {
                 result=first-1;
             }
             for(int i=1;i<s;i++)
             {
                int  temp=(ar.get(i)[0])-(ar.get(i-1)[1])-1;
                 if(temp>0)
                 {
                     result+=temp;
                 }
                 
             }
             int last =ar.get(ar.size()-1)[1];
             result+=100-last;
             
             System.out.println(result);
             
             
            
             
         }
	}
}
