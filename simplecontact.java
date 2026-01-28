import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name, phone;
    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

public class ContactManager {
    public static void main(String[] args) {
        ArrayList<Contact> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact  2. View All  3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Phone: ");
                String phone = sc.nextLine();
                list.add(new Contact(name, phone));
            } else if (choice == 2) {
                for (Contact c : list) System.out.println(c.name + " : " + c.phone);
            } else break;
        }
        sc.close();
    }
}
