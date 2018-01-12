import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AllowedActions {
    private static final String networkString = "add,delete,modify,clear,hide";
    private static Set<String> allowedActions = new HashSet<>(Arrays.asList(networkString.split(",")));


    public String and(String s1, String s2){
        return SetUtility.and(s1,s2, allowedActions);
    }
    public String or(String s1,String s2){
        return SetUtility.or(s1,s2, allowedActions);
    }
}
