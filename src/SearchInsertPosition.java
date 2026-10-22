//Question :- https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main (String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }
    public static int searchInsert (int[] nums, int target){
        int ans = search(nums, target);
        if(nums[ans]<target){
            return ans+1;
        }
        else{
            return ans;
        }
    }
    public static int search (int[] nums, int target){
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid= s+(e-s)/2;
            if(nums[mid] < target){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return s;
    }
}
