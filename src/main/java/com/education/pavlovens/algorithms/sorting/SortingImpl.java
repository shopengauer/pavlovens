package com.education.pavlovens.algorithms.sorting;

import org.springframework.stereotype.Service;

@Service
public class SortingImpl implements Sorting {


    @Override
    public int[] insertionSorting(int[] array) {
        for (int p = 1; p < array.length; p++) {
            int tmp = array[p];
            for (int j = p; j > 0; j--) {
                if (tmp < array[j - 1]) {
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        return array;
    }

    @Override
    public int[] shellSorting(int[] array) {
        return new int[0];
    }

    @Override
    public int[] mergeSorting(int[] array) {
        if(array.length < 2) {
            return array;
        } else {
           mergeSorting(array, 0, array.length/2);
           mergeSorting(array, array.length/2 + 1, array.length/2);
        //   mergeSortedArrays(array)
        }




        return new int[0];
    }

    private void mergeSorting(int[] array, int startIndex, int endIndex) {

    }

    //  private mergeSorting(int[] array,)


    @Override
    public int[] mergeSortedArrays(int[] a1, int[] a2) {
        int[] merged = new int[a1.length + a2.length];
        int mIdx = 0;
        int index1 = 0;
        int index2 = 0;
        while ((index1 != a1.length) && (index2 != a2.length)) {
            if (a1[index1] < a2[index2]) {
                merged[mIdx] = a1[index1];
                index1++;
            } else {
                merged[mIdx] = a2[index2];
                index2++;
            }
            mIdx++;
        }

        if (index1 == a1.length) {
            for (int i = 0; i < a2.length - index2; i++) {
                merged[mIdx + i] = a2[i + index2];
            }
        }

        if (index2 == a2.length) {
            for (int i = 0; i < a1.length - index1; i++) {
                merged[mIdx + i] = a1[i + index1];
            }
        }


        return merged;
    }
}
