package comparator;
import java.util.*;

public class ComparatorInterfaceEx {
	public static void main(String args[])
	{
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1("Awarna", 101, 25));
		al.add(new Student1 ("Santosh", 110,24));
		al.add(new Student1("Naveen", 105, 26));
		al.add(new Student1("Rahul", 103, 22));
		
		System.out.println("Sorting by Name");
		Collections.sort(al,new NameComparator());
		for(Student1 st: al)
		{
			System.out.println(st.name + " " + st.roll_no+ " " + st.age);
		}
		System.out.println();
		
		System.out.println("Sorting by Roll_no");
		Collections.sort(al,new Roll_noComparator());
		for(Student1 st2: al)
		{
			System.out.println(st2.name + " " + st2.roll_no+ " " + st2.age);
		}
		System.out.println();
		
		System.out.println("Sorting by Age");
		Collections.sort(al,new AgeComparator());
		for(Student1 st1: al)
		{
			System.out.println(st1.name + " " + st1.roll_no+ " " + st1.age);
		}
		System.out.println();
		
		
		
	}

}
