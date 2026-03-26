/*Class named Student with properties as Student Id, Student Name, gender,
department, Age, Aggregate and methods as insertStudent() for inserting student
details and displayStudent() for printing student details.*/
import java.util.Scanner;

class Student 
{
    int studentId;
    String studentName;
    String gender;
    String department;
    int age;
    double aggregate;
    void insertStudent() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Gender: ");
        gender = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Aggregate: ");
        aggregate = sc.nextDouble();
    }
    void displayStudent() {

        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Aggregate: " + aggregate);
    }
}

class StudentDemo 
{

    public static void main(String[] args) 
    {

        Student s = new Student();
        s.insertStudent();
        s.displayStudent();
    }
}
