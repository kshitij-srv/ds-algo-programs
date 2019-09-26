package mydefaultpackage;

import java.util.HashMap;

public class Main {

  static HashMap<Integer, Integer> val = new HashMap<Integer, Integer>();

  public static void main(String args[]) {
    int[] arr = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
    System.out.println(cutRodRecursive(arr, 8));
  }

  static int cutRodRecursive(int[] price, int n) {

    if(n < 1) {
      return 0;
    }

    if (val.get(n) != null) {
      return val.get(n);
    }

    int maxVal = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      int currentPrice = price[i] + cutRodRecursive(price, n-i-1);
      maxVal = maxVal >= currentPrice ? maxVal : currentPrice;
    }

    val.put(n, maxVal);

    return maxVal;
  }
}