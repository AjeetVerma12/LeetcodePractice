class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int n=dist.length;
        double time[]=new double[n];
        int i;
        for(i=0;i<n;i++) {
            time[i]=(double) dist[i]/speed[i];
        }
        Arrays.sort(time);
        int count=0;
        for(i=0;i<n;i++) {
            if(time[i]<=i) {
                break;
            }
            else {
                count++;
            }
        }
        return count;
    }
}