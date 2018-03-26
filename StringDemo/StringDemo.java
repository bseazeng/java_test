/*
String 类有 11 种构造方法，这些方法提供不同的参数来初始化字符串，比如提供一个字符数组参数:

*/
public class StringDemo{
   public static void main(String args[]){
      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
      String helloString = new String(helloArray);  
      System.out.println( helloString );
      
      String site = "www.runoob.com";
      int len = site.length();
      System.out.println( "菜鸟教程网址长度 : " + len );
      System.out.println(helloString.concat(site));
      
   }
}