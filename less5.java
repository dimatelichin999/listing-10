import java.util.Scanner;

class less5 {


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        String [] array = new String[10];

        for (int i = 0 ; i < 10; i++){
            array[i] = input.nextLine();
        }
        for ( int i = 9 ; i >= 0; i--){
            System.out.print(array[i]);
        }

    }
}
