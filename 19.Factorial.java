import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial =1;
        System.out.println("Give a number:");
        int ans = Integer.parseInt(scanner.nextLine());
        for(int i =1; i<=ans; i++){
            factorial *= i;
        }
        if(factorial ==0){
            System.out.println("Factorial: 1");
        }else{
            System.out.println("Factorial: "+ factorial);
        }
    }
}
