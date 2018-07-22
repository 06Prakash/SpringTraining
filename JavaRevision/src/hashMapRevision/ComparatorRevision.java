package hashMapRevision;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class ReverseAlphabeticalOrder implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return -str1.compareTo(str2);
	}

}

public class ComparatorRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<String>();
		l.add("cat");
		l.add("rat");
		l.add("eat");
		l.add("pat");
		l.add("sat");
		l.add("vat");
		l.add("bat");
		Collections.sort(l, new ReverseAlphabeticalOrder());
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		for (String s : l) {
//			System.out.println(s);
//		}
	}

}
