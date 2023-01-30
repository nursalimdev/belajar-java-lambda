package mypackage.lambda.app;

import mypackage.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        using anonymous class
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Nursalim";
//            }
//        };
//
//        System.out.println(simpleAction1.action());

//        using lambda
//        SimpleAction simpleAction2 = (String name)->{
//            return "Nursalim";
//        };
//
//        System.out.println(simpleAction2.action("Nursalim"));


        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        System.out.println(simpleAction1.action("Nursalim"));

        SimpleAction simpleAction2 = (aa) -> {
            return "Hello " + aa;
        };
        System.out.println(simpleAction2.action("Nursalim"));

    }
}
