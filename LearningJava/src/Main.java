import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String question = "Which of the following contains the 4 disc golf flight numbers?";
        String choiceOne = "Speed-Glide-Turn-Force";
        String choiceTwo = "Speed-Glide-Turn-Fade";
        String choiceThree = "Speed-Glide-Torque-Fade";

        String correctAnswer = choiceTwo;

        //Write a print statement asking the question.
        System.out.println(question);
        //write a print statement giving the choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", "+ choiceThree);

        //Have the user input an answer
        Scanner scanner = new Scanner(System.in);
        //Retrieve the user answer
        String input = scanner.next();

        //If the user's answer is correct...
        //Then the user is correct and we want to print out congrats
        if(correctAnswer.equals(input)){
            System.out.println("Congrats!");
        }else{
            System.out.println("Sorry you are incorrect. The correct answer is "+ correctAnswer);

        }
        //If the user is incorrect we want to print out a message saying that its incorrect
    }
    }
