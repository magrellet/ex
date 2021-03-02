package tests.leetcode;

import main.leetcode.Duplicates;
import org.junit.Assert;
import org.junit.Test;

public class DuplicatesTests {

  @Test
  public void noDuplicates(){
    int[] a = {1,2,3,4};
    Assert.assertFalse(Duplicates.hasDuplicated(a));
  }

  @Test
  public void withDuplicates(){
    int[] a = {1,2,1,4};
    Assert.assertTrue(Duplicates.hasDuplicated(a));
  }

}
