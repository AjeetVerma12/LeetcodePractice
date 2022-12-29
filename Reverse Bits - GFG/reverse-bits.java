//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        long m = X;
        long ar[] = new long[32];
        long b = 0,num=0;
        String s = "";
        int i, p=31;
        long d;
        for (i = 1; i <= 32; i++) 
        {
            if (m > 0) 
            {
                d=m%2;
                ar[p] = d;
                m = m / 2;
            } 
            else 
            {
                ar[p] = 0;
            }
            p--;
        }
        for (i = 31; i >= 0; i--) 
        {
            b=ar[i]*(long)Math.pow(2,i);
            num=num+b;
        }
        return num;
    }
};