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

        int [] array = {M, M, M, M, I, V}; //Input Symbol Romawi
        
        int result = 0; // the result of all Roman numerals
        String resultFalse = "Error Input Romawi , Max repeated 3 times";
        for (int i = 0; i <= array.length-2; i++) {    
            int j = i + 1;
            if (i == array.length-2) {             //this condition for the last condition when comparing array values,  
                if (array[i] < array[j]) {         //because if you do not use this function
                    result += array[j] - array[i]; //then when the condition value 1 is greater than value 2
                } else if (array[i] > array[j]) {  //, the last value cannot be calculated
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
            System.out.println(result);         
        }
    }

    
    
    public static void main(String[] args) {
        App gmtg = new App();
    }

}