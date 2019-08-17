package cn.houziyu.demo;



public class ArrayDemo3 {
    public static void main(String[] args) {
        // 先测试一个空数组能打印什么
        int[] arr = new int[5];
        for(int x = 0; x <=4 ; x++) {
            System.out.println(arr[x]);
        }
        // 打印数组的长度
        System.out.println(arr.length);
    }
}
