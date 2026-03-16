import java.util.*;

public class Solution {

    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCount = 0;
        int orangeCount = 0;

        for (int apple : apples) {
            int position = a + apple;
            if (position >= s && position <= t) {
                appleCount++;
            }
        }

        for (int orange : oranges) {
            int position = b + orange;
            if (position >= s && position <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int t = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] apples = new int[m];
        int[] oranges = new int[n];

        for (int i = 0; i < m; i++) {
            apples[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            oranges[i] = sc.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        sc.close();
    }
}
