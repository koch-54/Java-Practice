package Practice;
//標準入力を受け取って出力する
import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		System.out.println(text);
	}
}