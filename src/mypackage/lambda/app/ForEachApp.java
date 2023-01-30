package mypackage.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("Satu", "Dua", "Tiga");

        // for each without lambda
        for (var l : list){
            System.out.println(l);
        }

        // for each with anonymous class
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // for each with lambda
        list.forEach(name -> System.out.println(name));

        // for each dengan method parameter
        list.forEach(System.out::println);
    }
}
