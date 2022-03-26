import java.util.Arrays;

class less13 {

    public static void main(String[] args){

        int[] my_array = {11,22,33,44,55,66,77,88,90,100,};
        int[] new_array = new int[10];

        System.out.println("Маємо такий масив:" + Arrays.toString(my_array));

        for (int i=0; i < my_array.length; i++){
            new_array[i] = my_array[i];


        }
        System.out.println("Маємо копію масива a" + Arrays.toString(new_array));




    }
}
