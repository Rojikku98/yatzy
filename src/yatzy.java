import java.util.Random;
import java.util.Scanner;

/**
 * Created by edvin.bergstrom on 2015-12-02.
 */
public class yatzy {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int t[]= new int[5];
        int i, r,k=0,j;
        String sr;
        for (i = 0; i <= 4 ; i++){
            t[i]= random.nextInt(5)+1;
            System.out.println(t[i]);
        }
        for (i = 0 ;i < 3 ; i++){
        System.out.println("Villka vill du så om? x_x_x...");
        sr = in.nextLine();
        for (i = 0; i<= 10; i+=2 ){
            try {
                r = sr.charAt(i);
            }catch(Exception e){
                break;
            }
            t[r] = random.nextInt(5)+1;
        }
        }

        for (i = 4 ; i <= 0; i++){
            for ( j = 0; j<i; j++ ){
                if (t[i]<t[i+1]){
                    int temp = t[i];
                    t[i] = t[i+1];
                    t[i+1] = t[i];
                }
            }
        }
        for (i = 0; i <= 4 ; i++){
            System.out.println(t[i]);
        }
    }

}
