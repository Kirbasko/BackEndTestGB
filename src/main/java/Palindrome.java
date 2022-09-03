import java.util.stream.IntStream;

public class Palindrome {
    public boolean isPalindrome (String string) {
        String text  = string.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, text.length() / 2)
                .noneMatch(i -> text.charAt(i) != text.charAt(text.length() - i - 1));
    }
    // Внизу более простой метод и он не работает со строками, где много пробелов
    /*
        public boolean isPalindrome (String string){
            StringBuffer buffer = new StringBuffer(string);
            buffer.reverse();
            String data = buffer.toString();
            if (string.toLowerCase(data)) {
                return true;
            } else {
                return false;
            }
        }
     */
}