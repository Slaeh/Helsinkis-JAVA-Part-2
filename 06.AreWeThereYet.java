import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int i = Integer.parseInt(scanner.nextLine());
            if(i==4){
                break;
            }
        }
    }
}
