class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i;
        for(i=0;i<n;i++) {
            if(i!=(Integer.parseInt(nums[i],2))) {
                break;
            }
        }
        String binary = Integer.toBinaryString(i);
        int j=binary.length();
        for(;j<n;j++) {
            binary="0"+binary;
        }
        return binary;
    }
}