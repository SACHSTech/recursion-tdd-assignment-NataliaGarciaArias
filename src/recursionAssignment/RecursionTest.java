package recursionAssignment;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import recursionAssignment.Recursion;
public class RecursionTest{
  
  //PROBLEM 1: COUNT 7

   @Test
    public void Problem1_Test1(){

        assertEquals(2, Recursion.count7(717));
    }

    @Test
    public void Problem1_Test2(){
      assertEquals(0, Recursion.count7(0));
    }

    @Test
    public void Problem1_Test3(){
      assertEquals(1, Recursion.count7(7)); 
    }
    
    @Test 
    public void Problem1_Test4(){
      assertEquals(0, Recursion.count7(1234));
    }

    @Test
    public void Problem1_Test5(){
      assertEquals(0, Recursion.count7(-1));
    }

    //PROBLEM TWO: CHANGEPI
    @Test
    public void Problem2_Test1(){
      assertEquals("", Recursion.changePi(""));
    }
    
    @Test
    public void Problem2_Test2(){
      assertEquals("3.14", Recursion.changePi("pi"));
    }
    @Test
    public void Problem2_Test3(){
      assertEquals("xx3.14xx", Recursion.changePi("xxpixx"));
    }

    @Test
    public void Problem2_Test4(){
      assertEquals("nothing", Recursion.changePi("nothing"));
    }
    
    //PROBLEM THREE: STRING CLEAN
    @Test
    public void Problem3_Test1(){
      assertEquals("", Recursion.stringClean(""));
    }

    @Test
    public void Problem3_Test2(){
      assertEquals("y", Recursion.stringClean("yy"));

    }
    @Test
    public void Problem3_Test3(){
      assertEquals("yzy", Recursion.stringClean("yyzzyy"));
    }

    @Test
    public void Problem3_Test4(){
      assertEquals("Helo", Recursion.stringClean("Hellloo"));
    }

    @Test
    public void Problem3_Test5(){
      assertEquals(" ", Recursion.stringClean("   "));
    }

    @Test
    public void Problem3_Test6(){
      assertEquals("i can't spel ", Recursion.stringClean("ii can'''t spppell   "));
    }
    
}
