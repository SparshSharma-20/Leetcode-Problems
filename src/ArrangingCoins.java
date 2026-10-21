import java.util.Scanner;
public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of coins: ");
        int n = sc.nextInt();
        System.out.println("number of complete rows: "+arrangeCoins(n));
    }
    public static int arrangeCoins(int n){
        int count = 0;
        for (int i = 1; i<=n; i++){
            count = i;
            n-=i;
        }
        return count;
    }
}
