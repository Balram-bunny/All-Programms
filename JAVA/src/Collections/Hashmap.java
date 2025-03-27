package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> language=new HashMap<>();
		language.put(1, "java");
		language.put(2, "C++");
		language.put(3, "Ruby");
        language.put(3, "java");//Key not duplicate but values can be
        
        System.out.println(language);
        System.out.println("Access 2nd element  :"+ language.get(2));
         language.replace(3, "SQL");
         System.out.println("After replace: "+language);
         boolean value=language.replace(2, "C++", "C+");
         System.out.println(value);
         System.out.println(language);
         language.remove(3);
         System.out.println("After removal :"+ language);
         System.out.println("Only print key :"+ language.keySet());
         System.out.println("Only print value :"+ language.values());
         System.out.println("print entries :"+ language.entrySet());
         System.out.println("check specified key is present or not :"+language.containsKey(1));
         System.out.println("check specified key is present or not :"+language.containsKey(4));//false
         System.out.println("size of hasmap:"+language.size());
         
         //For -Each loop for keyset 
         for(Integer i: language.keySet())
         {
        	 System.out.println("Traverse using for each loop for keyset:"+i);
         }
         //Iterator
         Iterator it= language.keySet().iterator();
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         //For -Each loop for keyvalue 
         for(String i: language.values())
         {
        	 System.out.println("Traverse using for each loop for keyvalue:"+i);
         }
         //Iterator
         Iterator it1= language.values().iterator();
         while(it1.hasNext())
         {
        	 System.out.println(it1.next());
         }
         
         // For entry set, the return type will be Entry and entry is separate interace, which has own methods
         for(Entry<Integer, String> entry:language.entrySet())
         {
        	 System.out.println(entry.getKey()+ ":"+entry.getValue());
        	 

         }
         //Iterator
         
         Iterator it2=language.entrySet().iterator();
         while(it2.hasNext())
         {
        	 System.out.println(it2.next());
         }




	}

}
