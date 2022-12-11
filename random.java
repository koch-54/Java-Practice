package Practice;

import java.util.Scanner;

public class random {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] array = data.split(",");

        for (String enemy : array) {
            System.out.println(enemy + "が現れた");
        }
        
        //ランダムな数の範囲を調べる
        int num = array.length;
        System.out.println("敵は" + num + "匹");
        
        //ランダムな数の生成
        double rand = Math.random() * num;
        int attack = (int)rand;
        
        System.out.println(array[attack] + "に会心の一撃" + array[attack] + "を倒した");
    }
}
