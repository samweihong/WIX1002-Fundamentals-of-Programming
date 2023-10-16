package tuto5;

public class Q4 {

    public static void main(String[] args) {
        String[] sentence = {"the smallest", "take the umbrella", "the and the", "thesaurus", "sunbathe"};
        // 4 the(s)

        int count = 0;
        for (String s : sentence) {
            // The word "the" is counted only in conditions "the ...", "... the ...", "... the".
            int index = 0;
            // The maximum index of "the" is s.length() - 3.
            while (true) {
                index = s.indexOf("the", index);
                if (index == -1) break;

                // Check if "the" is first word or there is space before it.
                boolean front = (index == 0 || s.charAt(index-1) == ' ');
                // Check if "the" is last word or there is space after it.
                boolean back = (index+3 == s.length() || s.charAt(index+3) == ' ');
                // The word "the" is counted only when both conditions are satisfied.
                if (front && back) count++;
                // Skip the current "the".
                index += 3;
            }
        }
        System.out.println("Number of occurrence of the word \"the\": " + count);
    }
}
