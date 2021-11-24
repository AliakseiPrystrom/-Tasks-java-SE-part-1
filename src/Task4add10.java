import java.util.Arrays;
import java.util.Random;
public class Task4add10 {
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
        mass[maxI]=mass[0];
        mass[0]=max;
        System.out.println(max+" Максимальный элемент");
        System.out.println(Arrays.toString(mass));

    }
}
