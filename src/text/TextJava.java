package text;

import java.util.Scanner;

public class TextJava {
	public static void main(String[] args){
		System.out.println("hello world");
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		System.out.println("line"+line);
		char a =line.charAt(0);
		if(java.lang.Character.isWhitespace(a) ){
			System.out.println("yes");
		}
	}

}
