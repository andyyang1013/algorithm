package cn.andyyang1013.alorithm;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] arrays = {2, 1, -3, 5, -2, 8, 0, -9, -6, 7, 6, 5};
        System.out.println(Arrays.toString(arrays));
        int fnn = -1;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] <= 0) {
                if (fnn == -1) {
                    fnn = i;
                }
                continue;
            }
            if (fnn != -1) {
                int temp = arrays[fnn];
                arrays[fnn] = arrays[i];
                arrays[i] = temp;
                fnn++;
            }
        }
        System.out.println(Arrays.toString(arrays));
    }
}
