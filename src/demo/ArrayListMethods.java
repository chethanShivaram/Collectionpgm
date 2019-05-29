package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethods
{
	public static void main(String[] args)
	{
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(null);
      list.add(40);      
      list.add(30);
      list.add(20);
      list.add(10);
      list.add(null);
      System.out.println(list);
      System.out.println(list.subList(0, 2));
      Collections.swap(list, 0, 2);
      System.out.println(list);
      list.clear();
      ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone(); 
      Iterator iter =list1.iterator();
      while (iter.hasNext())
      {
         System.out.println(iter.next());
	  }
    }
}