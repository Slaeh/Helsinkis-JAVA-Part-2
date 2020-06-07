
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int counter =0;
        double average =0;
        while(true){
            System.out.println("Give a number: ");
            int i = Integer.parseInt(scanner.nextLine());
            if(i<0 || i >0){
                sum += i;
                counter++;
            }else if(i==0){
                break;
            }
        }
        average = (double)sum/counter;
        System.out.println("Average of the numbers: "+ average );

    }
}
