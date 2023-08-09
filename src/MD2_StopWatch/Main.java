package src.MD2_StopWatch;

import java.time.LocalTime;

public class Main {
    public static int[] selectionSort(int ...a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[j] = a[i];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
           a[i] = (int)(Math.random() * 1000);
        }
        LocalTime star = LocalTime.now();
        a = selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch sw = new StopWatch(star, end);

        for(int x : a) {
            System.out.println(x);
        }
        System.out.println("Time" + sw.getElapsedTime());
    }
}
