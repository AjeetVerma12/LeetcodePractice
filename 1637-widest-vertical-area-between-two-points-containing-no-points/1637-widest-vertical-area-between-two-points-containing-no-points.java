class Solution {
    
    public int partition(List<Integer> xPoint, int low, int high) 
    {
        int pivot = xPoint.get(low);
        int i = low;
        int j = high;
        int temp;
        for (; i < j;) 
        {
            for (; xPoint.get(i) <= pivot && i <= high - 1;) 
            {
                i++;
            }
            for (; xPoint.get(j) > pivot && j > low;) 
            {
                j--;
            }
            if (i < j) 
            {
                temp = xPoint.get(i);
                xPoint.set(i, xPoint.get(j));
                xPoint.set(j, temp);
            }
        }
        temp = xPoint.get(low);
        xPoint.set(low, xPoint.get(j));
        xPoint.set(j, temp);
        return j;
    }
    
    public void sort(List<Integer> xPoint, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(xPoint, low, high);
            sort(xPoint, low, partitionIndex - 1);
            sort(xPoint, partitionIndex + 1, high);
        }
    }
    
    public int maxWidthOfVerticalArea(int[][] points) 
    {
        List<Integer> xPoint=new ArrayList<>();
        int n=points.length;
        int i;
        for(i=0;i<n;i++)
        {
            xPoint.add(points[i][0]);
        }
        sort(xPoint,0,n-1);
        System.out.println(Arrays.toString(xPoint.toArray()));
        int max=0,temp;
        for(i=1;i<n;i++)
        {
            temp=xPoint.get(i)-xPoint.get(i-1);
            max=Math.max(max,temp);
        }
        return max;
    }
}