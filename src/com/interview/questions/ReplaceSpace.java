package com.interview.questions;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String spaceStr = sc.nextLine();
		String Output = replaceSpace(spaceStr.toCharArray(),spaceStr.length());
		System.out.println(Output);
	}
	public static String replaceSpace(char[] str,int len){
		
		int spaceCount = 0;
		for(int i=0;i<len;i++){
			if(str[i] == ' '){
				++spaceCount;
			}	
		}
		int newLength = len + spaceCount * 2 ;
		char[] str1 = new char[newLength];
		//str1[newLength] = '\0';
		for(int i=len-1;i>=0;i--){
			if(str[i] == ' '){
				str1[newLength-1] = '0';
				str1[newLength-2] = '2';
				str1[newLength-3] = '%';
				newLength = newLength -3;
			}else{
				str1[newLength-1] = str[i];
				newLength = newLength -1;
			}
		}
		String out = new String();
		out = String.valueOf(str1);
		return out;
		
	}
}
