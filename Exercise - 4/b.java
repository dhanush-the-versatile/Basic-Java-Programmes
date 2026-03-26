/* Create a class Student with same properties as above and create a 
   constructor to insert student details and return the data using 
   toString() method. */
import java.util.Scanner;

class Student 
{
    int studentId;
    String studentName;
    String gender;
    String department;
    int age;
    double aggregate;

    Student(int studentId, String studentName, String gender,
            String department, int age, double aggregate) 
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.department = department;
        this.age = age;
        this.aggregate = aggregate;
    }

    public String toString() 
    {
        return "\nStudent Details:\n" +
               "Student ID: " + studentId + "\n" +
               "Student Name: " + studentName + "\n" +
               "Gender: " + gender + "\n" +
               "Department: " + department + "\n" +
               "Age: " + age + "\n" +
               "Aggregate: " + aggregate;
    }
}

class StudentDemo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Aggregate: ");
        double aggregate = sc.nextDouble();

        Student s = new Student(id, name, gender,
                                department, age, aggregate);

        System.out.println(s);

        sc.close();
    }
}
