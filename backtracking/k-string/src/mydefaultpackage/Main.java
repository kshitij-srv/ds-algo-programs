package mydefaultpackage;

import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    int n = args.length > 0 && args[0] != null ? Integer.parseInt(args[0]) : 5;
    int k = args.length > 1 && args[1] != null ? Integer.parseInt(args[1]) : 2;
    int[] arr = new int[n];
    kString(arr, n, k);
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
