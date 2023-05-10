package test.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMain2<T>{
    public static void main(String[] args){
        List<Integer> num = new ArrayList<>();
		int a = 0;
		int [] game = new int[6];

        for (int i = 1; i <= 6; i++){
        	
            for(int i1 = 1; i1 <= 45; i1++){
				num.add(i1);
            }
            
            for(int i2 = 0; i2 < game.length; i2++){
        		for(int j = 0; j < game.length; j++){
            	int b = (int)(Math.random() * num.size());
            	
            	if (i2 == j) {}
            	else if (num.get(j).equals(num.get(i2))) {
                        num.remove(j);
            	}
            	
            	game[i2] = num.get(b);
            	num.remove(b);
        		}
            }

            System.out.print("추첨 번호 : ");

            for(int i3 = 0; i3 < game.length; i3++){
    			for(int j = i3 + 1; j< game.length; j++){
    				if(game[i3] > game[j]){
    					a = game[i3];
    					game[i3] = game[j];
    					game[j] = a;
    				}
    			}
    	        System.out.print(String.format("%02", game[i3]) + " ");
            }
            System.out.println("");
        }
        
        System.out.println("===============");
        System.out.println("다음은 당첨 번호입니다.");
        System.out.println("===============");
        
        /*
             for (int i = 0; i < dataList.size(); i++) {
             	for (int j = 0; j < dataList.size(); j++) {
                	if (i == j) {
                 	} else if (dataList.get(j).equals(dataList.get(i))) {
                    dataList.remove(j);
                 	}
             	}
             }
        */
        
        for(int i1 = 1; i1 <= 45; i1++){
			num.add(i1);
        }
        
        for(int i2 = 0; i2 < game.length; i2++){
        	for (int j = 0; j < game.length; j++) {
        	int b = (int)(Math.random() * num.size());
        	
        	if (i2 == j) {}
        	else if (num.get(j).equals(num.get(i2))) {
                    num.remove(j);
        	}
        	
        	game[i2] = num.get(b);
        	num.remove(b);
        	}
        }

        System.out.print("당첨 번호 : ");

        for(int i3 = 0; i3 < game.length; i3++){
    		for(int j = i3 + 1; j < game.length; j++){
    			if(game[i3] > game[j]){
    				a = game[i3];
    				game[i3] = game[j];
    				game[j] = a;
    			}
    		}
    	    System.out.print(String.format("%02d", game[i3]) + " ");
        }
        System.out.println("");
    }
}