package com.yash.tdddemos1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnimal {
	
	public static void checkAnimal(String s) {
		String[] words = s.split("[[ ]*|[//.]]");
		System.out.println(Arrays.toString(words));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		checkAnimal(s);
	}

}
