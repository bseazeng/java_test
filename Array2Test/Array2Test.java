public class Array2Test 
{
    /* 第一个Java程序
     * 它将打印字符串 Hello World
     */
    public static void main(String []args) 
    {
        System.out.println("Hello World"); // 打印 Hello World
        printArray(new int[]{3, 1, 2, 6, 4, 2});
        System.out.print("\n");
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (double element: myList) {
            System.out.println(element);
        }
    }
    public static void printArray(int[] array) 
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}