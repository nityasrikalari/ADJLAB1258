package pac;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> stlist = new ArrayList <String>();
		stlist.add("Jungkook");
		stlist.add("Taehyung");
		System.out.println(stlist);
		System.out.println(stlist.size());
		stlist.add(1,"Jimin");
		System.out.println(stlist);
		stlist.set(2,"Jin");
		System.out.println(stlist);
		System.out.println(stlist.indexOf("Jin"));
		System.out.println(stlist.indexOf("Taehyung"));
		String s = stlist.get(1);
		System.out.println(s);
		System.out.println(stlist.contains("Jungkook"));
		//stlist.remove(2);
		//stlist.remove("Jimin");
		System.out.println(stlist);
		
		for(String str:stlist) {
			System.out.println(str);
		}
		
		Collections.sort(stlist);
		System.out.println(stlist);
		//l1.equals(l2) used to find if both the lists have same elements
		//l1.containsAll(l2) to find if it l2 is subset of l1 
	}

}
