package students;

public class Student {

    public String studentName;
    public int studentAge;
    public double studentGrade;

    public Student(String studentName, int studentAge, double studentGrade) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String show(String studentName){
        String comment = "Excellent student";
        if (this.studentGrade < 5.0){
            comment = "Average student";
        }

        return new String(this.studentName + " is "+this.studentAge +" years old." + comment);
    }
}
