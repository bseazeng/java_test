public class Math2Test 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };   
        for (double num : nums) 
        {   
          test(num);   
        }   
    }
    
    private static void test(double num) 
    {   
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));   
        System.out.println("Math.round(" + num + ")=" + Math.round(num));   
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));   
    }  
}