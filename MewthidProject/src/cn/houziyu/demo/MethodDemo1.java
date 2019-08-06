package cn.houziyu.demo;

public class MethodDemo1 {
    public static void main(String[] args) {
        int x = sum(100, 200);
        System.out.println(x);

    }
    public static int sum (int a, int b) {
        int c = a + b;
        return c;
    }
}
