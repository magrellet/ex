package tests;

import org.junit.Assert;
import org.junit.Test;

public class ClassTest {

  @Test
  public void methodToTest(){
    main.ClassTest toTest = new main.ClassTest();
    Assert.assertTrue(toTest.checkTest());
  }
}
