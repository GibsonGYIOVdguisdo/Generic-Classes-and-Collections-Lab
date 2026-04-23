import java.util.ArrayList;
import java.util.Arrays;

public class SubtypingTest {
    public static void main(String[] args){
        Number[] ar;
        ArrayList<Number> al;

        Integer[] ari = new Integer[12];
        for (int i = 0; i < ari.length; i++){
            ari[i] = i;
        }

        // This works because Integer is a subtype of Number (it extends Number)
        // After it is set 'ar' is treated as an Integer array, and you will not be able to insert other Number subtypes
        ar = ari;

        ArrayList<Integer> ali = new ArrayList<>(
                Arrays.asList(ari)
        );

        // ar = ali;
        // This doesn't work as 'ar' is an array and ali is an ArrayList
        // This is different from 'ar = ari' as they are both Arrays
    }
}
