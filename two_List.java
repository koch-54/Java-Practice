package Practice;

public class two_List {
	public static void main(String[] args) {
        String[] teamA = {"勇者", "戦士", "魔法使い"};
        String[] teamB = {"勇者", "戦士", "魔法使い"};
        String[] teamC = {"盗賊", "忍者", "商人"};
        String[] teamD = {"スライム", "ドラゴン", "魔王"};
        
        String[][] team_multi = {teamA , teamC, teamD}; //二次元配列の作成
        System.out.println(team_multi[2][0] + ",");
        System.out.println(team_multi[2][1] + ",");
        System.out.println(team_multi[2][2]);

    }
}
