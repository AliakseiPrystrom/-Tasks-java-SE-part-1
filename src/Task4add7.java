import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task4add7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[]mass = new int[200];
        System.out.println("Введите число от 0 до 20 включительно");
        int x= scanner.nextInt();
        int y=0;
        for (int i=0;i<mass.length;i++){
            mass[i]= random.nextInt(21);
            if (mass[i]==x){
                y+=1;
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(y+" - Столько раз повторяется в цикле это число.");
    }
}
