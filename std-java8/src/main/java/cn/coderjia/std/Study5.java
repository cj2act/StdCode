package cn.coderjia.std;

/**
 * Lambda作用域问题 : 从lambda表达式访问外部变量的作用域是匿名对象非常相似。
 *                  您可以从本地外部范围以及实例字段和静态变量中访问final变量。
 * @author Coder.JiA
 * @date 4/11/2019 11:26 AM
 **/
public class Study5 {

    static int outerStaticNum;
    int outerNum;

    public void test() {

//        int num = 1;
//        Converter<String, String> stringConverter = new Converter<String, String>() {
//            @Override
//            public String convert(String input) {
//                return input + num;
//            }
//        };
        /**
         * 1. 访问局部变量   final可以不加。
         */
        final int num = 1;
        Converter<Integer, String> stringConverter = (input) -> String.valueOf(input + num);
        stringConverter.convert(2);

        /**
         * 写到这可以发现，java的lambda是借助匿名对象实现的。
         */

        /**
         * 2. 访问成员变量
         * 与局部变量不同，我们在lambda表达式的内部能获取到对成员变量或静态变量的【读写权】。这种访问行为在匿名对象里是非常典型的。
         */
        Converter<Integer, String> stringConverter1 = (input) -> {
            outerNum = 23;
            return String.valueOf(input);
        };

        Converter<Integer, String> stringConverter2 = (input) -> {
            outerStaticNum = 72;
            return String.valueOf(input);
        };

    }





}
