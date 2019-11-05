package cn.coderjia.std;

/**
 * 接口的默认方法
 * @author Coder.JiA
 * @date 31/10/2019 7:35 PM
 **/

interface Formula {

    double cal(int a);

    /**
     * 知识点一：接口的默认方法
     * 在Java8中，利用default关键字使我们能够添加非抽象方法实现的接口。此功能也被称为扩展方法。
     * 应用点： 接口方法中增加默认实现。
     */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}


public class Study1 {

    public static void main(String[] args) {

        Formula formula = new Formula() {
            @Override
            public double cal(int a) {
                return sqrt(a * 100);
            }
        };
        double cal100 = formula.cal(100);
        double cal16 = formula.sqrt(16);

        System.out.println(cal100);
        System.out.println(cal16);

    }

}
