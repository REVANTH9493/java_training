public class polymorphism_overriding {
    public static void main(String[] args) {
        A obja = new A();
        B objb = new B();
        obja.a();
        obja.b();
        objb.a();
        objb.b();
        objb.c();
    }
}

class A{
    void a(){
        System.out.println("a - It is a method of class A");
    }
    void b(){
        System.out.println("b - It is a method of class A");
    }
}

class B extends A{
    void c(){
        System.out.println("c - It is a method of class B");
    }
    void b(){
        System.out.println("b - It is a method of class B");
    }
    void a(){
        System.out.println("a - It is a method of class B");
    }
}