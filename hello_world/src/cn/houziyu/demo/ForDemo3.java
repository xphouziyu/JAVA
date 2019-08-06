package cn.houziyu.demo;


// 这个程序的目标是统计水仙花数的个数
public class ForDemo3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /100 % 10;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i) {
                count++;
            }
        }
        System.out.println("水仙花的个数是：" + count);

    }
}
