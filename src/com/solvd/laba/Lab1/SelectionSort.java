package com.solvd.laba.Lab1;

public class SelectionSort {
    public static void main(String[] args) {
        int size = args.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = Integer.parseInt(args[i]);
        System.out.println("Before:");
        for (int s : arr)
            System.out.print(s + " ");

        for (int i = 0; i < size - 1; i++) {
            int minElement = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minElement])
                    minElement = j;
            }
            int temp = arr[minElement];
            arr[minElement] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("After");
        for (int s : arr)
            System.out.print(s + " ");
    }
}
