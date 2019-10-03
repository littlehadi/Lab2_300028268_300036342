import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayTesting {
    static private final int CONST_SIZE = 105999999;

    public static void main(String[] args){
        //part a
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = ArrayTesting.genRandomArrayList(CONST_SIZE);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end-start));

        start = System.currentTimeMillis();
        int[] array = ArrayTesting.genRandomArray(CONST_SIZE);
        end = System.currentTimeMillis();
        System.out.println("Array: " + (end-start));

        start = System.currentTimeMillis();
        Vector<Integer> vector = ArrayTesting.genRandomVector(CONST_SIZE);
        end = System.currentTimeMillis();
        System.out.println("Vector: " + (end-start) + "\n");

        //part b
        start = System.currentTimeMillis();
        ArrayTesting.sumArrayList(arrayList);
        end = System.currentTimeMillis();
        System.out.println("ArrayList Iterator: " + (end-start));

        start = System.currentTimeMillis();
        ArrayTesting.sumArray(array);
        end = System.currentTimeMillis();
        System.out.println("Array Iterator: " + (end-start));

        start = System.currentTimeMillis();
        ArrayTesting.sumVector(vector);
        end = System.currentTimeMillis();
        System.out.println("Vector Iterator: " + (end-start));
    }

    private static ArrayList<Integer> genRandomArrayList(int length){
        ArrayList<Integer> arrayList = new ArrayList<>(length);

        for(int i = 0; i < length; i++){
            arrayList.add((int) (Math.random()*9));
        }

        return arrayList;
    }

    private static int[] genRandomArray(int length){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = (int) (Math.random()*9);
        }

        return arr;
    }

    private static Vector<Integer> genRandomVector(int length){
        Vector<Integer> vector = new Vector<>(length);
        for(int i = 0; i < length; i++){
            vector.add((int) (Math.random()*9));
        }

        return vector;
    }

    private static long sumArrayList(ArrayList<Integer> arrayList){
        Iterator<Integer> iterator = arrayList.iterator();
        long sum = 0;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }

    private static long sumArray(int[] array){
        long sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    private static long sumVector(Vector<Integer> vector){
        Iterator<Integer> iterator = vector.iterator();
        long sum = 0;
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }
}
