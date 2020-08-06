
    import java.util.*;
    public class ZombieAttack {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] inhabitants = new int[8];
            for(int i=0; i<inhabitants.length; i++) {
                inhabitants[i] = input.nextInt();
            }
            //TODO. Write you code below this line.
            int cnt = 0, sum = 0;
            int[] num1 = new int[inhabitants.length];
            System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
            do {
                for (int i = 0; i < inhabitants.length; i++) {
                    if (i < inhabitants.length - 1) {
                        if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                            inhabitants[i] /= 2;
                        }
                        if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                            inhabitants[i + 1] /= 2;
                            i += 1;
                        }
                    }
                }
                cnt++;
                System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
            } while (!Arrays.equals(inhabitants,num1));
            System.out.println("---- EXTINCT ----");
        }
    }
