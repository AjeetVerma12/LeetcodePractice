class Solution {
    public String convert(String s, int numRows) 
    {
        int l=s.length();
        String ar[]=new String[numRows];
        Arrays.fill(ar,"");
        int i,rowNum=0;
        boolean down=true;
        if(numRows==1)
        {
            return s;
        }
        for(i=0;i<l;i++)
        {
            ar[rowNum]=ar[rowNum]+s.charAt(i);
            if(down)
            {
                rowNum++;
            }
            else if(!down)
            {
                rowNum--;
            }
            if(rowNum==numRows-1)
            {
                down=false;
            }
            else if(rowNum==0)
            {
                down=true;
            }
        }
        String str="";
        for(i=0;i<numRows;i++)
        {
            str=str+ar[i];
        }
        return str;
    }
}