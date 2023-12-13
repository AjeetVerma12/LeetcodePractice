class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int i,j;
        int row[]=new int[m];
        // int col[]=new int[n];
        for(i=0;i<m;i++) {
            for(j=0;j<n;j++) {
                row[i]+=mat[i][j];
            }
        }
        int ans=0;
        for(i=0;i<m;i++) {
            if(row[i]==1) {
                for(j=0;j<n;j++) {
                    if(mat[i][j]==1) {
                        int sum=0;
                        for(int k=0;k<m;k++) {
                            sum=sum+mat[k][j];
                        }
                        if(sum==1) {
                            ans++;
                        }
                        break;
                    }
                }
            }
        }
        return ans;
    }
}