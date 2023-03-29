import java.util.HashMap;

public class homework31 {


    public static void main(String[] args) {

        String a = "aaaabbbcc";
        HashMap<Character,Integer> aa= new HashMap<>();

        for(int i=0;i<a.length();i++){

            int count=0;
                char z = a.charAt(i);
                if(aa.containsKey(z)){

                    count = aa.get(z);
                }
                aa.put(z,count+1);
            }


        System.out.println(aa);

        }


















    }

