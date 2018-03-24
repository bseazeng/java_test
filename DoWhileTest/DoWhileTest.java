public class DoWhileTest 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
      int x = 10;
 
      do{
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
    }
}