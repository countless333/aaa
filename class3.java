public class class3 {


    public static void main(String[] args) {

        String[] starr = {"java", "html", "javascript"};

        Integer[] intarr = {1,2,3,4,5};
        String result1 = getlastele(starr);
                Integer result2 = getlastele(intarr);

        System.out.println("strarr의 마지막 요소는 " +result1);
        System.out.println("intarr의 마지막 요소는 " +result2);





    }


    public static <T> T getlastele(T[] tarr){
        return tarr[tarr.length-1];

    }
}
