package sorting;
import java.lang.Math;

public class BubbleSort {
    public static void main(String[] args) {
        int[] target = new int[10];
        for(int i = 0; i < 10; i++) {
            target[i] = (int) ((Math.random() * 100) + 1);
            System.out.print(target[i] + ", ");
        }
        System.out.println();
        bubble_sort(target);
        for(int i = 0; i < 10; i++) System.out.print(target[i] + ", ");
        System.out.println();
    }
    public static void bubble_sort(int[] target) {
        for(int i = 0; i < target.length- 1 ; i++) {
            for(int j = 0; j < target.length - 1 - i; j++) {
                if(target[j] > target[j+1]) {
                    int temp = target[j+1];
                    target[j+1] = target[j];
                    target[j] = temp;
                }
            }
        }
    }
}
