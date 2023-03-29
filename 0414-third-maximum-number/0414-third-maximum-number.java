import java.util.*;
class Solution {
    public int thirdMax(int[] nums) 
    {
        Set <Integer> maxElements = new HashSet <>();
        for(int element : nums)
        {
            maxElements.add(element);
            if(maxElements.size() > 3)
                maxElements.remove(Collections.min(maxElements));
        }
        if(maxElements.size() == 3)
            return Collections.min(maxElements);
        return Collections.max(maxElements);
    }
}