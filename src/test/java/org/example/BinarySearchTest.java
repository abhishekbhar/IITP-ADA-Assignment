package org.example;


import org.junit.Assert;
import org.junit.Test;

/*
 *   Author: Abhishek Bhardwaj
 */
public class BinarySearchTest {
    BinarySearch binarySearch;

    /*
        Test Case 1:
        Input:
        7
        25 27 30 47 50 61 72
        5
        5
        25
        61
        72
        109

        Output:
        -1
        0
        5
        6
        -1
    */
    @Test
    public void test1(){
        binarySearch = new BinarySearch(7);
        int[] elements = {25,27,30,47,50,61,72};
        for (int e:elements) {
            binarySearch.addElement(e);
        }

        Assert.assertEquals(-1, binarySearch.search(5));
        Assert.assertEquals(0,binarySearch.search(25));
        Assert.assertEquals(5,binarySearch.search(61));
        Assert.assertEquals(6, binarySearch.search(72));
        Assert.assertEquals(-1, binarySearch.search(109));
    }


    /*
    Test Case 2:
        Input:
        15
        1 46 78 80 88 93 101 170 185 199 205 227 234 256 306
        6
        1
        88
        91
        -16
        199
        234

        Output:
        0
        4
        -1
        -1
        9
        12
     */

    @Test
    public void test2(){
        binarySearch = new BinarySearch(15);
        int[] elements = {1,46,78, 80,88,93,101,170,185,199, 205,227,234,256,306};
        for (int e:elements) {
            binarySearch.addElement(e);
        }

        Assert.assertEquals(0, binarySearch.search(1));
        Assert.assertEquals(4,binarySearch.search(88));
        Assert.assertEquals(-1, binarySearch.search(91));
        Assert.assertEquals(-1,binarySearch.search(-16));
        Assert.assertEquals(9, binarySearch.search(199));
        Assert.assertEquals(12, binarySearch.search(234));
    }

    /*
    Test case 3:
        Input:
        5
        23 45 66 78 99
        4
        1
        23
        78
        -16

        Output:
        -1
        4
        3
        -1
     */
    @Test
    public void test3(){
        binarySearch = new BinarySearch(5);
        int[] elements = {23,45,66,78,99};
        for (int e:elements) {
            binarySearch.addElement(e);
        }

        Assert.assertEquals(-1, binarySearch.search(1));
        Assert.assertEquals(0,binarySearch.search(23));
        Assert.assertEquals(3, binarySearch.search(78));
        Assert.assertEquals(-1,binarySearch.search(-16));
    }
}
