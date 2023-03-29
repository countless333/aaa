import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class phoneinfo{


List<Map<String,String>> a = new ArrayList<>();

    public void insertPhoneInfo(String name, String number) {
        //이름과 번호를 배열에 저장
        HashMap<String,String> as = new HashMap();
        as.put(name, number);
        a.add(as);
    }

    //모든 PhoneInfo 출력
    public void printAllPhoneInfo() {

        for(Map<String,String> zz : a){


            for(String key : zz.keySet()){

                System.out.println(key + "      " + zz.get(key));


            }

        }



    }

    //번호에 해당하는 이름과 번호 출력
    public void printPhoneInfo(String name) {
        for(Map<String,String> z : a){
            for(String g :z.keySet()){
                if(g.equals(name)){

                    System.out.println(name +"    " +  z.get(name));
                }

            }

        }






    }



}



public class homework23 {

    public static void main(String[] args) {


phoneinfo p = new phoneinfo();

p.insertPhoneInfo("김은석", "01027648978");
        p.insertPhoneInfo("바보김", "01027648978");
        p.insertPhoneInfo("두반장", "21027255578");

        p.insertPhoneInfo("김중기", "02667648978");

        p.insertPhoneInfo("하물며", "07227648978");

p.printAllPhoneInfo();
p.printPhoneInfo("김은석");
    }
}
