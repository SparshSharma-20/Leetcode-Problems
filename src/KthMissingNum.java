//Question :- https://leetcode.com/problems/kth-missing-positive-number/

public class KthMissingNum {
    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 2;

        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive (int[] arr, int k){
        int a = 1;
        int index = 0;
        int[] missing = new int[k];
        while(missing[k-1]== 0){
            int find = search(a,arr);
            if (find != a){
                missing[index] = a;
                index++;
            }
            a++;
        }
        return missing[k-1];
    }
    public static int search(int a,int[] arr){
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if (arr[mid] == a){
                return arr[mid];
            }
            else if(arr[mid] < a){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
