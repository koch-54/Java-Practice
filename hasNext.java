package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class hasNext {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        
        while (sc.hasNextLine()){ //次の行に入力値があるとtrueを返す
            String data = sc.nextLine();
            array.add(data);
        }
        
        System.out.println(array.size());
        
        for(String str : array){
            System.out.println(str);
        }
       
    }
}
