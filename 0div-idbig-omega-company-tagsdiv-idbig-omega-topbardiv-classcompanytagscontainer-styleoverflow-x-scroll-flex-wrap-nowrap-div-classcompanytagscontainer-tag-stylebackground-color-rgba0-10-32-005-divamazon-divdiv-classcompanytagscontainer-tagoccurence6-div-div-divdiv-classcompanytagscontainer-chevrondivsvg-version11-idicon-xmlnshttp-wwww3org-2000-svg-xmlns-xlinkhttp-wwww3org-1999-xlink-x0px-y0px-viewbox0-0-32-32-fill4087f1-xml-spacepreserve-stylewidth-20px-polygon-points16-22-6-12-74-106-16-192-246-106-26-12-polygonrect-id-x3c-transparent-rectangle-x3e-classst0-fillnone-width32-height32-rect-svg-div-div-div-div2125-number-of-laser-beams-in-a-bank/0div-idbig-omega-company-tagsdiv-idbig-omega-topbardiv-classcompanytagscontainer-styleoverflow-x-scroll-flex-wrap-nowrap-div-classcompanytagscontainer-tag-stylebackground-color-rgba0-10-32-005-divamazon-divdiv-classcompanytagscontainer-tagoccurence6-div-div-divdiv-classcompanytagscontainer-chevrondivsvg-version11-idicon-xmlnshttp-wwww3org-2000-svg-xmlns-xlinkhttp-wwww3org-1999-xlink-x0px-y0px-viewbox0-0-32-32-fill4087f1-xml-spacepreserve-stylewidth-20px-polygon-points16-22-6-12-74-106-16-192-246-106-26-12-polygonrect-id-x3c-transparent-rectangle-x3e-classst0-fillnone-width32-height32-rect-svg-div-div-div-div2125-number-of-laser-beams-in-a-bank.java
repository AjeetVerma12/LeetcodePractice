class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int m=bank.length;
        List<Integer> temp=new ArrayList<>();
        for(int i=0;i<m;i++) {
            int count=0;
            for(int j=0;j<bank[i].length();j++) {
                if(bank[i].charAt(j)=='1') {
                    count++;
                }
            }
            if(count>0) {
                temp.add(count);
            }
        }
        int size=temp.size();
        if(size<2) {
            return ans;
        }
        for(int i=1;i<size;i++) {
            ans=ans+((temp.get(i))*(temp.get(i-1)));
        }
        return ans;
    }
}