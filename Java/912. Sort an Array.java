class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums,0,nums.length-1);
       return nums;
    }
    public void merge(int[] nums,int low,int mid,int high){
        int n = mid-low+1;
        int m = high-mid;
        int[] leftArr = new int[n];
        int[] rightArr = new int[m];
        System.arraycopy(nums,low,leftArr,0,n);
        System.arraycopy(nums,mid+1,rightArr,0,m);
        int i=0,j=0,k=low;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i] < rightArr[j]){
                nums[k] = leftArr[i];
                i++;
            }else{
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<leftArr.length){
            nums[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<rightArr.length){
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int[] nums,int low,int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(nums,low,mid);
            mergeSort(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }    
}