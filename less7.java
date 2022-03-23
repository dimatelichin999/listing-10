import java.util.Scanner;

public class less7 {

    public static void main(String args[]) {

      int sum = 0;

      int [] array = new int[] {3, 4 , 5 ,7,9};

      for (int i : array)
          sum += i;
        System.out.println("Сумування чисел" + sum);

    }
}
