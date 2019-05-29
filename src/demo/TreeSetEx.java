package demo;

import java.util.TreeSet;

public class TreeSetEx 
{
	    public static void main(String[] args)
	    {
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("A");
		tset.add("B");
		tset.add(null);
		System.out.println(tset);
	  }
}