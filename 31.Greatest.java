public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int []newArray = new int[3];
        newArray[0] = number1;
        newArray[1] = number2;
        newArray[2] = number3;

        int greatest = number1;
        for(int i=0; i <newArray.length; i++){
            if(newArray[i] > greatest){
                greatest = newArray[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(5, 9, 45);
        System.out.println("Greatest: " + result);
    }
}
