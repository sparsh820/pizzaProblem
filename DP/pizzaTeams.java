package DP;

import java.util.ArrayList;

public class pizzaTeams {
	
	static int T2=1;
	static int T3=2;
	static int T4=1;
	ArrayList<Integer>ans=new ArrayList<>();
	public static void main(String[] args) {
		
		Teams(5,new int[]{2,3,4},new ArrayList<Integer>());
		
		
	}
	private static void Teams(int pizzas, int[] nom, ArrayList<Integer> finalans) {
		
		if(pizzas==0) {
			
			System.out.println(finalans);
			return;
			
		}
		
		if(pizzas<0) {
			return;
		}
		
		if(T2!=0) {
			
			T2--;
			finalans.add(nom[0]);
			Teams(pizzas-nom[0], nom, finalans);
			finalans.remove(nom[0]);
			T2++;
			
		}
		
		
        if(T3!=0) {
			
			T3--;
			finalans.add(nom[1]);
			Teams(pizzas-nom[1], nom, finalans);
			finalans.remove(nom[1]);
			T3++;
			
		}
        
        if(T4!=0) {
			
			T4--;
			finalans.add(nom[2]);
			Teams(pizzas-nom[2], nom, finalans);
			finalans.remove(nom[2]);
			T4++;
			
		}
        
        
        
        
		
		
	}
	
	
	

}
