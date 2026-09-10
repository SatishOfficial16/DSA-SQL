# KTTABLE - Rating 982

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T19:51:34.389Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int index=0;int  found =0;
		   for(int i=n-1;i>=0;i--)
		   {
		       if(a[i]<x)
		       {
		           index=i;
		           found=1;
		           break;
		       }
		   }
		   if(found>0 || index>0)
		   {
		       index++;
		   }
		    System.out.println(index);
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/KTTABLE)