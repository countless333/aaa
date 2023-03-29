import java.util.*;

public class ss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        Map<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        Iterator<Map.Entry<Character, Integer>> iter = freqMap.entrySet().iterator();

        int maxCount = 0;
        char maxChar = ' ';
        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("가장 많이 등장한 문자: " + maxChar);
        System.out.println("등장 횟수: " + maxCount);
    }
}