import java.util.Arrays;
import java.util.Scanner;

class less6 {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int[] array = new int[13];
        for (int i=0; i < 13 ; i++){
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Відсортировані числа" +Arrays.toString(array) );
    }
}
