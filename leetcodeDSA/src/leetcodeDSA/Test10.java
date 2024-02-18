package leetcodeDSA;

import java.util.ArrayList;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		String s="CLVII";
		
		String reg="C|M|D|L|X|V|I";
		int n=0;
		List<Character> l1= new ArrayList<>();
		List<String> li = new ArrayList<>();
		
		int counter=0;
		for (int i=0; i<s.length();i++) {
			if(s.contains(reg)) {
			if(s.charAt(i-1)==s.charAt(i)) {
			counter++;
			if(counter<3) {
			l1.add(s.charAt(i));
			}
//			else return 0;
			}
			if(s.charAt(i-1)!=s.charAt(i))
				l1.add(s.charAt(i));
			
		}
//			else return 0;
		}
		
		System.out.println(l1.toString());
		
		
		

	}

}
