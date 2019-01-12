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

        double Silver = 17;
        double Gold = 14450;
        double Iron = 195.5;
        
        double result = 0; 
        

        double [][] array = {{pish, tegj, glob, glob},{glob, prok, Silver},{glob, prok, Gold}, {glob, prok, Iron}}; //Input Initial Symbol Romawi
        

        String resultFalse  = "Error Input Romawi, Max repeated 3 times";
        String resultFalse2 = "Error Input Romawi, Can't Repeat symbol Romawi D / L / V ";
        String resultFalse3 = "Error Input Romawi, Symbol Romawi I only can be Subtracted V & X";
        String resultFalse4 = "Error Input Romawi, Symbol Romawi X only can be Subtracted L & C";
        for(int h = 0; h < array.length; h++) {
            for (int i = 0; i <= array[h].length-2; i++) {    
                int j = i + 1;
                
                //this condition can't repeated Symbol Romawi D / L / V
                if (array[h][i] == D || array[h][i] == L || array[h][i] == V) {
                    if (array[h][i] == array[h][j]) {
                        throw new ArithmeticException(resultFalse2);
                    }
                }
                //this condition return message error if symbol romawi  L / C / D / M subtracted I
                if (array[h][i] == I && (array[h][j] == L ||array[h][j] == C || array[h][j] == D || array[h][j] == M)) {
                    throw new ArithmeticException(resultFalse3);
                }
                //this condition return message error if symbol romawi V / D / M subtracted X
                if (array[h][i] == X && (array[h][j] == D || array[h][j] == M)) {
                    throw new ArithmeticException(resultFalse4);
                }
                
                if (i == array[h].length-2) {             //this condition for the last condition when comparing array values,  
                    if (array[h][i] < array[h][j]) {         //because if you do not use this function
                        result += array[h][j] - array[h][i]; //then when the condition value 1 is greater than value 2
                    } else if (array[h][i] > array[h][j]) {  //, the last value cannot be calculated
                        result += array[h][i] + array[h][j];
                    } else if (array[h][i] == array[h][j]) {
                        result += array[h][i] + array[h][j];
                    }
                //this condition when i greater than j
                } else if (array[h][i] > array[h][j]){
                    result += array[h][i];
                //this condition when i smaller than j
                } else if (array[h][i] < array[h][j]) {
                    result += array[h][j] - array[h][i];
                    i += 1;
                    //this condition when there is Silver / gold / iron || when calculating the last digit
                    if (i == array[h].length-2 ) {
                        if(array[h][i] < array[h][j+1] ) {
                            result = result * array[h][j+1] ;
                        }
                    }

                //this condition when i and j values are the same  
                } else if (array[h][i] == array[h][j]) {
                    //this condition for repeat is more than 3 times , output result msg error
                    if ((array[h].length-1 - i) == 4 || array[h].length == 4) {
                        if (array[h][i] == array[h][j] && array[h][i] == array[h][j+1] && array[h][i] == array[h][j+2]) {
                            throw new ArithmeticException(resultFalse);
                        }
                    }
                    result += array[h][i] + array[h][j];
                    i += 1;
                    if (i == array.length-2) {
                        if (array[h][i] < array[h][j+1]){
                            result *= array[h][j+1];
                        } else {
                        result += array[h][i];
                        }
                    }
                }
                       
            }
            //Output all result
            int resultFinal = (int) Math.round(result);
            switch(h) {
                case 0:
                    System.out.println("pish tegj glob glob is " + resultFinal + " Credits");
                    result = 0;
                break;
                case 1:
                    System.out.println("glob prok Silver is " + resultFinal + " Credits");
                    result = 0;
                break;
                case 2:
                    System.out.println("glob prok Gold is " + resultFinal + " Credits");
                    result = 0;
                break;
                case 3:
                    System.out.println("glob prok Iron is " + resultFinal + " Credits");
                    result = 0;
                break;
            }
                
        }         
    }
    
    public static void main(String[] args) {
        App gmtg = new App();
    }

}