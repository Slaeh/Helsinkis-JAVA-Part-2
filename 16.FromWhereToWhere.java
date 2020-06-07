import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int j =Integer.parseInt(scanner.nextLine());
        while(j<=i){
            System.out.println(j);
            j++;
        }
    }
}
