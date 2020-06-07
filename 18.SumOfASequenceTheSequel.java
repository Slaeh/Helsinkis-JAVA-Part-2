import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.println("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int second = Integer.parseInt(scanner.nextLine());
        for(int i=first; first <=second; first++){
            sum += first;
        }
        System.out.println("The sum is "+ sum);
    }
}
