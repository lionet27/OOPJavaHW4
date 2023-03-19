package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import gb.list.GBArrayList;


public class GBArrayListTest {

   @Test
   void getTest(){
      GBArrayList<String> strings=new GBArrayList<>();
      strings.add("1");
      Assertions.assertEquals("1", strings.get(0));
   }

   @Test
   void getNegativeTest(){
      GBArrayList<String> strings=new GBArrayList<>();
      strings.add("1");
      Assertions.assertNotEquals("10", strings.get(0));
   }

   @Test
   void addTest(){
      GBArrayList<Integer> numbers=new GBArrayList<>();
      numbers.add(10);
      Assertions.assertEquals(10, numbers.get(0));
   }

   @Test
   void sizeTest(){
      GBArrayList<Integer> numbers=new GBArrayList<>();
      numbers.add(10);
      numbers.add(10);
      numbers.add(10);

      Assertions.assertEquals(3, numbers.size());
   }

   @Test
   void removeTest(){
      GBArrayList<Integer> numbers=new GBArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.remove(0);

      Assertions.assertEquals(2, numbers.size());
   }

   @Test
   void removeNegativeTest(){
      GBArrayList<Integer> numbers=new GBArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.remove(0);

      Assertions.assertNotEquals(1, numbers.get(0));
   }

   @Test
   void updateTest(){
      GBArrayList<Integer> numbers=new GBArrayList<>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.update(1,10);

      Assertions.assertEquals(10, numbers.get(1));
   }




}
