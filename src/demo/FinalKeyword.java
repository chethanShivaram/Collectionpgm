package demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class FinalKeyword
{
	public static void main(String[] args)
	{
       final ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(10);
      list.add(40);      
      list.add(30);
      list.add(20);
      list.add(10);
      list.add(10);
      list.add(40);      
      list.add(30);
      list.add(20);
      list.add(10);
      list.add(50);
      list.add(30);
      list.add(20);
      list.add(10);
      list.add(50);
      System.out.println(list);
      
      list = new ArrayList<Integer>();
     
	  }
}