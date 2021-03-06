// Reverse the elements in an array of integers without using a second array.


import java.util.Arrays;
// Author : Abhishek Sharma
public class a3q9 {

    public int[] reverse(int [] array){

        if(array == null || array.length <= 1){
            System.out.println("Invalid array.");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args){
        a3q1 arrayReverse = new a3q1();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original array" + Arrays.toString(input));
        System.out.println("Reversed array" + Arrays.toString(arrayReverse.reverse(input)));
    }
}

/*
Output :
Original array[1, 2, 3, 4, 5, 6, 7, 8]
Reversed array[8, 7, 6, 5, 4, 3, 2, 1]
*/
