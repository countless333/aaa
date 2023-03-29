import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class homework33 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        arr.add(3);

        arr.add(4);

        arr.add(5);



        HashMap<Integer,Integer>a = new HashMap<>();


        for(int i=0;i<arr.size();i++){

            for(int j=i+1;j<arr.size();j++){
                int bbb= arr.get(i)+arr.get(j);
                int count=0;
                if(a.containsKey(bbb)){
                    count=a.get(bbb);
                }
                a.put(bbb,count+1);
            }
        }


        System.out.println(a);
    }


}
