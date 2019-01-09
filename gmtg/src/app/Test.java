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

        int [] array = {I, I, I, I};
        int result = 0;
        int repeatTimes = 0;
        int valueRepeat = 0;
        String resultFalse = "Error Input Romawi , maximum repeat romawi 3 times";
        for (int i = 0; i <= array.length-2; i++) {
            int j = i + 1;              
            if (array[i] == array[j] && array[i] == array[j+1] && array[i] == array[j+2]) {
                throw new ArithmeticException(resultFalse);
            }
             
        }
        System.out.println(result);
    }
  }