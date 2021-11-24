import java.util.Arrays;
import java.util.Random;
public class Task4add2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass = new int [15];
        int x=0;
        for (int i=0;i< mass.length;i++){
            mass[i]= random.nextInt(11);
            if (mass[i]%2!=0){
                x+=1;
            }
        }
        System.out.println(Arrays.toString(mass));
        int q=0;
        int y=0;
        for (int i=0;i< mass.length;i++){
            if(mass[i]%2!=0){
                q+=1;
                y+=mass[i]/q;
            }

        }
        System.out.println("Среднее арифметическое значение нечетных элементов: "+y);

    }
}
