class Solution {
    public boolean isNumber(String s)
    {
        int n = s.length();
        int i = 0;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            ++i;
        }
        
        if (i == n) {
            return false;
        }
        if(s.charAt(i)=='e'||s.charAt(i)=='E')
        {
            return false;
        }
        if (s.charAt(i) == '.'
            && (i + 1 == n || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'E')) {
            return false;
        }
        int dot = 0, e = 0;
        for (; i < n; ++i) 
        {
            if (s.charAt(i) == '.') 
            {
                if (e > 0 || dot > 0) 
                {
                    return false;
                }
                ++dot;
            } 
            else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') 
            {
                if (e > 0 || i == n - 1) 
                {
                    return false;
                }
                ++e;
                if (s.charAt(i + 1) == '+' || s.charAt(i + 1) == '-') 
                {
                    if (++i == n - 1) 
                    {
                        return false;
                    }
                }
            } 
            else if (s.charAt(i) < '0' || s.charAt(i) > '9') 
            {
                return false;
            }
        }
        return true;
    }
}