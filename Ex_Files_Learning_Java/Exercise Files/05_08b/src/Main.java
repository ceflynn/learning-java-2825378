public class Main {
    public static double salaryCalc(double hoursWorkedWeekly, double payPerHour, int vacationDays){
        if(hoursWorkedWeekly<0){
            return -1;
        }
        if(payPerHour <0){
            return -1;
        }
        double weeklyPay = hoursWorkedWeekly * payPerHour;
        double unpaidTime = vacationDays * payPerHour * 8;
        return (weeklyPay * 52) - unpaidTime;
    }
    public static void main(String[] args) {
        double salary = salaryCalc(40,17.45,3);
        System.out.println(salary);
    }

}
