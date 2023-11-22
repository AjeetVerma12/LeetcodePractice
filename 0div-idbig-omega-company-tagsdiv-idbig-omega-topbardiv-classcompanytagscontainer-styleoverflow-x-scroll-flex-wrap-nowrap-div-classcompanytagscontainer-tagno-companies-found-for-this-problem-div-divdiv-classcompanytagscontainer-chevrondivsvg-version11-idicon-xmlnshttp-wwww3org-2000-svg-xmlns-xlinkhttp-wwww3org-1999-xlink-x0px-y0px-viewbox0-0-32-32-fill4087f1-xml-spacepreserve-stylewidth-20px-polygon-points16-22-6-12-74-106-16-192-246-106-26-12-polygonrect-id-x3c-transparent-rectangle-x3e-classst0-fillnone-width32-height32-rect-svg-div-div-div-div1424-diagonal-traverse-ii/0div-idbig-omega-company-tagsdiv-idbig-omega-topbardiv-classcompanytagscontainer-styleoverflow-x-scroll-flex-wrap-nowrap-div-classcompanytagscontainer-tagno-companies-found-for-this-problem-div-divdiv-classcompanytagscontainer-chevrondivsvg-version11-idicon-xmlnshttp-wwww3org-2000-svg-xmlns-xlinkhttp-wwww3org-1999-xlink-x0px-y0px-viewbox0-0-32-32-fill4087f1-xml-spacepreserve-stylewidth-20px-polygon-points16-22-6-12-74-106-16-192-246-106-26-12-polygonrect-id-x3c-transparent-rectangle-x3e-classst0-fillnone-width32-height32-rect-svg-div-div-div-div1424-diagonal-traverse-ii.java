class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        // int m=nums.size();
        // int max=0;
        // int total=0;
        // for(int i=0;i<m;i++) {
        //     total+=nums.get(i).size();
        //     max=Math.max(max,i+(nums.get(i).size())-1);
        // }
        // int ans[]=new int[total];
        // int count=0;
        // for (int i=0;i<=max;i++) {
        //     for(int j=i,k=0;j>=0 && k<=i;j--,k++) {
        //         if(j+k==i) {
        //             if(j<m && k<nums.get(j).size()) {
        //                 ans[count++]=nums.get(j).get(k);
        //             }
        //         }
        //     }
        // }
        // return ans;
        
        int n=nums.size();
        int count=0;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=n-1;i>=0;i--) {
            int size=nums.get(i).size();
            for(int j=0;j<size;j++) {
                if(!map.containsKey(i+j)) {
                    List<Integer> temp=new ArrayList<>();
                    map.put((i+j),temp);
                }
                map.get(i+j).add(nums.get(i).get(j));
                count++;
            }
        }
        int ans[]=new int[count];
        int diag=0;
        int index=0;
        while(map.containsKey(diag)) {
            for(int val:map.get(diag)) {
                ans[index++]=val;
            }
            diag++;
        }
        return ans;
    }
}