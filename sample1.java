import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sample1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freqMap);
    }


}
