import java.util.Scanner;

public class Practical3 {

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("enter any two numbers for mathematical operations");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("your addition is :" + c);
        c = a - b;
        System.out.println("your substraction is :" + c);
        c = a * b;
        System.out.println("your multiplication is :" + c);
        c = a / b;
        System.out.println("your division is :" + c);
        c = a % b;
        System.out.println("your modulo is :" + c);
        sc.close();
}
}
