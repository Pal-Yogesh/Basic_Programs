import java.util.Scanner;

public class Student {
    int roll;
    String name;
    int marks;

    Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student arr[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Student(sc.nextInt(), sc.nextLine(), sc.nextInt());
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].roll+ "   " + arr[i].name +"  " + "   " + arr[i].marks);
        }
    }
}
