class Solution {
    public boolean winnerOfGame(String colors) {
        int l=colors.length();
        int countAlice=0,countBob=0;
        int i;
        for(i=1;i<l-1;i++) {
            char ch=colors.charAt(i);
            if(colors.charAt(i-1)==ch && ch==colors.charAt(i+1)) {
                if(ch=='A') {
                    countAlice++;
                }
                else {
                    countBob++;
                }
            }
        }
        if(countAlice>countBob) {
            return true;
        }
        else {
            return false;
        }
    }
}