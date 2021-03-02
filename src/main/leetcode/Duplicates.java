/**
 * Leetcode: 217. Contains Duplicate
 */

package main.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {

  public static boolean hasDuplicated(int[] nums) {
    Map<Integer, Integer> mapCount = new HashMap<>();
    for (Integer a : nums) {
      if (mapCount.containsKey(a)) {
        return true;
      } else {
        mapCount.put(a, a);
      }
    }
    return false;
  }

}
