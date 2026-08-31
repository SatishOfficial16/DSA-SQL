import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }

        // Your code goes here
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        int three=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(t[i]==1)
            {
                if(c[i]<one && c[i]>=0)
                {
                    one=c[i];
                }
            }
           else if(t[i]==2 && c[i]>=0)
            {
                if(c[i]<two)
                {
                    two=c[i];
                }
            }
            else{
                if(c[i]<three && c[i]>=0)
                {
                    three=c[i];
                }
            }
            
        }
        
        if(three<(one+two))
        {
            System.out.println(three);
        }
        else{
            int result=one+two;
            System.out.println(result);
        }

        
        
    }
}
