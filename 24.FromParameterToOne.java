import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int ans = Integer.parseInt(reader.nextLine());
        printFromNumberToOne(ans);
    }
    public static void printFromNumberToOne(int number){
        int counter =0;
        while(number >=1){
            System.out.println(number);
            number--;
        }
    }
}
