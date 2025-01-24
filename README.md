Java Basics
Introduction
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle). It is platform-independent due to its "Write Once, Run Anywhere" (WORA) capability, enabled by the Java Virtual Machine (JVM).

Key Features of Java
Platform Independent – Java programs run on any OS with a JVM.
Object-Oriented – Follows OOP principles like inheritance, polymorphism, and encapsulation.
Robust and Secure – Strong memory management and built-in security features.
Multi-threaded – Supports concurrent execution for efficient performance.
Rich API & Libraries – Extensive built-in libraries and frameworks.
Setting Up Java
Download and install JDK (Java Development Kit) from Oracle or OpenJDK.
Set up the environment variables (JAVA_HOME and PATH).
Verify installation using:
sh
Copy
Edit
java -version
Basic Java Syntax
Hello World Program
java
Copy
Edit
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
Variables and Data Types
java
Copy
Edit
int num = 10;       // Integer
double pi = 3.14;   // Floating-point number
char letter = 'A';  // Character
boolean flag = true;// Boolean
String text = "Java";// String
Control Statements
java
Copy
Edit
// If-Else
if (num > 0) {
    System.out.println("Positive Number");
} else {
    System.out.println("Negative Number");
}

// For Loop
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}

// While Loop
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
Functions (Methods)
java
Copy
Edit
public class MathOperations {
    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);
    }
}
Object-Oriented Programming (OOP) Example
java
Copy
Edit
class Car {
    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.display();
    }
}
How to Compile and Run Java Programs
Compile the program:
sh
Copy
Edit
javac HelloWorld.java
Run the program:
sh
Copy
Edit
java HelloWorld
