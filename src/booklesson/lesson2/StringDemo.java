package booklesson.lesson2;

public class StringDemo {
    public static void main(String[] args) {

        String nationalAnthemLineOne = "My Bangal of Percious Gold, I Love You";
        String nationalAnthemLineTwo = "Forever Your skies , your air set my heart in tune \n" + "As if it were a flute";
        String nationalAnthem = nationalAnthemLineOne + nationalAnthemLineTwo;

        System.out.println(nationalAnthem);
        System.out.println("Adding two or more string called concatenation");
        String example = """
                String s1 = "A string" -4;
                         String s2 = "Hello" / 2;
                         String s3 = "Reham" * "Reham"
                """;
        System.out.println("But remember we can not sub, maul div in string. \n Example: " + example );

    }
}
