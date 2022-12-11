package Practice;

import java.util.Scanner;

public class split {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        System.out.println(data);
        
        String[] array = data.split(",");
        System.out.println(array[1]);
        System.out.println(array.length);
        
        for(String enemy : array){
            System.out.println(enemy + "が現れた");
        }
    }
}
