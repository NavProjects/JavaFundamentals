import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        // Print 1-255
        // for (int i = 0; i <= 255; i++){
        //     System.out.println(i);
        // }

        // Print odd numbers between 1-255
        // for (int i = 0; i <= 255; i++){
        //     if (i % 2 != 0){
        //         System.out.println(i);
        //     }
        // }

        // Sigma of 255 AKA Sum to 255
        // int sum = 0;
        // for (int i = 0; i <= 255; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        //Iterating through an array
        int[] myArray = { 1, 2, 3, 5, 7, 9, 13 };
        int num = 5;
        // int[] nArray = {2,10,3};
        int[] newArray = { 1, 5, 10, -2 };
        // array(myArray);
        // maxArray(myArray);
        // oddNums(myArray);
        // average(myArray);
        // average(nArray);
        // greaterArray(myArray, num);
        // square(newArray);
        // noNegatives(newArray);
        bigThree(newArray);
        remArr(newArray);



    }
    static void array(int[] arr) {
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    static void maxArray(int[] arr) {
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    static void oddNums(int[] arr){
        for (int i = 0; i<arr.length; i++){
            if(arr[i]  % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
    static void average(int[] arr){
        int total = 0;
        for (int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        int average = total / arr.length;
        System.out.println(average);
    }
    static void greaterArray(int[] arr, int y) {
        int greaterThan = 0;
        for (int i = 0; i<arr.length; i++){
            if (arr[i] > y){
                greaterThan += 1;
            }
        }
        System.out.println(greaterThan);
    }
    static void square(int[] arr) {
        ArrayList<Integer> mult = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++){
            mult.add(arr[i] * arr[i]);
        }
        System.out.println(mult);
    }
    static void noNegatives(int[] arr) {
        ArrayList<Integer> positives = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++){
            if (arr[i] < 0){
                positives.add(0);
            }else{
                positives.add(arr[i]);
            }
        }
        System.out.println(positives);
    }
    static void bigThree(int[] arr) {
        ArrayList<Object> log = new ArrayList<Object>();
        int max = arr[0];
        int min = arr[0];
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total += arr[i];
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        double avg = (double)total/arr.length;
        log.add(max);
        log.add(min);
        log.add(avg);
        System.out.println(log);
    }
    static void remArr(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; i++){
            newArr.add(arr[i]);
        }
        newArr.remove(0);
        newArr.add(0);
        System.out.println(newArr);
    }
    static void array(int[] array)  {
        for(int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        System.out.print(Arrays.toString(array));
        }
}
