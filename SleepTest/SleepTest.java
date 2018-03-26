import java.util.*;
public class SleepTest 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
      try { 
         System.out.println(new Date( ) + "\n"); 
         Thread.sleep(1000*3);   // 休眠3秒
         System.out.println(new Date( ) + "\n"); 
      } catch (Exception e) { 
          System.out.println("Got an exception!"); 
      }
      
      System.out.println("--------------begin test_diff-----------");
      test_diff();
    }
    
    public static void test_diff()
    {
        try 
        {
             long start = System.currentTimeMillis( );
             System.out.println(new Date( ) + "\n");
             Thread.sleep(5*60*10);
             System.out.println(new Date( ) + "\n");
             long end = System.currentTimeMillis( );
             long diff = end - start;
             System.out.println("Difference is : " + diff);
        } 
        catch (Exception e) 
        {
            System.out.println("Got an exception!");
        }
    }
}