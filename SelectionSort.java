package com.app.org;

public class SelectionSort {
    public static void main(String[] args) {
        int []array = {11, 21, 5, 7, 9, -22, 30, -4, 4, 9};
        int largest = 0;
        int i;
        for (int index = array.length - 1; index > 0; index--){
            for(i = 0; i < index; i++){
               // largest = array[0];
                if (array[i] > array[largest]){
                        largest = i;
                }
            }
            swap(array, i, largest);
        }
        for(int m = 0; m < array.length; m++){
            System.out.println(array[m]);
        }
    }
    public static void swap(int [] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
