//Question :- https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static void main (String[] args){
        int num = 16;

        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;
        while (s<=e){
            int mid = s + (e-s)/2;
            if ((long) mid*mid == num){
                return true;
            }
            else if ((long) mid*mid < num){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return false;
    }
}
