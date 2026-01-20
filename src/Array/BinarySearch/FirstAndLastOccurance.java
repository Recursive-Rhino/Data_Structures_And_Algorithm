package Array.BinarySearch;

class FirstAndLastOccurance {
    public int[] searchRange(int[] nums, int target) {
        if(LowerBound(nums,target)==nums.length || nums[LowerBound(nums,target)]!=target){
            return new int[] {-1,-1};
        }
        return new int[]{LowerBound(nums,target),UpperBound(nums,target)-1};
    }
    public int LowerBound(int[]arr,int search) {
        int low=0;
        int high=arr.length-1;

        int SmallestIndex=arr.length;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]>=search) {
                SmallestIndex=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return SmallestIndex;
    }
    public int UpperBound(int[]arr,int search) {
        int low=0;
        int high=arr.length-1;
        int UpperBoundIndex=arr.length;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]>search) {
                UpperBoundIndex=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return UpperBoundIndex;
    }
}
