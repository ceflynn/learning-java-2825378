public class Main {

    public static void main(String[] args) {
       Student profileOne = new Student("Chris","Flynn","Business",4.00,
               2023);

       Student profileTwo = new Student("Andrea","Flynn","Art",3.45,
               2024);

       profileTwo.incrementGradYear();
       System.out.println(profileTwo.expectedYearToGraduate);
    }

}
