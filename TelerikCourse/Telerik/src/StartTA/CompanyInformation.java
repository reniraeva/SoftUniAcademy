package StartTA;

import java.util.Scanner;

public class CompanyInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Company name: ");
        String companyName = scanner.nextLine();
        System.out.print("Company address: ");
        String companyAddress = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Fax number:");
        System.out.print("Web site: ");
        String webSite = scanner.nextLine();
        System.out.print("Manager first name: ");
        String firstName= scanner.nextLine();
        System.out.print("Manager last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Manager age: ");
        int managerAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Manager phone: ");
        String managerPhone = scanner.nextLine();


        System.out.println(companyName);
        System.out.println("Address: " + companyAddress);
        System.out.println("Tel. " + phoneNumber);
        System.out.println("Fax: (no fax)");
        System.out.println("Web site: " + webSite);
        System.out.printf("Manager: %s %s (age: %d, tel. %s)",firstName,lastName,managerAge,managerPhone);




    }
}
