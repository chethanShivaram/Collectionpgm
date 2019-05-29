package demo;
import java.util.*;
public class ComparableInterfaceEx
{
   public static void main(String[] args)
   {
	   ArrayList<Student> ar = new ArrayList<Student>();
	   ar.add(new Student("ABC", 101, 29));
	   ar.add(new Student("ZZZ", 105, 21));
	   ar.add(new Student("BCE", 103, 25));
	   
	   Collections.sort(ar);
	   for(Student st :ar)
	   {
		   System.out.println(st.name +" " +st.roll_no + " " + st.age + " ");
	   }
   }
}