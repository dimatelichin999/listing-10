import java.util.Scanner;

public class less1 {

    public static void main(String args[]){
int i = 0;
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int [ ] array;
        if (a < 10 )
            array = new int[10];
        else
                array = new int [20];
        for (a = 0  ; i < array.length; i++){
        System.out.println(i);}
    }

}
