package cn.coderjia.std;

/**
 * 方法和构造函数引用    ::的使用
 * @author Coder.JiA
 * @date 4/11/2019 11:03 AM
 **/
public class Study4 {

    public static void main(String[] args) {

        // 1. 方法引用
        Converter<String, String> converter = Something::startsWith;
        String startWord = converter.convert("Java");
        System.out.println(startWord);


        // 2. 构造方法引用
        // PersonFactory personFactory = (String name, Integer age) -> {
        //     return new Person(name, age);
        // };
        // 构造方法的引用方式
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("cj", 25);
    }

}


class Something {

    static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

}


class Person {

    String name;
    Integer age;

    Person() {}

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}

interface PersonFactory<P extends Person> {
    P create(String name, Integer age);
}




