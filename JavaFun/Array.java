import java.util.ArrayList;
public class Array {
    public static void main(String[] args){
        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Object> list = new ArrayList<Object>();
        list.add(10);
        list.add("Hello");
        list.add(new ArrayList<Integer>());
        list.add(new Double(12.0)); // adding a Double of value 12.0
        System.out.println(list); // [10, "Hello", [], 12.0]
    }
}

// public class Array {
//     public static void main(String[] args){
//         int[] myArray = {4, 8, 8, 5, 9};

//         // int[] myArray;
//         // myArray = new int[5];    // Initialization
//         // myArray[0] = 4;
//         // myArray[1] = 8;
//         // myArray[2] = 8;
//         // myArray[3] = 5;
//         // myArray[4] = 9;

//         for (int i = 0; i<myArray.length; i++)
//         System.out.println(myArray[i]);
//         // int a[]={33,3,4,5};//declaration, instantiation and initialization
//         // //printing array
//         // for(int i=0;i<a.length;i++)//length is the property of array
//         // System.out.println(a[i]);
//     }
// }