import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUtility {
    private static Set<String> set1;
    private static Set<String> set2;

    public static String and(String firstInput, String secondInput,Set<String> allowedValues) {
        String andResult = "";
        set1 = new HashSet<>(Arrays.asList(firstInput.split(",")));
        set2 = new HashSet<>(Arrays.asList(secondInput.split(",")));

        set1.retainAll(set2);
        set1.retainAll(allowedValues);
        for (String s : set1) {
            andResult += s + ",";
        }
        return andResult.substring(0,andResult.length()-1);

    }

    public static String or(String firstInput, String secondInput, Set<String> allowedValues) {
        String orResult = firstInput+","+secondInput;

        set1 = new HashSet<>(Arrays.asList(orResult.split(",")));
        set1.retainAll(allowedValues);
        orResult = "";
        for(String s : set1){
            orResult += s +",";
        }
        return orResult.substring(0,orResult.length()-1);
    }
}
