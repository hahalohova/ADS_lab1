import java.util.Scanner;
import java.util.Arrays;

public class Main {   //#1 task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i, min = 1000000;
        for(i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}





public class Main {     //#2 task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double counter = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            counter +=arr[i];
        }
        System.out.println(counter/n);
    }
}






public class Main {     //#3 task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n <= 1) System.out.println(n + "is not prime numbers ");
        else for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
            break;
        }
        if(isPrime) System.out.println(n +" is prime number");
        else System.out.println(n + " is composite number");
    }
}





public class Main {      //#4 task
    public static int factorial(int number, int mult) {
        if(mult==1) return 1;
        number *= mult;
        return mult * factorial(number, mult-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, number;
        System.out.println(factorial(1, sc.nextInt()));
    }
}






public class Main {    //#5 task

    public static int fibonachi( int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        i--;
        return fibonachi(i-1) + fibonachi(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(fibonachi(i));
    }
}






public class Main {   //#6 task
    public static int power(int number, int degree){
        if(degree == 0) return 1;
        degree--;
        return number * power(number, degree);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int degree = sc.nextInt();
        System.out.println(power(number, degree));
    }
}






public class Main {     //#10 task
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = 0, r = 0;
        System.out.println(GCD(a, b, q, r));
    }
    static int GCD(int a, int b, int q, int r){
        if(a>b) {
            r= a % b;
            q = a / b;
            a = b;
            if (r != 0) {
                b = r;
                return GCD(a, b, q, r);
            }
            else return b;
        }
        else if (a<b) {
            r = b%a;
            q = -(b/a);
            a = b;
            if (r != 0) {
                b = r;
                return GCD(a, b, q, r);
            }
            else return b;
        }
        return a;
    }
}



