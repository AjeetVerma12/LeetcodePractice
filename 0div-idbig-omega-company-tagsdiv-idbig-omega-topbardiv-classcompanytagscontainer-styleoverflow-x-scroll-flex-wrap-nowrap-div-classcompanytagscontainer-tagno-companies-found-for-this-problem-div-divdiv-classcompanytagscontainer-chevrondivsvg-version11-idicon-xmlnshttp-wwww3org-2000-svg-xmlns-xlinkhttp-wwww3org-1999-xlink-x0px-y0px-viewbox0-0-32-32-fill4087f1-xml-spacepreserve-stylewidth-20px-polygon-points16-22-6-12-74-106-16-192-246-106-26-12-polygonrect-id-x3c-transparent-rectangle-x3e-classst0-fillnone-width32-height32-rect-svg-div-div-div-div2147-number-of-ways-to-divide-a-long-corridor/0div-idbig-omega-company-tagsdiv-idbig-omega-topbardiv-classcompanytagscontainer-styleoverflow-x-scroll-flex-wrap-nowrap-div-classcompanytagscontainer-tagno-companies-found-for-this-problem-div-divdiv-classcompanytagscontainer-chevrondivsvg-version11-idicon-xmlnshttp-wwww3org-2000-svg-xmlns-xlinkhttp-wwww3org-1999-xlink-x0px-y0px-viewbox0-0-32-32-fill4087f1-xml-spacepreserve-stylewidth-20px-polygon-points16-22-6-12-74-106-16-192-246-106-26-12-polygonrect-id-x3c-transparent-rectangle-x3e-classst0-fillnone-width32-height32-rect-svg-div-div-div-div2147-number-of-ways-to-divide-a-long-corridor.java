class Solution {
    public int numberOfWays(String corridor) {
        List<Integer> temp=new ArrayList<>();
        int l=corridor.length();
        // int count=0;
        int pC=0;
        for(int i=0;i<l;i++) {
            if(corridor.charAt(i)=='S') {
                temp.add(i);
            }
        }
        int count=temp.size();
        if(count==0 || count%2==1) {
            return 0;
        }
        if(count==2) {
            return 1;
        }
        long ans=1;
        int mod=(int)1e9 +7;
        for(int i=2;i<count;i+=2) {
            ans=(ans*(temp.get(i)-temp.get(i-1)))%mod;
        }
        return (int)ans;
        //         count++;
        //         if(count%2==0) {
        //             temp.add(pC+1);
        //             pC=0;
        //         }
        //     }
        //     else if(corridor.charAt(i)=='P' && count%2==0 && count>0){
        //         pC++;
        //     }
        // }
        // if(pC>0) {
        //     temp.add(pC+1);
        // }
        // if(count%2!=0 || count==0) {
        //     return 0;
        // }
        // if(count==2) {
        //     return 1;
        // }
        // int ans=1;
        // int mod=(int) 1e9 +7;
        // for(int i=0;i<temp.size();i++) {
        //     ans=(ans*temp.get(i))%mod;
        // }
        // return ans;
    }
}