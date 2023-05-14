class Solution {
    public int minMovesToSeat(int[] seats, int[] students) 
    {
        int n=seats.length;
        Arrays.sort(seats);
        Arrays.sort(students);
        int i,moves=0;
        for(i=0;i<n;i++)
        {
            moves+=Math.abs(students[i]-seats[i]);
        }
        return moves;
    }
}