package Practice;

import java.util.Scanner;
public class scan_number {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text);
        
        //整数データを受け取る
        int number = scan.nextInt();
        System.out.println(number*10);
        System.out.println("おこづかい"+number+"円");
    }

}
