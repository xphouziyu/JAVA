package cn.houziyu.demo;

public class ForDemo {
    public static void main(String[] args) {
        for (int x=1; x <=5; x++) {
            System.out.println("Hello World");
        }
        System.out.println("------------------上面是正向输出-----------------------");
        for (int x= 5; x > 0; x--) {
            System.out.println("Hello World" + x);
        }
        System.out.println("------------------上面是逆向输出-----------------------");

        {
            int sum = 0;
            for (int x = 1; x < 6; x++) {
                sum = sum +x;
            }
            System.out.println("1到5的和是：" + sum);
        }
    }

}
