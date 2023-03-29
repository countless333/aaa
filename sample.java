import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a = sc.next();
HashMap<Character,Integer> m = new HashMap<>();
for(int i=0;i<a.length();i++){
    int count=0;
    if(m.containsKey(a.charAt(i))){
        count = m.get(a.charAt(i));
    }
    m.put(a.charAt(i),count+1);

}

        System.out.println(m);


for(Map.Entry<Character,Integer>entry:m.entrySet()){

    

}
















    }
}
