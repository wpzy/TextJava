package text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextJava {
	public static void main(String[] args){
		getTokenByScan();
	}
	
	/*
	*simple java tokenizer
	**/
	public static void getTokenByScan(){
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner("hello world this is the test to test the function "
				+ "of scanner");
		List<String> result=new ArrayList<String>();
		while(scanner.hasNext()){
			result.add(scanner.next());
		}
		for(String a:result){
			System.out.println(a);
		}
		
	}

}
