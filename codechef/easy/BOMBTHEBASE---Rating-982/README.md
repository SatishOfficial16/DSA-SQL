# BOMBTHEBASE - Rating 982

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Bomb the base

In Chefland, there are $N$ houses numbered from $1$ to $N$, $i^{th}$ house has a defence system having strength $A_i$.

Chef suspects a bomb drop on  **one**  of the houses very soon. A bomb with attack strength $X$ can destroy the $i^{th}$ house, if the defence system of the $i^{th}$ house $A_i$, is  **strictly less**  than $X$.

Also, when the $i^{th}$ house is destroyed due to the bomb, all houses with indices $j$ such that $1 \leq j < i$ get destroyed as well irrespective of their defence system.

Given  **one**  bomb with attack strength $X$, find the  **maximum**  number of houses that can get destroyed.

### Input Format
- The first line will contain $T$ - the number of test cases. Then the test cases follow.
- First line of each test case contains $2$ integers $N, X$.
- Second line of test case contains $N$ space separated integers $A_1, A_2,\ldots,A_N$.
### Output Format

For each test case, output in a single line the maximum number of houses that can get destroyed if the bomb can hit any house.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq X \leq 10^9$
- $1 \leq A_i \leq 10^9$
- Sum of $N$ over all test cases does not exceed $10^5$
### Sample 1:
Input
Output

```
2
8 6
4 1 6 1 6 5 6 8
2 1
3 5

```

```
6
0

```

### Explanation:

 **Test Case $1$:**  The bomb can only destroy houses $1, 2, 4,$ and $6$.

- If it hits house $1$, only house $1$ is destroyed.
- If it hits house $2$, houses $1$ and $2$ are destroyed.
- If it hits house $4$, houses $1, 2, 3$ and $4$ are destroyed.
- If it hits house $6$, houses $1, 2, 3, 4, 5,$ and $6$ are destroyed.

The maximum number of destroyed houses is $6$.

 **Test Case $2$:**  The bomb cannot destroy any of the houses as the defence system of each house is not lesser than attack power of bomb. Thus, the total number of destroyed houses is $0$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T19:46:22.671Z  

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
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]<x)
		        {
		            
		            index=i;
		            found=1;
		        }
		    }
		    if (index>0 || found>0 )
		    {
		        index+=1;
		    }
		    System.out.println(index);
		    
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BOMBTHEBASE)