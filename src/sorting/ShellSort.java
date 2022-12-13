package sorting;

import java.util.Arrays;

public class ShellSort {
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
        shell_sort(target);
        for(int i = 0; i < 10; i++)
            if (target[i] != template[i]) {
                flag = false;
                break;
            }
        if(flag) System.out.println("1");
        else System.out.println("0");
    }

    //  gap = 5
    //  0,  1,  2,  3,  4,  5,  6,  7,  8, 9, 10
    // 45, 84, 77, 83, 55, 49, 91, 64, 91, 5, 37
    public static void shell_sort(int[] target) {
        for(int gap = target.length / 2; gap > 0 ; gap /= 2) {
            for(int i = gap; i < target.length; i++) {
                int v = target[i];
                int j = i;
                while(j >= gap && target[j] > v) {
                    target[j] = target[j-gap];
                    j -= gap;
                }
                target[j] = v;
            }
        }
    }
}
