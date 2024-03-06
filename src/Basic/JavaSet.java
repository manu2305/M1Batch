package Basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {
public static void main(String[] args) {
	HashSet<String> s=new HashSet();
	s.add("Prince");
	s.add("ravi");
	s.add("kartik");
	s.add("sugandh");
	s.add("Prince");
	System.out.println(s);
	Iterator ref = s.iterator();
	for (String string : s) {
		ref.next();	
	}
	
}
}
