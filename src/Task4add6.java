import java.util.Arrays;
import java.util.Random;
public class Task4add6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(mass));
        int min = 0;
        int max = 0;
        int match = 0;
        for (int x = 0; x < mass.length-1; x++) {
            for (int i = 0; i < mass.length; i++) {
                for (int q = 0; q < mass.length - 1; q++) {
                    if (mass[q] > mass[q + 1]) {
                        min = mass[q + 1];
                        max = mass[q];
                        mass[q] = min;
                        mass[q + 1] = max;
                    }
                }
            }
            if (mass[x]==mass[x+1]) {
                match+=1;
            }
        }
        if (match>0){
            System.out.println("В массиве совпадают "+match+" пар");
        }else {
            System.out.println("Все элементы массива различны");
        }
        System.out.println(Arrays.toString(mass));
        System.out.println();
    }
}

