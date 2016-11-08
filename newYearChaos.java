import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T > 0) {
            in.nextLine();
            int n = in.nextInt();
            int changes = 0;
            boolean chaos = false;
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
            }
            
            for(int i=0;i<arr.length;i++) {
                if (arr[i] - (i+1) > 2) {
                    chaos = true;
                    System.out.println("Too chaotic");
                    break;
                }
                for (int j=Math.max(0,arr[i]-2);j<i;j++) {
                    if (arr[j] > arr[i]) changes++;
                }
            }
            
            
            if (!chaos) System.out.println(changes);
            T--;
        }
    }
}