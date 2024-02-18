package leetcodeDSA;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		String s="42646546ery";
		if(s==null) {
//			return 0;
		}else {
		int newint=0;
		
		s=s.replaceAll("\s", "");
//		System.out.println(s);
		int a=s.indexOf("[^0-9+-]");
		s=s.substring(0, a);
		
			newint= newint+ Integer.parseInt(s);
		
		
		}
		
	}

}
