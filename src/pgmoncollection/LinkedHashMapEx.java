package pgmoncollection;
import java.util.*;
public class LinkedHashMapEx
{
    public static void main(String args[]) {
         LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();

         lhmap.put(22, "Abey");
         lhmap.put(33, "Dawn");
         lhmap.put(1, "Sherry");
         lhmap.put(2, "Karon");
         lhmap.put(100, "Jim");

         Set set = lhmap.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext())
         {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print("Key is: "+ me.getKey() + " Value is: "+me.getValue()+"\n");
         }
    }
}