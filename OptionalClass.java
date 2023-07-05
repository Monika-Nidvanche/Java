package com.demo1;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		String s[] = new String[2];
		
		//s[1]= "abc";
		
		Optional<String> optional = Optional.ofNullable(s[1]);
		
		if(optional.isPresent()) {
			System.out.println("Present");
		}
		else {
			System.out.println("not present");
		}

	}

}
