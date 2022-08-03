package com.company;

import java.util.Arrays;

// Time complexity = O(n^2) 
// S.c = O(n)
public class Main {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swap;
        for(int i=0; i < n; i++){
            swap = false;
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }

            }
            if(!swap) break;
        }

    }
    public static void main(String[] args) {
	// write your code here

        int[] arr = {5,4,3,2,1};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr)
        );
    }
}
