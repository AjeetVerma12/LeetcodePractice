class Solution {
    public int countNicePairs(int[] nums) {
        int l=nums.length;
        int ar[]=new int[l];
        for(int i=0;i<l;i++) {
            for(int j=nums[i];j!=0;j/=10) {
                ar[i]=(ar[i]*10)+(j%10);
            }
        }
        
        for(int i=0;i<l;i++) {
            ar[i]=nums[i]-ar[i];
        }
        
        int ans=0;
        int mod=(int)1e9+7;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<l;i++) {
            if(map.containsKey(ar[i])) {
                ans=(ans+map.get(ar[i]))%mod;
                map.put(ar[i],map.get(ar[i])+1);
            }
            else {
                map.put(ar[i],1);
            }
        }
        return ans;
    }
}