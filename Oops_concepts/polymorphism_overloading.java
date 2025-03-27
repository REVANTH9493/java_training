public class polymorphism_overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(2,3));
        System.out.println(c.sum(2.5,3.8456));
        System.out.println(c.sum(22));
        System.out.println(c.sum(2.1234567890));
        System.out.println(c.sum("Nagidi ","Revanth"));
        System.out.println(c.sum("Revanth "));
    }
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a){
        return a+a;
    }
    String sum(String a, String b){
        return a+b;
    }
    String sum(String a){
        return a+a;
    }
    double sum(double a, double b){
        return a+b;
    }
    double sum(double a){
        return a+a;
    }
}
