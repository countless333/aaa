import java.util.HashMap;
import java.util.Map;

public class homework13 {


    public static void main(String[] args) {

        Map<String, Integer> as = new HashMap<>();

for(int i = 97;i<123;i++){

    as.put(String.valueOf((char)i), i);
        }

        System.out.println(as);
    }

}
