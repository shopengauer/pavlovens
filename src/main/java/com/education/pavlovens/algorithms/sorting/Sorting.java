package com.education.pavlovens.algorithms.sorting;

public interface Sorting {


    /**
     * Сортировка вставкой
     * @param array - входной массив
     * @return отсортированный массив
     */
   int[] insertionSorting(int[] array);

   int[] shellSorting(int[] array);

   int[] mergeSorting(int[] array);

   int[] mergeSortedArrays(int[] a1, int[] a2);
}
