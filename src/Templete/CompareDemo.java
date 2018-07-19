package Templete;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemo {
	
	public static void main(String[] args) {
		
		
		List<Person> persons=new ArrayList<Person>();
		
		Person p1=new Person(30, "vivek");
		Person p2=new Person(25, "gupta");
		persons.add(p1);
		persons.add(p2);
		
		Collections.sort(persons);
		
	}

}
