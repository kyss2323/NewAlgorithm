package etc;
import java.util.*;
public class StringHandle_1157 {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String target = sc.nextLine();
		
		sc.close();
		
		HashMap<Character, Integer> h = new HashMap<>();
		
		for(int i=0;i<target.length();i++) {
			char alpha = target.charAt(i);
			alpha = Character.toUpperCase(alpha);
			
			if(h.containsKey(alpha)) {
				h.put(alpha, (int) h.get(alpha) + 1);
			} else {
				h.put(alpha, 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		Character answer = '!';

		Set entry = h.entrySet();
		Iterator it = entry.iterator();
		
		while(it.hasNext()) {
			Map.Entry en = (Map.Entry) it.next();
			if(max < (int) en.getValue()) {
				max = (int)en.getValue();
				answer = (char)en.getKey();
			} else if(max == (int) en.getValue()) {
				answer = '?';
			}
		}
		if(answer != '!')
			System.out.println(answer);
	}
}
