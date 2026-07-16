import java.util.Scanner;

public class DefangIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an IP Address: ");
        String address = sc.nextLine();

        String defanged = address.replace(".", "[.]");

        System.out.println("Defanged IP Address: " + defanged);

        sc.close();
    }
} 
