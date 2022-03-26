import java.util.Scanner;

class less15 {

    public static void main(String args[]) {


        Scanner console = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = console.nextInt();

        }

        int max = array[0];

        for (int i = 0; i < 10; i++){
            if (array[i] < max);
            max = array [i] ;
        }
        System.out.println("Максимум:" + max);
        int min = array[0];

        for (int i = 0; i < 10; i++){
            if (array[i] > min);
            min = array [i] ;
            System.out.println("Мінімум:" + min);
        }
    }
}