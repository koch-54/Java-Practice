package Practice;

public class woldMap {
	 public static void main(String[] args) {
	        
	        
	        String[][] worldMap = new String[10][20]; //10X20の文字列配列作成
	        
	        worldMap[0][0] = "城";
	        worldMap[0][19] = "町";
	        worldMap[9][19] = "町";
	        
	        
	        for(int i=0; i<worldMap.length; i++){
	            for(int j=0; j<worldMap[i].length; j++){
	                if(worldMap[i][j] == null){ //値がないとき（nullのとき）そこに森を入れる
	                	if(i % 2 == 0 || j % 3 == 0 || j == 19) {
	                		worldMap[i][j] = "＋";
	                	} else {
	                		worldMap[i][j] = "森";
	                	}
	                    
	                }
	                System.out.print(worldMap[i][j]);
	            }
	            System.out.println("");
	        }

	    }
	}
