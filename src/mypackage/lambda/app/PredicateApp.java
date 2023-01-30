package mypackage.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        // Without lambda
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.isBlank();
            }
        };
        System.out.println(predicate.test("Nursalim"));
        System.out.println(predicate.test(" "));
        System.out.println(predicate.test(""));

        // With lambda
        Predicate<String> predicateLambda = value -> value.isBlank();
        System.out.println(predicateLambda.test("Nursalim"));
    }
}
