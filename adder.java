import java.util.Scanner;
public class adder {
    public static void main(String args[]) {
        Scanner revanth = new Scanner(System.in);
        double a, b, sum;
        System.out.println("Enter the first number:");
        a = revanth.nextDouble();
        System.out.println("Enter the second number: ");
        b = revanth.nextDouble();
        sum = a + b;
        System.out.println("Their sum is:");
        System.out.println(sum);
    }
}
