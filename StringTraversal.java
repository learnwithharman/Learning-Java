public class StringTraversal {
    public static void main(String[] args) {

        String username = "Harman123";

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        // Traversing string
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);

            // Check vowel
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels++;
            }
            // Check digit
            else if (Character.isDigit(ch)) {
                digits++;
            }
            // Check consonant
            else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

        System.out.println("Username: " + username);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
    }
}