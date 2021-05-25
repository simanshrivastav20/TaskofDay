package DailyTask;

public class Task1 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(reverse(str));

    }

    public static String reverse(String input) {

        if (input == null || input.length() < 0)
            throw new IllegalArgumentException("Please provide an input!");

        char[] result = input.toCharArray();

        int startIndex = 0;
        int endIndex = result.length - 1;
        char temp;

        for (; endIndex > startIndex; startIndex++, endIndex--) {
            temp = result[startIndex];
            result[startIndex] = result[endIndex];
            result[endIndex] = temp;
        }

        return new String(result);

    }
}
