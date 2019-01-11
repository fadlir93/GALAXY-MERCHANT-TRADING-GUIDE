package app;

import java.lang.reflect.Field;
import java.util.Scanner;


public class App {
    static Scanner getin = new Scanner (System.in);
    
    
    
    public App(){

        App input = new App();

        // Declare Symbol Romawi to Value
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        System.out.print("Enter your name's Initials:" );  
        String Name = getin.nextLine();
        char[] array = Name.toCharArray();
        
        int result = 0; // the result of all Roman numerals
        String resultFalse  = "Error Input Romawi , Max repeated 3 times";
        String resultFalse2 = "Error Input Romawi, Can't Repeat symbol Romawi D / L / V ";
        String resultFalse3 = "Error Input Romawi, Symbol Romawi I only can be Subtracted V & X";
        String resultFalse4 = "Error Input Romawi, Symbol Romawi X only can be Subtracted L & C";
        for (int i = 0; i <= array.length-2; i++) {    
            int j = i + 1;
            String Si = String.valueOf(array[i]);
            String Sj = String.valueOf(array[j]);
            Field SiI = input.getClass().getField(Si);
            Field SjJ = input.getClass().getField(Sj);
            int finalI = (int)SiI.get(input);
            int finalJ = (int)SjJ.get(input);
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
            } else if (array[i] > array[j]){
                result += array[i];
            } else if (array[i] < array [j]) {
                result += array[j] - array[i];
                i += 1;
             //ths condition when i and j values are the same  
            } else if (array[i] == array[j]) {
                //this condition for repeat is more than 3 times , output result msg error
                if ((array.length-1 - i) == 4) {
                    if (array[i] == array[j] && array[i] == array[j+1] && array[i] == array[j+2]) {
                        throw new ArithmeticException(resultFalse);
                    }
                }
                result += array[i] + array[j];
                i += 1;
                if (i == array.length-2 ) {
                    result += array[j];
                }
            }       
                
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        App gmtg = new App();
    }

}