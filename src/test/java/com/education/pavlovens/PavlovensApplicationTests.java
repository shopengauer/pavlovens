package com.education.pavlovens;

import com.education.pavlovens.algorithms.sorting.Sorting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PavlovensApplicationTests {


    @Autowired
    private Sorting sorting;

    static int[] array = {5,3,86,45,34,12,589,45,654,765,344,234,124};


    @Test
    public void contextLoads() {
        System.out.println(Arrays.toString(sorting.insertionSorting(array))); ;

    }

    @Test
    public void mergeArraysTest() {
      int[] ar1 = {2,5,7,34,54,250};
      int[] ar2 = {1,6,45,80,91,130};

        System.out.println(Arrays.toString(sorting.mergeSortedArrays(ar1,ar2)));
    }
}
