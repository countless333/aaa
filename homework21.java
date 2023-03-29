import java.util.HashMap;

public class homework21 {


    public static void main(String[] args) {


        HashMap<String, Integer> kkk   = new HashMap<>();
        kkk.put("김은석", 22);
        kkk.put("석은김", 86);

        kkk.put("두바라", 11);

        kkk.put("다부부", 29);

        int i = 0;
        for(String key : kkk.keySet()){
            if(kkk.get(key)>i){
                i = kkk.get(key);
            }

        }

for(String key:kkk.keySet()){

    if(kkk.get(key).equals(i)){
        System.out.println("이름는  : " + key + ", 점수는  : " + kkk.get(key));
    }

}

    }
}
