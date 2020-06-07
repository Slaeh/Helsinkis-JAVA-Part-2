import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int j = Integer.parseInt(scanner.nextLine());
        double squareRoot = Math.sqrt(i+j);
        System.out.println(squareRoot);
    }
}
