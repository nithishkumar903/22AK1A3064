import java.util.*;

class Program11 {
    public void equal(String a, String b) {
        if (a.equals(b))
            System.out.println("Integer a is equal to Integer b");
        else
            System.out.println("Integer a is not equal to Integer b");
    }

    public void comparison(String a, String b) {
        if (a.length() > b.length())
            System.out.println("Integer a is greater than b");
        else if (a.length() < b.length())
            System.out.println("Integer b is greater than a");
        else {
            if ((a.charAt(0) - '0') < (b.charAt(0) - '0'))
                System.out.println("Integer b is greater than a");
            else if ((a.charAt(0) - '0') > (b.charAt(0) - '0'))
                System.out.println("Integer a is greater than b");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first 10 digit number:");
        String a = sc.next();
        System.out.println("Enter the second 10 digit number:");
        String b = sc.next();
        Program11 c = new Program11();
        c.equal(a, b);
        c.comparison(a, b);
    }
}