public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        
        // System.out.println(sum);
        // if (sum == num){
        //     System.out.println("It is an armstrong number");
        // }
        // else{
        //     System.out.println("Not an armstrong number");
        // }
        System.out.println(is_armstrong(num));
    }
    public static int no_digits(int num){
        int count = 0;
        while (num != 0){
            count++;
            num = num/10;
        }
        return count;
    }
    public static boolean is_armstrong(int num){
        int digit = no_digits(num);
        int num_temp = num;
        int a = 0;
        // double sum = 0;    
        int sum = 0;                                     
        while (num_temp != 0){
            a = (num_temp%10);
            // temp = temp + (a*a*a);
            // sum = sum + Math.pow(a, digit); 
            sum = sum + (int)Math.pow(a, digit);                    
            num_temp = num_temp/10;
        }
        return num == sum;
    }
}
