import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number");
        int a = sc.nextInt();
        System.out.println("enter your second number");
        int b = sc.nextInt();
        System.out.println("enter your third number");
        int c = sc.nextInt();
        System.out.println("enter your forth number");
        int d = sc.nextInt();
        System.out.println("enter your fifth number");
        int e = sc.nextInt();

        float f1 = ((a+b+c+d+e)/500.0f)*100;

        System.out.println("percentage" + "=" + f1);
    }
}
