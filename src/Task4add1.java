import java.util.Arrays;
import java.util.Random;
public class Task4add1 {
    public static void main(String[] args) {
    Random random = new Random();
    int[]mass = new int [15];
    for (int i=0;i< mass.length;i++){
        mass[i]= random.nextInt(11);
    }
    System.out.println(Arrays.toString(mass));
    int x=0;
    for (int i=0;i< mass.length;i++){
        if (mass[i]%3==0);
        x+=mass[i];
    }
        System.out.println("Сумма чисел кратных трём "+x);
    }
}
