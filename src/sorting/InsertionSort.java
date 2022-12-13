package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] target = new int[10];
        int[] template = new int[10];
        boolean flag = true;
        for(int i = 0; i < 10; i++) {
            target[i] = (int) ((Math.random() * 100) + 1);
            template[i] = target[i];
        }
        Arrays.sort(template);
        System.out.println();
        insertion_sort(target);
        for(int i = 0; i < 10; i++)
            if (target[i] != template[i]) {
                flag = false;
                break;
            }
        if(flag) System.out.println("1");
        else System.out.println("0");
    }

    public static void insertion_sort(int[] target) {
        for(int i = 1; i < target.length; i++) {
            int v = target[i];
            int j = i;
            while(j > 0 && target[j-1] > v) {
                target[j] = target[j-1];
                j--;
            }
            target[j] = v;
        }
    }

}
