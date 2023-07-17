package com.demo1;

import java.util.regex.Pattern;

public class Regex {

	public static void main(String args[]) {
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9123456789"));
		System.out.println(Pattern.matches("[789][0-9]{10}", "99853038949"));

		System.out.println(Pattern.matches("[a-d[m-p]]{4}", "abmn"));
		System.out.println(Pattern.matches("[a-d]", "a"));
		System.out.println(Pattern.matches("[a-z&&[def]]{6}", "edddff"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]{2}", "ak"));

	}

}
