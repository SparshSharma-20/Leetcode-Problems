//Question :- https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[2];
        ans = solution(numbers,target);
        for (int a:ans){
            System.out.println(a);
        }
    }
    public static int[] solution(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length-1;
        int[] arr = {-1,-1};
        while (s<e){
            if (numbers[s]+numbers[e] == target){
                arr[0] = s+1;
                arr[1] = e+1;
                return arr;
            }
            else{
                if (numbers[s]+numbers[e] < target){
                    s++;
                }
                else if (numbers[s]+numbers[e] > target){
                    e--;
                }
            }
        }
        return arr;
    }
}
