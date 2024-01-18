package test20240118_tamagaki;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {10, 9, 8, 7, 6, 5};

        System.out.println("課題の説明: 配列の中の最小数と最大数を求めるプログラムを作成する。");
        System.out.println("配列1: " + Arrays.toString(array1));
        System.out.println("配列1の最小値: " + getMin(array1));
        System.out.println("配列1の最大値: " + getMax(array1));
        System.out.println("配列2: " + Arrays.toString(array2));
        System.out.println("配列2の最小値: " + getMin(array2));
        System.out.println("配列2の最大値: " + getMax(array2));
    }

    public static int getMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    public static int getMax(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}
