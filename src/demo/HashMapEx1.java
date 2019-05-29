package demo;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapEx1 
{
   public static void main(String args[])
   {
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(12, "Chaitanya");
      hmap.put(2, "Rahul");
      hmap.put(7, "Singh");
      hmap.put(49, "Ajeet");
      hmap.put(3, "Anuj");
      System.out.println(hmap);

      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
      Map.Entry mentry = (Map.Entry)iterator.next();
      System.out.print("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue());
      }

      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);
      hmap.remove(3);
      System.out.println("Map key and values after removal:");
      for(Map.Entry me : hmap.entrySet())
      {
    	  System.out.println("Key:" +me.getKey() + " Value:" + me.getValue());
       }
   }
}
