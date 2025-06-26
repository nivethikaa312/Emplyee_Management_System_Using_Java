  package kit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeService service = new EmployeService();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n-- Employee Management System --");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter salary: ");
                    int salary = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter designation: ");
                    String des = sc.nextLine();

                    service.addEmploye(new Employe(id, name, salary, des));
                }

                case 2 -> service.viewEmployees();

                case 3 -> {
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new salary: ");
                    int newSalary = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new designation: ");
                    String newDes = sc.nextLine();

                    service.updateEmployee(id, newName, newSalary, newDes);
                }

                case 4 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    service.deleteEmployee(id);
                }

                case 0 -> System.out.println("Exiting...");

                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
