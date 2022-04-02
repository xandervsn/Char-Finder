package me.xandervsn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class TxtSort {
	
	String input;
	Scanner scanner = new Scanner(System.in);
	String path;
	String txt = "";
	char current;
	HashMap<Character, Integer> map = new HashMap<>();
	double chance = 0;
	double mole;
	double moleMole;

	public TxtSort() throws IOException {
			System.out.println(":3");
			input = scanner.nextLine();
			path = input + .txt";
			String txt = Files.readString(Paths.get(path));
			char[] text = new char[txt.length()];
			for (int i = 0; i < txt.length(); i++) {
				text[i] = txt.charAt(i);
			}
		
			for (int i = 32; i <= 122; i++) {
				if((i >= 35 && i <= 38) || (i == 42) || (i == 43) || (i == 60) || (i == 62) || (i >= 64 && i <= 90) || (i == 92) || (i >= 94 && i <= 96) || (i > 122)) {
				}else {
					map.put((char)i, 0);
				}
			}
		
			for (int i = 0; i < txt.length(); i++) {
				if(txt.charAt(i) >= (char)65 && txt.charAt(i) <= (char)90) {
					current = (char) (txt.charAt(i)+32);
				}else {
					current = txt.charAt(i);
				}
				if(map.containsKey(current)) {
					for(Character key : map.keySet()) {
						if(current == key) {
							map.put(key, map.get(key)+1);
						}
					}
				}
			}		

			System.out.println(input + ": " + txt.length());
			
			List<Integer> sortedMap = new ArrayList<>(map.values()); 
			Collections.sort(sortedMap);
			
			System.out.println(sortedMap);
		}
	
		
	public static void main(String[] args) throws Exception {
		new TxtSort();
	}

}
