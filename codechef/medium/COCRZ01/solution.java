class Solution {
    public int findMinimumRemovals(List<int[]> intervalList) {
        // write your code here 
        
        
         int n=intervalList.size();
            int arr[][] =new int[n][2];
            for(int i=0;i<n;i++)
            {
                int temp[]=intervalList.get(i);
                arr[i][0]=temp[0];
                arr[i][1]=temp[1];
            }
           
            Arrays.sort(arr,(a,b)-> Integer.compare(a[1],b[1]));
            int count=0;
            for(int i=1;i<n;i++)
            {
                if(arr[0][1]>arr[i][0])
                {
                    count++;
                }
            }
        
        return count;
    }
}