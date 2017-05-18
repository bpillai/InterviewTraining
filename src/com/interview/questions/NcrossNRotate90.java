package com.interview.questions;

public class NcrossNRotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{5,6,7},{9,10,11}};
		int l = matrix.length;
		//print the matrix here 
		System.out.println("before rotating");
				for(int i=0;i<l;i++){
					for(int j=0;j<matrix[0].length;j++){
						System.out.print(matrix[i][j] + ",");
					}
				}
		
		int[][] output = rotate90(matrix,l);
		//print the matrix here 
		System.out.println("after rotating");
		for(int i=0;i<l;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j] + ",");
			}
		}
		
	}
	public static int[][] rotate90(int[][] matrix, int l){
		
			for(int i=0;i<l/2;i++){
				for(int j=i;j<l-i-1;j++){
					int t=matrix[i][j];
					matrix[i][j]=matrix[j][l-i-1];
					matrix[j][l-i-1]=matrix[l-i-1][l-j-1];
					matrix[l-i-1][l-j-1]=matrix[l-j-1][i];
					matrix[l-j-1][i]=t;
				}
			}
			return matrix;
	}
}
