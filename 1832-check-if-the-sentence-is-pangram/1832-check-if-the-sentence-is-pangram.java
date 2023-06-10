class Solution {
    public boolean checkIfPangram(String sentence) {
        int seen = 0;
        
        for (char currChar : sentence.toCharArray()) {
            int mappedIndex = currChar - 'a';
            int currBit = 1 << mappedIndex;
            seen |= currBit;
        }
        
        return seen == (1 << 26) - 1;
    }
}