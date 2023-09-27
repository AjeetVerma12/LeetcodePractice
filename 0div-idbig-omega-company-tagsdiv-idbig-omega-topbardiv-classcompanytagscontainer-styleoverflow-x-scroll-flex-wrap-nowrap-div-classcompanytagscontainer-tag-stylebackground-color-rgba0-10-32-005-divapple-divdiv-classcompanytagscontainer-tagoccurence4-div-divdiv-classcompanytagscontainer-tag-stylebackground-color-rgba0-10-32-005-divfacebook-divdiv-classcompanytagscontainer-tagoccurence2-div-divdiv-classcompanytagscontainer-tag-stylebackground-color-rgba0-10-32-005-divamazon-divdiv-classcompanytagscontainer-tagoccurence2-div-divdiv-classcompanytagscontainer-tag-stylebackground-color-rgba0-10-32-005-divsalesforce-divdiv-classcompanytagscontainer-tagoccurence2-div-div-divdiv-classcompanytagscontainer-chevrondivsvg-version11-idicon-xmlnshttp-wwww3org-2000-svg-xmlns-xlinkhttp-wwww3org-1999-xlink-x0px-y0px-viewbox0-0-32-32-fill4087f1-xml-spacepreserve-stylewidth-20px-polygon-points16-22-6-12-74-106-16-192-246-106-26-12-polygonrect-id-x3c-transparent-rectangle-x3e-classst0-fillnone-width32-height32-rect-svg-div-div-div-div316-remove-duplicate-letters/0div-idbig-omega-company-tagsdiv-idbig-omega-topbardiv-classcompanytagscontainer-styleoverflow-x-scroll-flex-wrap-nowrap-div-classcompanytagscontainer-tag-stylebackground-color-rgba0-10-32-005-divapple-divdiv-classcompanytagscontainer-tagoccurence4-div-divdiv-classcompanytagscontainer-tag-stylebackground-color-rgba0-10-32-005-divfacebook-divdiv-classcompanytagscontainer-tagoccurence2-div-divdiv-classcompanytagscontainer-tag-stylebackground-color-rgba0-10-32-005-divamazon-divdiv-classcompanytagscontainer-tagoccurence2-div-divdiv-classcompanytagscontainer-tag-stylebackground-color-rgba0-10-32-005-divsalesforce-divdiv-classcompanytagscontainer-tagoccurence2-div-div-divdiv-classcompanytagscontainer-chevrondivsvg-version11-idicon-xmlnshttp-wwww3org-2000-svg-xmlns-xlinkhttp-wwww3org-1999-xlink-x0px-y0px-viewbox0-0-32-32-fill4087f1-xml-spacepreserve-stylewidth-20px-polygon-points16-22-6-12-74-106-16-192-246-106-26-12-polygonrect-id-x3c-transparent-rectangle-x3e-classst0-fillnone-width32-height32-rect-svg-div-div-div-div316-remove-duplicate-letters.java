class Solution {
    public String removeDuplicateLetters(String s) {
        int l=s.length();
        int last[]=new int[26];
        int i;
        for(i=0;i<l;i++) {
            last[s.charAt(i)-'a']=i;
        }
        Stack<Character> stk = new Stack<>();
        boolean taken[]=new boolean[26];
        for(i=0;i<l;i++) {
            char ch=s.charAt(i);
            if(stk.empty()) {
                stk.push(ch);
                taken[ch-'a']=true;
            }
            else if(taken[ch-'a']) {
                continue;
            }
            else if(stk.peek()<ch) {
                stk.push(ch);
                taken[ch-'a']=true;
            }
            else {
                for(;;) {
                    if(stk.empty()) {
                        stk.push(ch);
                        taken[ch-'a']=true;
                        break;
                    }
                    else if(stk.peek()>ch) {
                        if(last[stk.peek()-'a']>i) {
                            taken[stk.pop()-'a']=false;
                        }
                        else {
                            stk.push(ch);
                            taken[ch-'a']=true;
                            break;
                        }
                    }
                    else {
                        stk.push(ch);
                        taken[ch-'a']=true;
                        break;                        
                    }
                }
            }
        }
        String ans="";
        while(!stk.empty()) {
            ans=stk.pop()+ans;
        }
        return ans;
    }
}