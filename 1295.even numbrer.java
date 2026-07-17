import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Even numbers from 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
Sample Output
Enter a number: 10
Even numbers from 1 to 10 are:
2
4
6
8
10
Explanation
Scanner sc = new Scanner(System.in); → Reads input from the user.
int n = sc.nextInt(); → Stores the entered number.
for (int i = 1; i <= n; i++) → Loops from 1 to n.
if (i % 2 == 0) → Checks whether the number is even.
% is the modulus operator.
If the remainder is 0 when divided by 2, the number is even.
System.out.println(i); → Prints the even number.
Another Method (More Efficient)

Instead of checking every number, start from 2 and increment by 2.

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Even numbers are:");

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}

This method is more efficient because it iterates only through even numbers.
