// Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n1=a.length;
        int n2=b.length;
        if(n1>n2) return kthElement(b, a, k);
        int left=k;
        
        int low=Math.max(k-n2,0);
        int high=Math.min(k,n1);
        
        while(low<=high){
            
            int mid1=(low+high)/2;
            int mid2=left-mid1;
            
            int l1=(mid1>0)? a[mid1-1]: Integer.MIN_VALUE;
            int l2=(mid2>0)? b[mid2-1]: Integer.MIN_VALUE;
            int r1=(mid1<n1)? a[mid1] :Integer.MAX_VALUE;
            int r2=(mid2<n2)? b[mid2] :Integer.MAX_VALUE;
            
            if(l1<=r2 && l2<=r1) return Math.max(l1,l2);
            else if(l1>r2)high=mid1-1;
            else low=mid1+1;
            
        }
        return 0;
    }
}