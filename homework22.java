import java.util.HashMap;

public class homework22 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int sum;
        HashMap<Integer, Integer> aaaa = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                sum = a[i] + a[j];

                int count = 0;
                if (aaaa.containsKey(sum)) {
                    count = aaaa.get(sum);

                }
                aaaa.put(sum, count + 1);

            }

        }


        System.out.println(aaaa);


    }


}
