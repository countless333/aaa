import java.util.ArrayList;
import java.util.List;

public class class6 {

    public static void main(String[] args) {






        //Number상속받는 T
        //리턴타입 List<T> get even(List<T> list)
    }

public static <T extends Number> T geteven(List<T>list){

        T max = list.get(0);
                for(int i=1;i<list.size();i++){
                    T item = list.get(i);
                if(item.intValue()%2==0&&item.doubleValue()>max.doubleValue()){
                    max=item;
                }

                }
                return max;

}

//public static <T extends Number> List<T> getevenn(List<T> list){
//        T max = list.get(0);
//        for(int i=0;i<list.size();i++){
//            T item = list.get(i);
//            if(item.intValue()%2==0&&item.doubleValue()>max.doubleValue()){
//                max =item;
//            }
//
//        }
//
//        List<T> result = new ArrayList<>();
//        result.add(max);
//        return result;
//}

//    public static <T extends Number> List<T> getevnen(List<T> list){
//        T max = list.get(0);
//
//
//        for(int i=1;i<list.size();i++){
//
//            if(list.get(i).doubleValue()>max.doubleValue()){
//                max = list.get(i);
//
//            }
//        }
//
//        List<T> result = new ArrayList<>();
//        result.add(max);
//        return result;
//
//    }

//    public static <T extends Number> List<T> getevennn(List<T> list){
//        T max = list.get(0);
//
//        for(int i =1;i<list.size();i++){
//            T item = list.get(i);
//            if(max.doubleValue()<item.doubleValue()){
//                max = item;
//            }
//        }
//        List<T> result = new ArrayList<>();
//        result.add(max);
//        return result;
//
//    }


//    public static <T extends Number> List<T> getover(List<T> list){
//        T max = list.get(0);
//        for(int i=1;i<list.size();i++){
//            T item = list.get(i);
//            if(max.doubleValue()<item.doubleValue()){
//                max = item;
//            }
//
//        }
//
//        List<T> result = new ArrayList<>();
//        result.add(max);
//        return result;
//
//
//    }

public static <T extends Number> List<T> getevv(List<T> list){
        T max = list.get(0);
        for(int i=1;i<list.size();i++){
            T item = list.get(i);
            if(max.doubleValue()<item.doubleValue()){

                max = item;

            }


        }
        List<T> result = new ArrayList<>();
        result.add(max);
        return result;


}


}
