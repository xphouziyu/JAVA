package cn.houziyu.demo;

public class BreakDemo {
    public static void main(String[] args) {
        book_lanol:for (int labol_class = 1; labol_class <= 3; labol_class++) {
            for (int studied = 1; studied <= 10; studied++) {
                System.out.println("现在是"+ labol_class +"班的第" + studied + "个同学");
                if (labol_class == 2 && studied == 5) {
                    System.out.println("我已经找到2班的5号同学了");
                    break book_lanol;
                }
            }
        }
    }
}
