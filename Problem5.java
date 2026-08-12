import java.util.Scanner;

class Person {
    String name;

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String studentId;

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String researchArea;

    void displayGraduateStudent() {
        System.out.println("Research Area: " + researchArea);
    }
}

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GraduateStudent gs = new GraduateStudent();

        gs.name = sc.nextLine();
        gs.studentId = sc.nextLine();
        gs.researchArea = sc.nextLine();

        gs.displayPerson();
        gs.displayStudent();
        gs.displayGraduateStudent();
    }
}
