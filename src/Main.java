import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Policy Management Menu ---");
            System.out.println("1. Add Policy");
            System.out.println("2. Remove Policy");
            System.out.println("3. Update Policy");
            System.out.println("4. List Policies by Type");
            System.out.println("5. List All Policies");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Policy Number: ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Policy Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Insurance Type (health/life/auto): ");
                    String type = sc.nextLine();
                    System.out.print("Enter Coverage Amount: ");
                    double amount = sc.nextDouble();
                    manager.addPolicy(new Policy(number, name, type, amount));
                    break;

                case 2:
                    System.out.print("Enter Policy Number to Remove: ");
                    int removeNum = sc.nextInt();
                    manager.removePolicy(removeNum);
                    break;//add

                case 3:
                    System.out.print("Enter Policy Number to Update: ");
                    int updateNum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Holder Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Insurance Type: ");
                    String newType = sc.nextLine();
                    System.out.print("Enter New Coverage Amount: ");
                    double newAmount = sc.nextDouble();
                    manager.updatePolicy(updateNum, newName, newType, newAmount);
                    break;//add

                case 4:
                    System.out.print("Enter Insurance Type to List: ");
                    String listType = sc.nextLine();
                    manager.listPoliciesByType(listType);
                    break;

                case 5:
                    manager.listAllPolicies();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
