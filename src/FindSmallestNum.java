//Question :- https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class FindSmallestNum {
    public static void main (String[] args){
        char[] letters = {'x','x','y','y'};
        char target = 'z';

        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter (char[] letters,char target){
        char ans = search(letters,target);
        if(ans <= target){
            return letters[0];
        }
        return ans;
    }
    public static char search (char[] letters, char target){
        int s = 0;
        int e = letters.length-1;
        while(s<e){
            int mid = s + (e-s)/2;
            if (letters[mid] <= target){
                s = mid+1;
            }
            else{
                e = mid;
            }
        }
        return letters[s];
    }
}
