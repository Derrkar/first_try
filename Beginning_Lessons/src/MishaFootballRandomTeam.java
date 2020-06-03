public class MishaFootballRandomTeam {
        public static void main(String[] args) {
            //   int a = (int) (Math.random()*19);
            int[] teams = new int[20];
            int n = 0;
                for (int i = 0; n<19; i++){
                    int a = (int) (Math.random()*20);
                    teams[a]++;
                    if (teams[a] == 10) n++;
                }
                for (int i = 0; i<20; i++){
                    System.out.println("Team number <" + (i+1) + ">     has " + teams[i] );
                }
        }
    }