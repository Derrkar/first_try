public class Multidimensional_Arrays {
    public static void main(String[] args) {
        /**
         * 1,2,3,4,5,6,7,0,-1<-2
         *
         * 156
         * 376 [1][1]
         * 268
         */
        /* System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        System.out.println(matrice[0][4]);

        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]); */
        int[] number = {1,2,3};
        int[][] matrice = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        for(int i = 0; i<matrice.length; i++){
            for(int j = 0; j<matrice.length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
