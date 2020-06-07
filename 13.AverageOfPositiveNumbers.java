import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        int sum =0;
        double average =0.0;
        while(true){
            int i = Integer.parseInt(scanner.nextLine());
            if(i >0){
                counter++;
                sum+=i;
            }else if(i ==0){
                break;
            }else{
                continue;
            }
        }
        average = (double)sum/counter;
        if(sum ==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(average);
        }
    }
}
