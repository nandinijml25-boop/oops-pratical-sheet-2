import java.util.Scanner;

class Employee {
    void displayRole() {
        System.out.println("Role: Employee");
    }
}

class Developer extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Developer");
    }
}

class Manager extends Employee {
    @Override
    void displayRole() {
        System.out.println("Role: Manager");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        Employee emp;
        if (choice == 2) {
            emp = new Developer();
        } else if (choice == 3) {
            emp = new Manager();
        } else {
            emp = new Employee();
        }
        
        emp.displayRole();
    }
}
