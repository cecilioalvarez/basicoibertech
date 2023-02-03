package com.arquitecturajava;

public class Principal16 {

	public static void main(String[] args) {

		
		int[][] matriz= new int[][] { new int[] {2,3},new int[] {1,4}};
		
		for (int i=0;i<matriz.length;i++) {
			
			for (int j=0; j<matriz[i].length;j++) {
				
				System.out.println(matriz[i][j]);
			}
		}
		
	}
	

}
