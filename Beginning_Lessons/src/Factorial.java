class Factorial {

    //   
    int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;

        return result;

    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println("Factorial 5 = " + fact.fact(5));
    }
}