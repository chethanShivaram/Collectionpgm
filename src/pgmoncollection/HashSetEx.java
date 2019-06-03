package pgmoncollection;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		
		hs.add(1);
		hs.add(2);
		hs.add(1);
		System.out.println(hs);
	
}
}