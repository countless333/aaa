import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class homework12 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> a= new LinkedList<>();

        for(int i=0;i<5;i++){

            int b = sc.nextInt();
            a.add(b);

        }

        a.set(3,100);
        a.set(4,200);
        System.out.println(a);










    }



}
