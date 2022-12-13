package sorting;

import java.util.Arrays;

public class SelectionSort {
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
        selection_sort(target);
        for(int i = 0; i < 10; i++)
            if (target[i] != template[i]) {
                flag = false;
                break;
            }
        if(flag) System.out.println("1");
        else System.out.println("0");
    }

    public static void selection_sort(int[] target) {
        int min;
        for(int i = 0; i < target.length - 1; i++) {
            min = i;
            for(int j = i+1; j < target.length; j++) {
                if(target[j] < target[min])
                    min = j;
            }
            int temp = target[i];
            target[i] = target[min];
            target[min] = temp;
        }
    }
}
