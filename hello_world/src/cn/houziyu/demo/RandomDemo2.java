package cn.houziyu.demo;
/*
这是一个经典的编程游戏
生成一个1到1000的随机数，然后才它的数值，同时会根据数值的大小听说打了或者小了。
 */
import java.util.Scanner;
import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        Random rd = new Random();   //实例化对象
        Scanner sc = new Scanner(System.in);
        int RD = rd.nextInt(1000);
//        do {
//            System.out.println("请输入一个1到1000的整数：");
//            int number = sc.nextInt();
//
//
//        } while (RD == number);
        int number = 0;
        int count = 0;
        while (RD != number) {
            System.out.println("请输入一个1到1000的整数：");
            number = sc.nextInt();
            if (number < RD) {
                System.out.println("你输入的数字小了");
            }else if (number > RD) {
                System.out.println("你输入的数字大了");
            }
            count++;
        }
        System.out.println("你一共猜了"+count+"次");
    }
}
