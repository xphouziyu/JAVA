package cn.houziyu.demo;

import java.util.Random;
public class RandomDemo1 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = rd.nextInt(10);
            System.out.println(number);
        }
    }
}
