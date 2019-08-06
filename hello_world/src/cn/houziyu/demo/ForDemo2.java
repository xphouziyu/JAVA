package cn.houziyu.demo;

// 这个代码计算的是水仙花数，所谓水仙花数就是一个三位数的 个位、十位、百位的立方数相加等于这个数。
public class ForDemo2 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /100 % 10;
            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
            }
        }
    }
}
