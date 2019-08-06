package cn.houziyu.demo;

// 这是RandomDemo2的第二种方式

import java.util.Scanner;
import  java.util.Random;
public class RandomDemo3 {
    public static void main(String[] args) {
        Random rd = new Random();   //实例化对象
        Scanner sc = new Scanner(System.in);
        int RD = rd.nextInt(1000);
        while (true) {
            System.out.println("请输入一个1到1000的整数：");
            int number = sc.nextInt();
            if (number < RD) {
                System.out.println("你输入的数字小了");
            }else if (number > RD) {
                System.out.println("你输入的数字大了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
