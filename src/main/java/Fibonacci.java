/*
  a = first
  b = second

    0 -> 0
    1 -> 1
    2 -> 1
    3 -> 2
    4 -> 3
    5 -> 5
 */

public class Fibonacci {

    int get(int index) {
        if (index == 0) return 0;
        if (index == 1) return 1;

        var a = 0;
        var b = 1;
        var x = 0;

        for (int i = 2; i <= index; i++) {
            x = a;
            a = b;
            b = b + x;

            // x = 0, a = 1, b = 1
        }

        return b;
    }

}
