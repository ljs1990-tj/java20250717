package day12;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word = s.next();
		for(int i=0; i<word.length(); i++) {
			String first = word.substring(0, 1);
			String last = word.substring(1);
			word = last + first;
			System.out.println(word);
			
		}
	}
}
