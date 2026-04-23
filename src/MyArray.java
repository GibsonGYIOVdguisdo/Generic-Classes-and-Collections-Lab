import java.sql.Array;
import java.util.function.Predicate;

public class MyArray<T> {
    public static void main(String[] args){
        Integer[] testArr = new Integer[10];
        MyArray<Integer> myArray = new MyArray<Integer>(testArr);

        myArray.set(1, 4);
        myArray.set(7, 2);
        myArray.set(9, 7);

        printGenericArray(myArray);

        Predicate isNull = new Predicate() {
            @Override
            public boolean test(Object o) {
                return o == null;
            }
        };

        int nullCount = myArray.countPropertyElements(isNull);

        System.out.println("Null Count: " + nullCount);
    }

    private T[] arr;

    MyArray(T[] arr){
        this.arr = arr;
    }

    // We cannot initialise T directly as we do not know what the type is and if it will work
//    MyArray(){
//        this.arr = new T[20];
//    }

    int size(){
        return this.arr.length;
    }

    T get(int index){
        return this.arr[index];
    }

    void set(int index, T value){
        this.arr[index] = value;
    }

    int countPropertyElements(Predicate p){
        int count = 0;
        for (T v : arr){
            if (p.test(v)){
                count++;
            }
        }
        return count;
    }

    static void printGenericArray(MyArray myArray){
        for (int i = 0; i < myArray.size(); i++){
            System.out.println(myArray.get(i));
        }
    }=

}
