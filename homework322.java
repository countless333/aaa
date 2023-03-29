import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class homework322 {

    public static void main(String[] args) {



        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(182);

        arr.add(11252);

        arr.add(6112);

        arr.add(172);

        arr.add(121);
        int sum =0;
        HashMap<int[],Integer> bbb = new HashMap<>();
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int[] a = {arr.get(i),arr.get(j)};
                bbb.put(a,arr.get(i)+arr.get(j));
               if(arr.get(i)+arr.get(j)>sum){
                   sum=arr.get(i)+arr.get(j);
               }

            }


        }

        for(int[] v : bbb.keySet()){
            if(bbb.get(v).equals(sum)){
                System.out.println(Arrays.toString(v)+"  " + sum);

            }
        }


    }
}
