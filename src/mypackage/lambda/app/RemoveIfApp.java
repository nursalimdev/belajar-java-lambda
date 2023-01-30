package mypackage.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Satu", "Nursalim", "Empat"));

        // remove if anonymous
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });
        System.out.println(names);

        // lambda
        names.removeIf(name -> name.length() > 5);
    }
}
