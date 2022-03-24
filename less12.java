import java.util.Arrays;

public class less12 {

    public static void main(String args[]){

        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10,};

        System.out.println("Оригінальний маси:" + Arrays.toString(array));

        int r = 1;

        for(int i = r; i < array.length -1; i++){
        array[i] = array[i + 1];
        }
        System.out.println("Після видилення другого елемента:" + Arrays.toString(array));
    }
}
