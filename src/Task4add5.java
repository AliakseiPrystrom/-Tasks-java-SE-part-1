import java.util.Arrays;
import java.util.Random;
public class Task4add5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass = new int [15];
        for (int i=0;i< mass.length;i++){
            mass[i]= random.nextInt(11);
        }
        System.out.println(Arrays.toString(mass));
        for (int i=0;i< mass.length;i++){
            if (i%2==0){
                mass[i]=0;
            }
        }
        System.out.println(Arrays.toString(mass));
    }
}
