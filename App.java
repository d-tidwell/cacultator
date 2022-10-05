import java.util.*;

public class App{

    static final Scanner inputScanner = new Scanner(System.in);
    
    private static String getString(String prompt) {
        // fill in the code
        System.out.println(prompt);
        String retrieved = inputScanner.next();
        return retrieved;
    }
    
    private static double getDouble(String prompt) {
        // gets double
        System.out.println(prompt);
        Double dbl = inputScanner.nextDouble();
        return dbl;
    }

    public static void main(String[] args){
        //conditional numeral
        int exitKey = 1;
        while(exitKey == 1){
            
            //make a new calculator object from class
            Calculator calc = new Calculator();
            
            //prompts
            String prompt = "Enter a Number";
            String prompt2 = "Enter a second Number";
            String picker = "Pick a Calculation \n"
                            + "1. Addition \n"
                            + "2. Subraction \n"
                            + "3. Multiplication \n"
                            + "4. Division \n";

            
            

            //call the double
            double num1 = getDouble(prompt);
            double num2 = getDouble(prompt2);
            String methodC = getString(picker);
            if(methodC.equals("1")){
                System.out.println("Added: " +calc.add(num1, num2));

            }
            if(methodC.equals("2")){
                System.out.println("Subtracted: " +calc.subtract(num1, num2));
                
            }
            if(methodC.equals("3")){
                System.out.println("Multiplied: " +calc.multiply(num1, num2));
            }
            if(methodC.equals("4")){
                if(num2 == 0){
                    System.out.println("Sorry, you cannot divide by zero, fool");
                }
                else{
                    System.out.println("Divided: " +calc.divide(num1, num2));
                }
            }
            
           
            //prompt the user again to continue
            String prompt3 = "Do you wish to continue? (Y/N)";
            String answer = getString(prompt3);

            //check the conditional values
            if(answer.equals("N") || answer.equals("n")){
                System.out.println("Goodbye");
                exitKey = 0;
            }else{
                continue;
            }

        }
        
       

    }
}