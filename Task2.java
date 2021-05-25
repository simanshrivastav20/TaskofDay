package DailyTask;

public class Task2 {
    public static void main(String[] args) {
        String sample = "consultadd";
        StringBuffer updatedString = new StringBuffer();
        char[] characters = sample.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];
            if (i % 2 != 0) {
                c = Character.toUpperCase(c);
            }
           updatedString.append(c);
        }
        System.out.println("Changed string is: " + updatedString.toString());

    }
}
