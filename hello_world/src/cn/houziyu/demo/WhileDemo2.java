package cn.houziyu.demo;

public class WhileDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("1到100的和是： " + sum);
    }
}
