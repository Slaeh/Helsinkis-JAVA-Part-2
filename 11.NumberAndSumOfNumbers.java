import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        int sum=0;
        int counter =0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number: ");
            int i = Integer.parseInt(scanner.nextLine());
            if(i==0){
                break;
            }else{
                sum += i;
                counter++;
            }
        }
        System.out.println("Number of numbers: "+ counter);
        System.out.println("Sum of the numbers: "+ sum);
    }
}
