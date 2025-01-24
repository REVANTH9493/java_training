public class interest_calculator {
    public static void main(String[] args) throws Exception {
        double amount;
        double principle = 10000;
        double rate = 0.01;

        for(int d = 1; d <= 10; d++){
            amount = principle*Math.pow(1 + rate, d);
            System.out.println(d + "   " + amount);
        }
    }
}
