package mypackage.lambda.app;

import mypackage.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        // without lambda
        Predicate<String> predicateIsLowercase = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return StringUtil.isLowerCase(value);
            }
        };

        // with lambda without method reference
//        Predicate<String> predicateIsLowerLambda = value -> StringUtil.isLowerCase(value);

        // with lambda with method reference
        Predicate<String> predicateIsLowerLambda = StringUtil::isLowerCase;
        System.out.println(predicateIsLowercase.test("nursalim"));
        System.out.println(predicateIsLowerLambda.test("Nursalim"));

        // Method reference di parameter
        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(functionUpper.apply("hahahaha"));

//        Function<String, String> functionUpperLambda = value -> value.toUpperCase();

        // tipe parameter: function
        Function<String, String> functionUpperLambda = String::toUpperCase;
    }

    public void run(){
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicateIsLowerLambda = app::isLowerCase2;

        Predicate<String> predicateIsLowerLambda2 = this::isLowerCase2;

        System.out.println(predicateIsLowerLambda.test("Nursalim"));
        System.out.println(predicateIsLowerLambda2.test("Nursalim"));
    }

    public boolean isLowerCase2(String value){
        for(var chr : value.toCharArray()){
            if(!Character.isLowerCase(chr)){
                return false;
            }
        }
        return true;
    }
}
