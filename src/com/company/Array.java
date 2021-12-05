package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int [] array = {-5, 5, 0, 7, -3, 2};
        int [] arraysatu = {-5, 10, 0, 7, -3, 2};
        int [] [] array2d = { {1,2} , {3,6} };
        //int [] array = {2 , 0 , 3};

       /* int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum +array[i];
        }*/
       // System.out.println(Arrays.deepToString(array2d));

        for (int i = 1; i < arraysatu.length; i++) {
            for (int j = 0; j < arraysatu.length; j++) {
                if (arraysatu[j]+arraysatu[i] == n) {
                    if(arraysatu[j] != arraysatu[i]) {
                        System.out.println("[" + arraysatu[i] + "],[" + arraysatu[j] + "]");
                    }
                }
                else {

                }
            }

        }
        // System.out.println(sum);
    }

}
