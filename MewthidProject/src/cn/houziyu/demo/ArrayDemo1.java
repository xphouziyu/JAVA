package cn.houziyu.demo;

public class ArrayDemo1 {
    /*
    数组的第一格式：
        格式一：
            数据类型[] 数据名 = new 数据类型[长度];
        格式二：
            数据类型[] 数据名 = new 数据类型[]{值1，值2，之3.。。。};
        格式三：
            数据类型[] 数据名 = {值1，值2，之3.。。。};
     */
    public static void main(String[] args) {
        // 1
        int[] arr = new int[3];
        // 2
        int[] arr2 = new int[] {1, 2, 3};
        // 3
        int[] arr3 = {1, 2, 3};
    }
}
