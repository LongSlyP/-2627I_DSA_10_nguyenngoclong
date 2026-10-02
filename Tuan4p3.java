import java.util.Arrays;
import java.util.Scanner;
public class Tuan4p3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n;i++){
            a[i] = sc.nextInt();
        }

            int key = a[n-1];
            int j = n-2;
            while (j>= 0 && a[j] > key) {
                a[j+1] = a[j];
                j--;
                System.out.println(Arrays.toString(a));
            }
            a[j+1] = key;
            System.out.println(Arrays.toString(a));
        }
    }

