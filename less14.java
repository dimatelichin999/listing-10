import java.util.Arrays;

class less14 {

    public static void main(String args[]){

        int [] a = {11,22,33,44,55,66,77,88,99,100};

        int index = 2;
        int value = 25;
        System.out.println(" Перший Масив" + Arrays.toString(a));

        for (int i = a.length -1; i > index; i-- ){
            a [i] = a [i - 1];
        }
        a[index] = value;
        System.out.println("Змінений масив" + Arrays.toString(a));
    }
}
