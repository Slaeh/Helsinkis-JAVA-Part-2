import java.util.Scanner;
public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times?");
        int i = Integer.parseInt(reader.nextLine());
        for(int a =1; a <=i; a++){
            printText();
        }
    }
    public static void printText() {
        // Write some code in here
        System.out.println("In a hole in the ground there lived a method");
    }
}
