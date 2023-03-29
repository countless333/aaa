import java.util.*;

public class class8 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> list2 = Arrays.asList(1.5, 2.0, 3.5, 4.0, 5.5, 6.0, 7.5, 8.0, 9.5, 10.0);


        System.out.println(class8.geteven(list1));
//        HashMap<Integer,Integer> m = new HashMap<>();
//        m.put(3,2);
//        m.put(5,7);
//
//        m.put(6,2);
//
//        m.put(1,8);
//
//class8.maxkey(m);
//        System.out.println(class8.maxkey(m));


    }
    public static <T extends Number>List<T> geteven(List<T> list){
        T max = list.get(0);
        ArrayList<T> arr = new ArrayList<>();
        for(T t : list){
            if((int)t%2==0&&(int) t > (int) max){

                max = t;
            }

        }
arr.add(max);
        return arr;

    }

//// 리스트를 매개변수로 받고 제네릭 변수는 숫자한정 리턴은 더블로



}
