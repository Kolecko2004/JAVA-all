package cz.cvut.fel.pjv.cars.utils;

public final class ArrayUtil {
    private ArrayUtil() {

    }

    public static void sort(Comparable[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }
}
