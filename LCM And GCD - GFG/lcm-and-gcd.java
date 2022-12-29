//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        long x=A,y=B;
        long temp;
        long lcm,hcf;
        if(A==0 || B==0)
        {
            hcf=0;
            lcm=0;
        }
        else
        {
            while(y>0)
            {
                temp=y;
                y=x%y;
                x=temp;
            }
            hcf=x;
            lcm=(A*B)/(hcf);
        }
        Long ar[]={lcm,hcf};
        return ar;
    }
}