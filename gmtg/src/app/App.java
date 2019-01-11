package app;
import java.io.Console;
import java.io.FileReader;


public class App {

    public App(){
        // Declare Symbol Romawi to Value
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        double glob = I;
        double prok = V;
        double pish = X;
        double tegj = L;

        double silver = 17;
        double gold = 14450;
        double iron = 195.5;
        
        double result = 0; 
        

        double [] array = {glob, prok, iron}; //Input Initial Symbol Romawi


        String resultFalse  = "Error Input Romawi, Max repeated 3 times";
        String resultFalse2 = "Error Input Romawi, Can't Repeat symbol Romawi D / L / V ";
        String resultFalse3 = "Error Input Romawi, Symbol Romawi I only can be Subtracted V & X";
        String resultFalse4 = "Error Input Romawi, Symbol Romawi X only can be Subtracted L & C";
        for (int i = 0; i <= array.length-2; i++) {    
            int j = i + 1;
            
            //this condition can't repeated Symbol Romawi D / L / V
            if (array[i] == D || array[i] == L || array[i] == V) {
                if (array[i] == array[j]) {
                    throw new ArithmeticException(resultFalse2);
                }
            }
            //this condition return message error if symbol romawi  L / C / D / M subtracted I
            if (array[i] == I && (array[j] == L ||array[j] == C || array[j] == D || array[j] == M)) {
                throw new ArithmeticException(resultFalse3);
            }
            //this condition return message error if symbol romawi V / D / M subtracted X
            if (array[i] == X && (array[j] == D || array[j] == M)) {
                throw new ArithmeticException(resultFalse4);
            }
            
            if (i == array.length-2) {             //this condition for the last condition when comparing array values,  
                if (array[i] < array[j]) {         //because if you do not use this function
                    result += array[j] - array[i]; //then when the condition value 1 is greater than value 2
                } else if (array[i] > array[j]) {  //, the last value cannot be calculated
                    result += array[i] + array[j];
                } else if (array[i] == array[j]) {
                    result += array[i] + array[j];
                }
            //this condition when i greater than j
            } else if (array[i] > array[j]){
                result += array[i];
            //this condition when i smaller than j
            } else if (array[i] < array [j]) {
                result += array[j] - array[i];
                i += 1;
                //this condition when there is Silver / gold / iron || when calculating the last digit
                if (i == array.length-2 ) {
                    if(array[i] < array[j+1] ) {
                        result = result * array[j+1] ;
                    }
                }

             //this condition when i and j values are the same  
            } else if (array[i] == array[j]) {
                //this condition for repeat is more than 3 times , output result msg error
                if ((array.length-1 - i) == 4 || array.length == 4) {
                    if (array[i] == array[j] && array[i] == array[j+1] && array[i] == array[j+2]) {
                        throw new ArithmeticException(resultFalse);
                    }
                }
                result += array[i] + array[j];
                i += 1;
                if (i == array.length-2) {
                    if (array[i] < array[j+1]){
                        result *= array[j+1];
                    } else {
                    result += array[i];
                    }
                }
            }              
        }    
        int resultFinal = (int) Math.round(result);
        System.out.println(resultFinal);      
    }
    
    public static void main(String[] args) {
        App gmtg = new App();
    }

}