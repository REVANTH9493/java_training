public class Reverse {
    public static void main(String[] args) {
        int num = 234;
        System.out.println(reverse(num));

    }
    public static int reverse(int num){
        int b = 0;
        while (num!=0){
            int a = num%10;
            b = (b*10) + a;
            num = num/10;
        }
        return b;
    }
}
