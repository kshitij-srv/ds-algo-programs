package mydefaultpackage;

import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    int[] arr = new int[5];
    kString(arr, 5, 10);
  }

  static void kString(int[] arr, int n, int k) {
    if (n == 0) {
      System.out.println(Arrays.toString(arr));
    } else {
      for (int i = 0; i < k; i++) {
        arr[n-1] = i;
        kString(arr, n-1, k);
      }
    }
  }
}