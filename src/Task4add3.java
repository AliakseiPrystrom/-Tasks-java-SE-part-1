import java.util.Random;
import java.util.Arrays;
public class Task4add3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass = new int[10];
        for (int i =0;i<mass.length;i++){
            mass[i]= random.nextInt(15);
            }
        System.out.println(Arrays.toString(mass));
        int c= random.nextInt(10);
        mass[random.nextInt(10)]=c;

        System.out.println(Arrays.toString(mass));
        int count=0;
        int count2=0;
        for (int i=0;i<mass.length;i++){
            if (c<mass[i]){
                count+=mass[i];
                count2+=1;
            }
        }
        int count3=count/count2;
        System.out.println("Число С "+c);
        System.out.println("Количество чисел превосходящих "+count2);
        System.out.println(count3+" Средне арифмитическое превосходящих число С.");

    }
}
