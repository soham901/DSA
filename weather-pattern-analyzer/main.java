import java.util.HashMap;
import java.util.Map;

class Demo {

    public static void main(String[] args) {
        String input = "SSSRRCCRSSSCCCRRH";
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {
                put("S", 0);
                put("R", 0);
                put("C", 0);
                put("H", 0);
            }
        };

        int longestStreak = 0;
        int currentStreak = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;
            while (
                i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)
            ) {
                count++;
                i++;
            }

            map.put(
                String.valueOf(currentChar),
                map.get(String.valueOf(currentChar)) + count
            );

            if (currentChar == 'S') {
                currentStreak = count;
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                }
            }
        }

        System.out.println(map.toString());
        System.out.println(longestStreak);
    }
}
