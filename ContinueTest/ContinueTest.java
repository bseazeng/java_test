public class ContinueTest 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
     int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ) {
         if( x == 30 ) {
        continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
    }
}