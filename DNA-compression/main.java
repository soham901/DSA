import java.util.Arrays;

class Demo {

    public static void main(String args[]) {
        String input = "A5T2C3G4A2";
        StringBuilder finalString = new StringBuilder();
        String[] nums = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        for (int i = 0; i < input.length(); i++) {
            if (Arrays.asList(nums).contains(String.valueOf(input.charAt(i)))) {
                System.out.println(input.charAt(i));
                for (
                    int j = 1;
                    j < Character.getNumericValue(input.charAt(i));
                    j++
                ) {
                    finalString.append(input.charAt(i - 1));
                }
            } else {
                finalString.append(input.charAt(i));
            }
        }

        System.out.println(finalString.toString());
    }
}
