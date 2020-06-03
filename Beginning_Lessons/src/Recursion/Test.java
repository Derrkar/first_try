package Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(4));
    }

    // fac(4) = 24
    // 4 * fac(3) 4 * 3 * 2 *1
    // 3 * fac(2) 3 * 2 * 1
    // 2 * fac(1) 2 * 1
    // fac(1) = return 1;

    private static int fac(int n) {
        if (n == 1)
            return 1;

        return n * fac(n - 1);
    }

}
