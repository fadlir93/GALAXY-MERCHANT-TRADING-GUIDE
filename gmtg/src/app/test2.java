package app;
import java.lang.reflect.Field;
import java.util.Scanner;

public class test2 {
    public String variable1 ="purple";
     public int I = 1;
     public int V = 5;
     
    /**
     * @param args
     */
    static Scanner getin = new Scanner (System.in);
    public static void main(String[] args) throws Exception{
        
        int V = 5;

        test2 s1 = new test2();
        // //Field[]  f1 = s1.getClass().getDeclaredFields();
        // Field f1 = s1.getClass().getField("variable1");      
        // System.out.println(f1.get(s1)); // this prints purple
        // System.out.println(f2.get(s1)); 


        
        System.out.print("Enter your name's Initials:" );  
        String Name = getin.nextLine();
        char[] stringToCharArray = Name.toCharArray();
        int result = 0;

        for(int i = 0; i < stringToCharArray.length; i++){
            String s = String.valueOf(stringToCharArray[i]);
            Field f2 = s1.getClass().getField(s);
            int f3 = (int)f2.get(s1) ;
            if (f3 == V){
                System.out.println("Benar");
            }
            result += f3 ;
        }
        System.out.println(result);
        
            


        // for (char output : stringToCharArray){
        //     String s = String.valueOf(output);
        //     Field f2 = s1.getClass().getField(s);

        //     System.out.println(f2.get(s1));
        // }
    }
  }