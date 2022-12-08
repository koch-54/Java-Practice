package Practice;

import java.util.Scanner;

public class equals {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        
        //文字列が等しいかをみるのはequals()をつかう
        if(name.equals("java")){
            System.out.println("Welcome");
        } else if(name.equals("JAVA")){
            System.out.println("Good morning");
        } else{
            System.out.println("Goodbye");
        }
    }	
}
