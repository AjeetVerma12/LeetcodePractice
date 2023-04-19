class Solution {
    public int[][] sortTheStudents(int[][] score, int k) 
    {
        int m=score.length;
        int n=score[0].length;
        int i,j,x,temp;
        for(i=0;i<m-1;i++)
        {
            for(j=0;j<m-i-1;j++)
            {
                if(score[j][k]<score[j+1][k])
                {
                    for(x=0;x<n;x++)
                    {
                        temp=score[j][x];
                        score[j][x]=score[j+1][x];
                        score[j+1][x]=temp;
                    }
                }
            }
        }
        return score;
    }
}