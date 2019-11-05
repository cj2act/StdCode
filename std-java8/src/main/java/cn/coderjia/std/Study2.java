package cn.coderjia.std;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 简单的应用下lambda
 * @author Coder.JiA
 * @date 31/10/2019 7:50 PM
 **/
public class Study2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("cj", "cj2", "cj3", "cj3");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        names.sort((String o1, String o2) -> {
            return o2.compareTo(o1);
        });

        names.sort((String o1, String o2) -> o2.compareTo(o1));

        names.sort((o1, o2) -> o2.compareTo(o1));

        names.sort(Comparator.reverseOrder());
    }



}
