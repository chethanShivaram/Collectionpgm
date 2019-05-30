package comparator;
import java.util.*;

public class Roll_noComparator implements Comparator
{
	 public int compare(Object o1, Object o2)
	 {
		 Student1 s1= (Student1) o1;
		 Student1 s2= (Student1) o2; 
		 
		 if(s1.roll_no==s2.roll_no)
			 return 0;
		 else if(s1.roll_no>s2.roll_no)
			 return 1;
		 else 
			 return -1;
	 }
}
