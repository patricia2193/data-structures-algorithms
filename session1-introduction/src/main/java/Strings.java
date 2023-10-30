public class Strings {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] strinsToReverse = {'h','e','l','l','o'};
        reverseString(strinsToReverse);
        System.out.println(strinsToReverse);
        char[] secondStrinsToReverse = {'H','a','n','n','a','h'};
        reverseString(secondStrinsToReverse);
        System.out.println(secondStrinsToReverse);
    }
}
