import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,5,3,6,7,4,2};
reverse(array);


    }


    public static void reverse(int[] array) {

        int[] reverse = new int[array.length];

        int i = array.length - 1;
        int a = 0;
        while (i >= 0) {
            reverse[a] = array[i];
            i--;
            a++;
        }
        System.out.println(Arrays.toString(reverse));

}}