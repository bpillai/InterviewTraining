package com.interview.questions;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Output = removeDuplicates(sc.nextLine());
		System.out.println(Output);
		
	}
/*	public static String removeDuplicates(String input){
		boolean[] hit = new boolean[256];
		char[] str = input.toCharArray();
		int len = input.length();
		int tail = 0;
		for(int i=0;i<len;i++){
			if(!hit[str[i]]){
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
			else{
				str[tail]=0;
				++tail;

			}
			
		}
		String out = new String();
		out = String.valueOf(str);
		return out; 
	
	}*/
	public static String removeDuplicates(String input){
		char[] str = input.toCharArray();
		int len = input.length();
		for(int i=0;i<len;i++){
			int j=i+1;
			
			for(;j<len;j++){
				if(str[i] == str[j]){
					str[j] = 0;
				}
			}
			
		}
		
		String out = new String();
		out = String.valueOf(str);
		return out;
			}	
}
