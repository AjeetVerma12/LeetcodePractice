class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a1=Math.abs(ax1-ax2)*Math.abs(ay1-ay2);
        int a2=Math.abs(bx1-bx2)*Math.abs(by1-by2);
        int common=0;
        if(!(by1 >= ay2 || by2 <= ay1 || bx1 >= ax2 || bx2 <= ax1)) {
            int height=Math.min(ax2,bx2)-Math.max(ax1,bx1);
            int width=Math.min(ay2,by2)-Math.max(ay1,by1);
            common=Math.abs(height)*Math.abs(width);
        }
        return a1+a2-common;
    }
}