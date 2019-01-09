package app;
import java.util.Scanner;


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

        int [] array = {V, C}; //Input Symbol Romawi
        
        int result = 0; // the result of all Roman numerals
        String resultFalse = "Error Input Romawi , Max repeated 3 times";
        String resultFalse2 = "Error Input Romawi, Can't Repeat symbol Romawi D / L / V ";
        String resultFalse3 = "Error Input Romawi, Symbol Romawi I only can be Subtracted V & X";
        String resultFalse4 = "Error Input Romawi, Symbol Romawi X only can be Subtracted L & C";
        for (int i = 0; i <= array.length-2; i++) {    
            int j = i + 1;
            int repeat2 = i + 1 , repeat3 = i + 2, repeat4 = i + 3;   //create variables for repeated of values
            //this condition for repeat is more than 3 times
            if (array[i] == I || array[i] == X || array[i] == C || array[i] == M) { 
               if (array[i] == array[repeat2] && array[repeat2] == array[repeat3] && array[repeat3] == array[repeat4]) {
                   System.out.println(resultFalse);
                   break;
               }        
            }
            //this condition can't repeated Symbol Romawi D / L / V
            if (array[i] == D || array[i] == L || array[i] == V) {
                if (array[i] == array[j]) {
                    System.out.println(resultFalse2);
                    break;
                }
            }
            //this condition return message error if symbol romawi  L / C / D / M subtracted I
            if (array[i] == I && (array[j] == L ||array[j] == C || array[j] == D || array[j] == M)) {
                System.out.println(resultFalse3);
                break;
            }
            //this condition return message error if symbol romawi V / D / M subtracted X
            if (array[i] == X && (array[j] == D || array[j] == M)) {
                System.out.println(resultFalse4);
                break;
            }
            if (i == array.length-2) {             //this condition for the last condition when comparing array values,  
                if (array[i] < array[j]) {         //because if you do not use this function
                    result += array[j] - array[i]; //then when the condition value 1 is greater than value 2
                } else if (array[i] > array[j]) {  //, the last value cannot be calculated
                    result += array[i] + array[j];
                } else if (array[i] == array[j]) {
                    result += array[i] + array[j];
                }
            } else if (array[i] > array[j]){
                result += array[i];
            } else if (array[i] < array [j]) {
                result += array[j] - array[i];
                i += 1;  
            } else if (array[i] == array[j]) {
                result += array[i] + array[j];
                i += 1;
            }       
                
        }
        System.out.println(result);
    }

    
    
    public static void main(String[] args) {
        App gmtg = new App();
    }

}