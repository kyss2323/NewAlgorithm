package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringHandle_1032 {
	public static String doFunction() {
		String targetStr = null;
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		List<String> strList = new ArrayList<>();
		for(int i = 0;i<testCase;i++) {
			strList.add(sc.next());
		}
		
		
		targetStr = strList.get(0);
		for(int i=1;i<testCase;i++) {
			String saveStr = "";
			String compareStr = strList.get(i);
			for(int k=0;k<targetStr.length();k++) {
				char targetChar = targetStr.charAt(k);
				char compareChar = compareStr.charAt(k);
				
				if(targetChar == '?')
					saveStr += '?';
				else if(targetChar == compareChar)
					saveStr += targetChar;
				else 
					saveStr += '?';
			}
			targetStr = saveStr;
		}
		
		return targetStr;
	}

}
