package avs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class AnalPlays {
	
	String input;
	Scanner scanner = new Scanner(System.in);
	String path;
	String txt = "";
	char current;
	HashMap<Character, Integer> map = new HashMap<>();
	double chance = 0;
	double mole;
	double moleMole;

	public AnalPlays() throws IOException {
		/*for(int a = 1; a <= 18; a++) {
			switch (a) {
            case 1:  input = "a-midsummer-nights-dream";
                     break;
            case 2:  input = "antony-and-cleopatra";
                     break;
            case 3:  input = "as-you-like-it";
                     break;
            case 4:  input = "henry-iv-i";
                     break;
            case 5:  input = "henry-v";
                     break;
            case 6:  input = "henry-iv-ii";
                     break;
            case 7:  input = "julius-caeser";
                     break;
            case 8:  input = "king-john";
                     break;
            case 9:  input = "king-lear";
                     break;
            case 10: input = "macbeth";
                     break;
            case 11: input = "much-ado-about-nothing";
                     break;
            case 12: input = "othello";
                     break;
            case 13: input = "richard-ii";
            		break;
            case 14: input = "richard-iii";
            		break;
            case 15: input = "romeo-and-juliet";
            		break;
            case 16: input = "the-taming-of-the-shrew";
            		break;
            case 17: input = "the-tempest";
            		break;
            case 18: input = "twelfth-night";
            		break;
        }
		 */
			System.out.println(":3");
			input = scanner.nextLine();
			path = "C:\\Users\\stefa\\eclipse-workspace\\References\\Plays\\" + input + "_TXT_FolgerShakespeare.txt";
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
		
	//}
		
	public static void main(String[] args) throws Exception {
		new AnalPlays();
	}

}
