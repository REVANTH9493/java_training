public class Palindrome {
    public static void main(String[] args) {
        int num = 1234321;
        int a = Reverse.reverse(num);
        System.out.println(num==a?"Is a palindrome":"Is not a palindrome");
    }
}


