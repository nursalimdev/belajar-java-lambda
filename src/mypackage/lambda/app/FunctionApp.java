package mypackage.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {

        // Without lambda
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(functionLength.apply("Nursalim"));

        // With lambda
        Function<String, Integer> functionWithLambda = value -> value.length();
        System.out.println(functionWithLambda.apply("Belajar Java Lambda"));
    }
}
