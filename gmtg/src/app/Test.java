package app;
public class Test {
    public static void main(String[] args) {
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;

        int [] array = {M, M, M, X};
        int result = 0;
        int repeatTimes = 0;
        int valueRepeat = 0;
        String resultFalse = "Error Input Romawi , maximum repeat romawi 3 times";
        for (int i = 0; i <= array.length-2; i++) {
            int j = i + 1;              
            if (array[i] == 1 || array[i] == 10 || array[i] == 100 || array[i] == 1000) {
                valueRepeat = array[i];       
            }
            if (valueRepeat == array[j]) {
                if (repeatTimes >= 2) {
                    repeatTimes += 1;
                }  else repeatTimes += 2;
            }
            // if (array[j] == 1 || array[j] == 10 || array[j] == 100 || array[j] == 1000) {
            //     valueRepeat = array[j];
                
            // } 
            // if (valueRepeat == array[j]) {
            //     repeatTimes += 1;
            // } if (repeatTimes == 4) {
            //     System.out.println(resultFalse);
            //     i = array.length-1;
            // } 
            // if (i == array.length-2) {
            //     if (array[i] < array[j]) {
            //         result += array[j] - array[i];
            //     } else if (array[i] > array[j]) {
            //         result += array[i] + array[j];
            //     }
            // } else if (array[i] > array[j]){
            //     result += array[i];
            // } else if (array[i] < array [j]) {
            //     result += array[j] - array[i];
            //     i += 1;  
            // } else if (array[i] == array[j]) {
            //     result += array[i] + array[j];
            //     i += 1;
            // } 
        }
        System.out.println(result);
        System.out.println(repeatTimes);
    }
  }