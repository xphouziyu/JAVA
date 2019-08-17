package cn.houziyu.demo;

public class ArrayDemo4 {
    /*
    在一个int数组中找找出最大值。
     */


    public static void main(String[] args) {
        // 设置一个8位的int数组
        int[] arr = {1, 20 , 99, 103, 77, 89, 39, 20};
//        System.out.println(arr);

        int temp = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(temp <= arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
}
