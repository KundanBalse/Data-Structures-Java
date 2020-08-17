package com.app.org;

public class BubbleSort {
    public static void main(String[] args) {
        int []array = {11, 2, 5, 7, 9, -22, -30, -4, 4, 9};
       int lastindex = array.length;
        for (int index = lastindex - 1; index > 0; index--){
                for(int i = 0;i < index; i++){

                    if(array[i] > array[i+1]) {
                        swap(array, i, i+1);
                    }
                }
        }
        for(int i = 0; i < lastindex; i++){
            System.out.println(array[i]);
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
