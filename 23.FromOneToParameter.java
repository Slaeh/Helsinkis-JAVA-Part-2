import java.util.Scanner;
public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = Integer.parseInt(reader.nextLine());
        printUntilNumber(i);
    }
    public static void printUntilNumber(int number){
        for(int i=1; i<=number;i++){
            System.out.println(i);
        }
    }
}
