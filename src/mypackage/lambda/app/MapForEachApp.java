package mypackage.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("satu", "Nursalim");
        map.put("dua", "Ziah");
        map.put("tiga", "Naura");

        // for each
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // for each anonymous
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        // With lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));


    }
}
