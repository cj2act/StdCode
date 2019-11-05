package cn.coderjia.std;

/**
 * 函数式接口
 * @author Coder.JiA
 * @date 31/10/2019 7:55 PM
 **/
public class Study3 {


    public static void main(String[] args) {
        Converter<String, Integer> converter = (input) -> Integer.valueOf(input);
//         Converter<String, Integer> converter = Integer::valueOf;
        Integer output = converter.convert("123");
        System.out.println(output);
    }

}


/**
 * 定义函数式接口  @FunctionalInterface可以省略
 * @param <I> 入参
 * @param <O> 出参
 */
@FunctionalInterface
interface Converter<I, O> {

    /**
     * 定义抽象的转换方法
     * @param input 入参
     * @return 返回参
     */
    O convert(I input);
}
