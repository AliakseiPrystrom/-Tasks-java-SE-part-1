import java.util.Arrays;
import java.util.Random;
public class Task4add8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass = new int [15];
        for (int i=0;i< mass.length;i++){
            mass[i]= random.nextInt(11);
        }
        System.out.println(Arrays.toString(mass));
        int max=0;
        int maxI=0;
        for (int i=0;i< mass.length;i++){
            if (mass[i]>max){
                max=mass[i];
                maxI=i;
            }
        }
        mass[maxI]=mass[mass.length-1];
        mass[mass.length-1]=max;
        System.out.println(max+" Первый по величине.");
        int max2=0;
        for (int i=0;i< mass.length-2;i++){
            if (mass[i]>max2&&mass[i]!=max){
                max2=mass[i];
            }
        }
        System.out.println(max2+" Второй по величине.");
    }
}
