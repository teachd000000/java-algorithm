package com.teachd.algorithm;

public class BinarySearchQuestion {

    private BinarySearchQuestion() {
    }

    public static int binarySearch(final int element, final int[] array, int first, int last) {
        int index = -1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (array[mid] < element) {
                first = mid + 1;
            } else if (array[mid] > element) {
                last = mid - 1;
            } else if (array[mid] == element) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static int binarySearchRecursively(final int element, final int[] array, final int first, final int last) {
        int middle = (first + last) / 2;

        if (last < first) {
            return -1;
        }

        if (element == array[middle]) {
            return middle;
        } else if (element < array[middle]) {
            return binarySearchRecursively(element, array, first, middle - 1);
        } else {
            return binarySearchRecursively(element, array, middle + 1, last);
        }
    }
}
