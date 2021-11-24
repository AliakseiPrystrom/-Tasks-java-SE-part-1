import java.util.Arrays;
import java.util.Random;
public class Task4add4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[]mass = new int [15];
        for (int i=0;i< mass.length;i++){
            mass[i]= random.nextInt(11);
        }
        System.out.println(Arrays.toString(mass));
        int min=0;
        for (int i=0;i< mass.length;i++){
            if (mass[i]%2!=0){
                if(mass[i]>min&&min==0){
                    min=mass[i];
                }
                if (mass[i]<min){
                    min=mass[i];
                }
            }
        }
        System.out.println(min+" Наименьший нечетный элемент.");
        }

    }

