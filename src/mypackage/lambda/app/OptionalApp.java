package mypackage.lambda.app;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Nursalim");
        sayHello(null);
    }

    public static void sayHello(String name){
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpper.ifPresent(s -> System.out.println(s));

//        Optional.ofNullable(name)
//                .map(s -> s.toUpperCase())
//                .ifPresent(s -> System.out.println(s));

        // bisa pake method reference
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(s -> System.out.println("HELLO " + s), () -> System.out.println("HELLO "));

        String hello = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("Hello " + hello);



//        String nameUpper = name.toUpperCase();
//        System.out.println("HELLO " + optionalNameUpper.get());

    }
}
