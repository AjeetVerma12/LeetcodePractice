class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int i,count,max=0;
        for(i=0;i<sentences.length;i++)
        {
            count=0;
            for(;;)
            {
                int j=sentences[i].indexOf(' ');
                if(j==-1)
                {
                    break;
                }
                else
                {
                    count++;
                    sentences[i]=sentences[i].substring(0,j)+sentences[i].substring(j+1);
                }
            }
            count++;
            max=Math.max(count,max);
        }
        return max;
    }
}