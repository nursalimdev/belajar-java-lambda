package mypackage.lambda.util;

public class StringUtil {
    public static boolean isLowerCase(String value){
        for(var chr : value.toCharArray()){
            if(!Character.isLowerCase(chr)){
                return false;
            }
        }
        return true;
    }
}
