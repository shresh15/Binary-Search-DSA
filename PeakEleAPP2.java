// Given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist). If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

// Note: Consider the element before the first element and the element after the last element to be negative infinity.
class Solution {

    public int peakElement(int[] arr) {
       int n=arr.length;
        for (int i=0;i<n;i++){
            if((i==0||arr[i]>arr[i-1]) && (i==n-1 || arr[i]> arr[i+1]))
                return i;
                
            
        }
        return -1;
        // code here
    }
}