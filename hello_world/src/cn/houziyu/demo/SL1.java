package cn.houziyu.demo;

/*  这个训练做的是用来计算复率的
    首先会接收一个月率
    然后软件会计算出年利率
 */
import java.util.Scanner;
public class SL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月利率：");

        float f = sc.nextFloat();

        //接下来要初始化 总金额、每月还款、年利率
        int zje = 12000;
        int myhk = 1000;
        float lx = zje * f;
        float mysf = myhk + lx;
        float nlv = 0F;
        int m = 1;
        while (m <= 12) {

        }
    }
}
