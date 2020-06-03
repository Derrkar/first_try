import java.util.Arrays;

class Program {

    static void showPermutations(int[] arr) {
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println(Arrays.toString(arr) + "        Permutation № " + n++);
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] massive = {1,2,3,4};
        showPermutations(massive);
    }
}