package cn.houziyu.demo;



public class XunHuan1024 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=35; j++) {
                if (j % 5 == 0 ) {
                    continue;
                }
                System.out.println("现在给" + i + "班的" + j + "号同学送苹果");
                count++;
            }
        }
        System.out.println("一共送出" + count + "个苹果");
    }
}
