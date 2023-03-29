import java.util.ArrayList;

public class homework32 {

    public static void main(String[] args) {
        int sum=0;
        int a=0;
        int b=0;

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(182);

        arr.add(11252);

        arr.add(6112);

        arr.add(172);

        arr.add(121);


for(int i=0;i<arr.size();i++){
    for(int j=i+1;j<arr.size();j++){
        if(arr.get(i)+arr.get(j)>sum){
            sum = arr.get(i)+arr.get(j);
           b=arr.get(i);
            a=arr.get(j);
        }


    }


}
        System.out.println(a+" "+b+" "+" = " + sum);



    }






}
