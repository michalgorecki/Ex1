import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SocialMediaNetworks {

    private static final String NETWORK_STRING = "facebook,twitter,youtube,instagram,snapchat";
    private static Set<String> allowedNetworks = new HashSet<>(Arrays.asList(NETWORK_STRING.split(",")));

    public String and(String s1, String s2){
        return SetUtility.and(s1,s2,allowedNetworks);
    }
    public String or(String s1,String s2){
        return SetUtility.or(s1,s2,allowedNetworks);
    }
}

