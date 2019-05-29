package demo;
import java.util.*;

public class HashMapSort
{
	   public static void main(String args[])
	   {
	     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
         hmap.put(12, "Chaitanya");
         hmap.put(2, "Rahul");
         hmap.put(7, "Singh");
         hmap.put(49, "Ajeet");
         hmap.put(3, "Anuj");
         
         Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
         Set set1 = map.entrySet();
         Iterator it = set1.iterator();
         while(it.hasNext())
         {
        	 Map.Entry me = (Map.Entry)it.next();
        	 System.out.println("key " + me.getKey() + " Value " + me.getValue());
         }    
      }
}