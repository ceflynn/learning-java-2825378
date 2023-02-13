import java.util.Scanner;
public class Main {
    public static void announceDeveloperTeaTime(){
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start dev tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Tea Time!");

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Your New Job!");
        announceDeveloperTeaTime();
        System.out.println("Write Code");
        System.out.println("Review Code");

        announceDeveloperTeaTime();
        System.out.println("Get Promoted!");
    }

}
