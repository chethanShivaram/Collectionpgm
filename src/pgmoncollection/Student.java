package pgmoncollection;

public class Student implements Comparable<Student>
{
  String name;
  int roll_no;
  int age;
  
  Student(String name, int roll_no, int age)
  {
	  this.name=name;
	  this.roll_no= roll_no;
	  this.age=age;
  }
  
  /*public int compareTo(Student st)
  {
	  if(roll_no==st.roll_no)
		  return 0;
	  else if(roll_no>st.roll_no)
		  return 1;
	  else 
		  return -1;
  }*/
  
  public int compareTo(Student st)
  {
	
		  return this.name.compareTo(st.name);
  }
}