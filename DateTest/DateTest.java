import java.util.*; //import java.util.Date;
import java.text.*;//SimpleDateFormat类
/*
java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。
第一个构造函数使用当前日期和时间来初始化对象。
Date( )
第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数。
Date(long millisec)
*/
public class DateTest 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
       // 初始化 Date 对象
       Date date = new Date();
        
       // 使用 toString() 函数显示日期时间
       System.out.println(date.toString());
       
       System.out.println("---------begin test_after------------");
       test_after();
       
       System.out.println("---------begin test_before------------");
       test_before();
       
       System.out.println("---------begin test_compareTo------------");
       test_compareTo();
       
       System.out.println("---------begin test_SimpleDateFormat------------");
       test_SimpleDateFormat();
       
       System.out.println("---------begin test_printf------------");
       test_printf();
    }
    
    public static void test_after()
    {
        // create 2 dates
        Date date = new Date(2011, 5, 21);
        Date date2 = new Date(2015, 1, 21);
        
        System.out.println("Date is: " + date.toString());
        System.out.println("Date 2 is: " + date2.toString());
        // tests if date 2 is after date and print
        boolean after = date2.after(date);
        System.out.println("Date 2 is after date: " + after);

        // tests if date is after date 2 and print
        after = date.after(date2);
        System.out.println("Date is after date 2: " + after);
        
    }
    
    public static void test_before()
    {
        // create 2 dates
        Date date = new Date(2011, 5, 21);
        Date date2 = new Date(2015, 1, 21);
        
        System.out.println("Date is: " + date.toString());
        System.out.println("Date 2 is: " + date2.toString());
        // tests if date 2 is before date and print
        boolean before = date2.before(date);
        System.out.println("Date 2 is before date: " + before);

        // tests if date is before date 2 and print
        before = date.before(date2);
        System.out.println("Date is before date 2: " + before);
    }
    
    public static void test_compareTo()
    {
        Date date=new Date();
        System.out.println("date:"+date);
        
        long cur_time=date.getTime();
        System.out.println("current time:"+cur_time);
        
        Date date2 = new Date(cur_time+1000);
        System.out.println("date2:"+date2);
        
        //-1s
        int ret = date.compareTo(date2);
        System.out.println("date compareTo date2:"+ret);
        //0
        ret = date.compareTo(date);
        System.out.println("date compareTo date:"+ret);
        
        //1
        ret = date2.compareTo(date);
        System.out.println("date2 compareTo date:"+ret);
        
    }
    
    /*SimpleDateFormat 是一个以语言环境敏感的方式来格式化和分析日期的类。SimpleDateFormat 允许你选择任何用户自定义日期时间格式来运行*/
    public static void test_SimpleDateFormat()
    {
        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date: " + ft.format(dNow));
    }
    
    public static void test_printf()
    {
        // 初始化 Date 对象
        Date date = new Date();

        //c的使用  
        System.out.printf("全部日期和时间信息：%tc%n",date);          
        //f的使用  
        System.out.printf("年-月-日格式：%tF%n",date);  
        //d的使用  
        System.out.printf("月/日/年格式：%tD%n",date);  
        //r的使用  
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);  
        //t的使用  
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);  
        //R的使用  
        System.out.printf("HH:MM格式（24时制）：%tR",date);  
    }
}