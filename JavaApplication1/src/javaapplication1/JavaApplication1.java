
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author darko
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name ="Dar";
        int age = 15;
        String city ="Los Angeles";
        double iq =167.123;
        System.out.println("name="+" "+name +" "+"age="+" "+age+" "+"city="+" "+ city+" "+"iq="+" "+iq);

        System.out.println("wrtite the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number>0) {
            System.out.println(number);

        }else{
            System.out.println("Wrong input");
            }

    }
    
}
