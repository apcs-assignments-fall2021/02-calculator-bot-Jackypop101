import java.util.Scanner;
import java.lang.Math;
public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int x = 0;
        if (a>b) {
            x = a;
            if (c>x) {
                return (x);
            }
            else {
                if (c>b) {
                    return (c);
                }
                else {
                    return (b);
                }
            }
        }
        else {
            x = b;
            if (c > x) {
                return (x);
            }
            else {
                if (c > a) {
                    return (c);
                } else {
                    return (a);
                }
            }
        }
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        if (x>y) {
            return (a);
        }
        else {
            return (b);
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out? (median, larger_absolute_value, pythagoras)");
        String command = scan.next();
        if (command.equals("median")) {
            System.out.println("What will be the first number?");
            int a = scan.nextInt();
            System.out.println("What will be the second number?");
            int b = scan.nextInt();
            System.out.println("What will be the third number?");
            int c = scan.nextInt();
            System.out.println(median(a,b,c));
        }
        if (command.equals("larger_absolute_value")) {
            System.out.println("What will be the first number?");
            int a = scan.nextInt();
            System.out.println("What will be the second number?");
            int b = scan.nextInt();
            System.out.println(magnitude(a, b));
        }
        if (command.equals("pythagoras")) {
            System.out.println("What will be the first number?");
            int a = scan.nextInt();
            System.out.println("What will be the second number?");
            int b = scan.nextInt();
            System.out.println(pythagoras(a, b));
        }
    }
}
