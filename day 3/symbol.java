import java.util.Scanner;   
public class symbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("Enter the first no:");

        int b = sc.nextInt();
        System.out.println("Enter second no:");

        int oper = sc.nextInt();
        System.out.println("Enter the operation no:");

        switch (oper) {
            case 1:
                System.out.println("Sum:" + (a + b));
                break;
            case 2:
                System.out.println("Sub:" + (a - b));
                break;
            case 3:
                System.out.println("Mul:" + (a * b));
                break;
            case 4:
                System.out.println("Div:" + (a / b));
                break;
            case 5:
                System.out.println("Mod:" + (a % b));
                break;
            default:
                System.out.println("Invalid input");
        }
        sc.close();
    }
}
