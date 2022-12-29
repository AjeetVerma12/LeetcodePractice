//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int num=n,d,arm=0;
        for(;num!=0;num/=10)
        {
            d=num%10;
            arm=arm+((int)Math.pow(d,3));
        }
        if(arm==n)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}