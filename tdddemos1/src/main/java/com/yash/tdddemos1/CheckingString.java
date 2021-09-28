package com.yash.tdddemos1;

import java.util.Arrays;
import java.util.Scanner;

public class CheckingString {
	public static void splitString(String s) {
		String[] numbers = s.split("[0-9]");
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void splitNumbers(String s) {
		String[] numbers = s.split("one|two|three|four|five|six|seven|eight|nine|ten");
		System.out.println(Arrays.toString(numbers));
	}
	
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		splitNumbers(s);
	}
}
