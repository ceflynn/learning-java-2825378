public class Student {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    public Student(String firstName, String lastName, String declaredMajor,
                   double gpa, int expectedYearToGraduate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate =expectedYearToGraduate;

    }
    public void incrementGradYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
