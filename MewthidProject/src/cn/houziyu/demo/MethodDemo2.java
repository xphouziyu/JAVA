package cn.houziyu.demo;

// 下一个方法，比窘输入的两数判断是否相等

import java.util.Scanner;
public class MethodDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数");
        int first = sc.nextInt();
        System.out.println("请输入第二个数");
        int treblcu = sc.nextInt();

        if (compare(first, treblcu)) {
            System.out.println("两个数相等");
        } else {
            System.out.println("两个数不相等");
        }
    }
    public static boolean compare(int a, int b) {
        // 注意：返回值与方法的属性形同，不然报错。
        return a == b;
    }
}
