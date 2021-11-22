package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Student(String firstName, String lastName, int age, String town) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String[]tokens = input.split("\\s+");
            String firstName= tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String town = tokens[3];

            if (isStudentExist(studentList,firstName,lastName)){
                Student student = getStudent(studentList, firstName,lastName);
                if (student != null){
                    student.setAge(age);
                    student.setTown(town);
                }
            } else {
                Student student = new Student(firstName, lastName, age, town);
                studentList.add(student);
            }

            input= scanner.nextLine();

        }
        String town = scanner.nextLine();
        for (Student student:studentList) {
            if (student.getTown().equals(town)){
                System.out.println(student);
            }

        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    private static Student getStudent(List<Student> studentList, String firstName, String lastName) {
        for (Student student:studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return student;
            }
        }

        return null;
    }

    private static boolean isStudentExist(List<Student> student, String firstName, String lastName) {

        for (Student st : student) {
            if (st.getFirstName().equals(firstName) && st.getLastName().equals(lastName)){
                return true;
            }
        }

        return false;
    }

    public String toString(){
        return this.firstName + " " + this.lastName+ " " + "is "+ this.age + " years old";
    }
}
