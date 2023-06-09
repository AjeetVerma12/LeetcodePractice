class Solution {
    public int[][] flipAndInvertImage(int[][] image)
    {
        int n=image.length;
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n+1)/2;j++)
            {
                temp=image[i][j];
                image[i][j]=image[i][n-j-1];
                image[i][n-j-1]=temp;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                image[i][j]^=1;
            }
        }
        return image;
    }
}