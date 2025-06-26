 package kit;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {
    private final List<Employe> employees = new ArrayList<>();

    public void addEmploye(Employe employee) {
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employee to display");
        } else {
            employees.forEach(System.out::println);
        }
    }

    public void updateEmployee(int id, String newName, int newSalary, String newDes) {
        for (Employe employee : employees) {
            if (employee.getId() == id) {
                employee.setName(newName);
                employee.setSalary(newSalary);
                employee.setDes(newDes);
                System.out.println("Employee updated.");
                return;
            }
        }
        System.out.println("Employee not found");
    }

    public void deleteEmployee(int id) {
        boolean removed = employees.removeIf(s -> s.getId() == id);
        if (removed) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
