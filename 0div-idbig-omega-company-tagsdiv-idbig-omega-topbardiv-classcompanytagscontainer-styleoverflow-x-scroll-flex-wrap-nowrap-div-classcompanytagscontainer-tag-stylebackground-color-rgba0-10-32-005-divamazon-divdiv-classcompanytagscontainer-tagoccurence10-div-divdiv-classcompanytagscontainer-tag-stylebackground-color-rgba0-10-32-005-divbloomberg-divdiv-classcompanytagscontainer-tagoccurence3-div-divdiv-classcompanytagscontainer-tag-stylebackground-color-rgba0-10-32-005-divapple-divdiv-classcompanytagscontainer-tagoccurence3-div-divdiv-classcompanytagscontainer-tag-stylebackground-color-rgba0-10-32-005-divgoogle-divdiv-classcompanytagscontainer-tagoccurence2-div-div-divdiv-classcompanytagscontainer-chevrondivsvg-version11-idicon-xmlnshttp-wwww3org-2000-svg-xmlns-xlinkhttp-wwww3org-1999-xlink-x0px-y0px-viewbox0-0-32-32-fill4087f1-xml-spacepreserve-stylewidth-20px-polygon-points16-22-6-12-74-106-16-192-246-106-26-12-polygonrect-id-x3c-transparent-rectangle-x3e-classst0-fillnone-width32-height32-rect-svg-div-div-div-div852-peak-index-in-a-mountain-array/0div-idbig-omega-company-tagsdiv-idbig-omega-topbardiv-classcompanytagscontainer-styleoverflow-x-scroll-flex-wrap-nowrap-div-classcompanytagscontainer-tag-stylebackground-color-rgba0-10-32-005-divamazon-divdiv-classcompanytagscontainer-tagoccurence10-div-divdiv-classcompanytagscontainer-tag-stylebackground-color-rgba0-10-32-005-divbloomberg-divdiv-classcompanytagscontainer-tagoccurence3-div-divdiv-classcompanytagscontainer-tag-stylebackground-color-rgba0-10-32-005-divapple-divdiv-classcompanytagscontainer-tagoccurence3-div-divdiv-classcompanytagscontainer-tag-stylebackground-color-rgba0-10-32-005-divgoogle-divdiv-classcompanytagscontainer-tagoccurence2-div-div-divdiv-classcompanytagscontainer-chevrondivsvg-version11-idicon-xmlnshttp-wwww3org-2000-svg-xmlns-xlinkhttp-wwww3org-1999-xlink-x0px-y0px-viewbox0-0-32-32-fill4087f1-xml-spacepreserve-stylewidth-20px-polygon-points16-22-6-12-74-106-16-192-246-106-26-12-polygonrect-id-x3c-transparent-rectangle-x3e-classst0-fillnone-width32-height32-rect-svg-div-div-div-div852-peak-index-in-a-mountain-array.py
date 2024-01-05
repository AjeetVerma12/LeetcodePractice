class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        low = 0
        high = len(arr)-1
        
        while low<high:
            
            mid = low+(high-low)//2
            
            if arr[mid]>arr[mid+1]: #decreasing part of array, look in left
                high=mid  #checking the left half of the array for greater element
                
            else:
                low=mid+1 #checking the right half or array for greater
                
        return low