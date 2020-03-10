import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ") ;
        String nameresponse; // identifies the name of the variable and type
        nameresponse = keyboard.next(); //this means variable will hold next keyboard input

        System.out.print("It's nice to meet you, " + nameresponse + ". How old are you? ") ;
        String ageresponse;
        ageresponse = keyboard.next();
        System.out.println("I see that you are still quite young at only " + ageresponse + ".") ;
        System.out.print("Where do you live? ");

        String placeresponse;
        placeresponse = keyboard.next();
        System.out.print("Wow! I've always wanted to go to " + placeresponse + ". Thanks for chatting with me. Bye!");

    }

}
