package pgmoncollection;
import java.util.*;
public class TreeMapEx 
{
	public static void main(String args[]) 
	{
	      TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();

	      tmap.put(1, "Data1");
	      tmap.put(23, "Data2");
	      tmap.put(70, "Data3");
	      tmap.put(4, "Data4");
	      tmap.put(2, "Data5");

	      Set set = tmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " Value is: " + mentry.getValue());
	         System.out.println();
	      }

	   }
	}
