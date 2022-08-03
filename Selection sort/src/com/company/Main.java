package com.company;

import java.util.Arrays;

// T.C = O(n^2)
// S.C = O(n)
public class Main {

    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int getmaxi(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){

            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }


    static void selectionsort(int[] arr ){

        for(int i = 0; i<arr.length; i++){
       int end = arr.length-i-1;
           int maxi = getmaxi(arr, 0, end);
          swap(arr, maxi, end);
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {5,4,3,2,1};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
