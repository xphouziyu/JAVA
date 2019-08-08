package cn.houziyu.demo;

// 这里要干的是方法重载

public class OverloadDemo1 {
    public static void main(String[] args) {
        // 方法重载这与方法名和方法参数有关
        int a = 3, b = 2;
        int c = sum(a, b);
        System.out.println(c);

        float a1 = 7.2F, b1 = 7.7F;
        float c1 = sum(a1, b1);
        System.out.println(c1);
    }


    //首先我定义三个方法名相同的但是数据类型不同的方法。
    public static int sum(int a, int b) {
        return a + b;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
    public static long sum(long a, long b) {
        return a + b;
    }
}
