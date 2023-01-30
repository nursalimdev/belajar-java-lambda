package mypackage.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        // without lambda
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "Nursalim";
            }
        };
        System.out.println(supplier.get());

        // with lambda
        Supplier<String> supplierLambda = () -> "Nursalim 2";
        System.out.println(supplierLambda.get());
    }
}
