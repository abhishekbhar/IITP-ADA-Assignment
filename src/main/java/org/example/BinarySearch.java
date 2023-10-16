package org.example;

import java.util.Scanner;


/*
*   Author: Abhishek Bhardwaj
 */

public class BinarySearch {

    // Array to store sorted elements
    private int[] elements;
    private final int elementCount;
    private int position = 0;

    BinarySearch(int len){
        elementCount = len;
        elements = new int[len];
    }

    public void addElement(int element){
        elements[position++] = element;
    }


    public int search(int i) {
        int left = 0;
        int right = elementCount -1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if (elements[mid] == i ) {
                return mid;
            } else if (elements[mid]< i){
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementCount = scanner.nextInt();

        BinarySearch binarySearch = new BinarySearch(elementCount);

        for (int i=0; i<elementCount; i++){
            binarySearch.addElement(scanner.nextInt());
        }

        int numQueries = scanner.nextInt();
        for(int i=0; i<numQueries; i++){
            System.out.println(binarySearch.search( scanner.nextInt()));
        }
    }

}



