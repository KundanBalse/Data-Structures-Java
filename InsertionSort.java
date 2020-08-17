package com.app.org;

public class InsertionSort {
    public static void main(String[] args) {
        int []array = {11, 21, 5, 7, 9, -22, 30, -4, 4, 9};
        int i = 0;
        for (int index = 1; index < array.length; index++){
            int largest = array[index];
            for(i = index; i > 0 && array[i-1] > largest; i--){
                    array[i] = array[i-1];

            }
            array[i] = largest;
    }
        for(int m = 0; m < array.length; m++){
        System.out.println(array[m]);
    }
}

}
