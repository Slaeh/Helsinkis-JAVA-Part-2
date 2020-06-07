import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter=0;
        int i = Integer.parseInt(scanner.nextLine());
        while(counter<=i){
            System.out.println(counter);
            counter++;
        }
    }
}
