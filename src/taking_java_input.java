


import java.util.Scanner;

public class taking_java_input {



    public static void main(String[] args) {
        System.out.println("taking imput from the user");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float f1 = sc.nextFloat();

//        System.out.println("enter number 2");
//        float f2 = sc.nextFloat();
//        float sum = f1+ f2;

//        int b = sc.nextInt();
//        int sum = a+b;
//        System.out.println("the sum of this number is");
//        System.out.println(sum);

        Scanner sc = new Scanner (System.in);
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter the total marks of this exam: ");
            int total_marks = sc.nextInt();
            System.out.print("Enter the marks in Bengali: ");
            int a = sc.nextInt();
            System.out.print("Enter the marks in English: ");
            int b = sc.nextInt();
            System.out.print("Enter the marks in Geography: ");
            int c = sc.nextInt();
            System.out.print("Enter the marks in History: ");
            int d = sc.nextInt();
            System.out.print("Enter the marks in Mathematics: ");
            int e = sc.nextInt();
            float sum = (a+b+c+d+e);
            float per = (sum/total_marks)*100;
            System.out.println(name+" got "+per+" %.");
    }
}
