import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1 = in.nextFloat();
        float v1 = in.nextFloat();
        float x2 = in.nextFloat();
        float v2 = in.nextFloat();
        float n = (x2-x1)/(v1-v2);
        if (n > 0 && n-(int)n == 0) System.out.println("YES");
        else System.out.println("NO");
        return;
    }
 }
}
