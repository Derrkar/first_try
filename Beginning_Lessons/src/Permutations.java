public class Permutations {
    public static void main(String[] args) {
        int[] massive = {1,2,3,4};
        int[][] massive1 = new int[24][massive.length];
       // System.out.println( massive[0]);
        for (int i = 0; i<24; i++){
            for (int j = 0; j<massive.length; j++){
                massive1[i][j] = massive[j];
                System.out.print(massive1[i][j] + ",");
            }
            System.out.println();
        }
    }
}
