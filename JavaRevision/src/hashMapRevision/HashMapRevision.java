package hashMapRevision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Person {
	private int id;
	private String name;
	Person() {}
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "(Person [id=" + id + ", name=" + name + "])\n";
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class HashMapRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new LinkedHashMap<Integer, String>();
		Map<Person, Integer> map3 = new HashMap<Person, Integer>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "four");
		for (Map.Entry<Integer, String> entity : map1.entrySet()) {
			System.out.println("key:" + entity.getKey() + "\nvalue :" + entity.getValue());
			System.out.println("");
		}
		Person p1 = new Person(1, "Ram");
		Person p2 = new Person(2, "kumar");
		map3.put(p1, 1);
		map3.put(p2, 2);
		
		for(Person key : map3.keySet()) {
			System.out.println(key.toString());
		}
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		Set<String> set4 = new LinkedHashSet<String>();
		Set<Integer> set3 = new TreeSet<Integer>();
		set3 = map1.keySet();
		set4.addAll(map1.values());
		set1.add(5);
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(7);
		set1.add(2);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(6);
		set2.add(9);
		set1.retainAll(set2);
		for (Integer i : set1) {
			System.out.println(i);
		}
		for (Integer j : set3) {
			System.out.println(j);
		}
		for (String j : set4) {
			System.out.println(j);
		}
	}

}
