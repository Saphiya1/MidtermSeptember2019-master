package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String s = "MADAM";
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);

        }
        if (s.equals(reverse)) {
            System.out.println(s + "--word is a palindron");
        } else {
            System.out.println(s + "--word is not a palindron");
        }

    }

}
