package cn.coderjia.std;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 内置函数式接口(Built-in Functional Interfaces)
 * @author Coder.JiA
 * @date 4/11/2019 4:54 PM
 **/
public class Study6 {


    public static void main(String[] args) {

        // 1. Predicates
        Predicate<String> predicate = (s) -> s.length() > 0;
        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();


        // 2.Functions
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");     // "123"


        // 3.Suppliers
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person


        // 4.Consumers
        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.name);
        greeter.accept(new Person("Luke", 15));

        // 5.Comparators
        Comparator<Person> comparator = (p1, p2) -> p1.name.compareTo(p2.name);
        Person p1 = new Person("John", 15);
        Person p2 = new Person("Alice", 16);
        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0




    }




}
