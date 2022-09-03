import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void optionalTest (){

        Palindrome palindrome = new Palindrome();
        Assertions.assertTrue(palindrome.isPalindrome("A roza upala na Lapu Azora"));
        Assertions.assertTrue(palindrome.isPalindrome("abba"));
        Assertions.assertTrue(palindrome.isPalindrome("aba"));
        Assertions.assertTrue(palindrome.isPalindrome("a  aab a aa"));
        Assertions.assertTrue(palindrome.isPalindrome("Ab bB a"));

        Assertions.assertFalse(palindrome.isPalindrome("a  aab a a"));
        Assertions.assertFalse(palindrome.isPalindrome("abbc"));
    }
}
