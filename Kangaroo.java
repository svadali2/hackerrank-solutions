{\rtf1\ansi\deff0\nouicompat{\fonttbl{\f0\fnil\fcharset0 Calibri;}}
{\*\generator Riched20 10.0.14393}\viewkind4\uc1 
\pard\sa200\sl276\slmult1\f0\fs22\lang9 import java.io.*;\par
import java.util.*;\par
import java.text.*;\par
import java.math.*;\par
import java.util.regex.*;\par
\par
public class Solution \{\par
\par
    public static void main(String[] args) \{\par
        Scanner in = new Scanner(System.in);\par
        float x1 = in.nextFloat();\par
        float v1 = in.nextFloat();\par
        float x2 = in.nextFloat();\par
        float v2 = in.nextFloat();\par
        float n = (x2-x1)/(v1-v2);\par
        if (n > 0 && n-(int)n == 0) System.out.println("YES");\par
        else System.out.println("NO");\par
        return;\par
    \}\par
\}\par
}
 