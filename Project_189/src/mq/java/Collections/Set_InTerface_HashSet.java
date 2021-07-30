package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_InTerface_HashSet {

	public static void main(String[] args) 
	{
		
		
		/*
		 * Set is a undorder collection of objects and it doesn't
		 * accept duplicate values
		 */
		
		 Set<String> set=new HashSet<String>();
		 set.add("WD");
		 set.add("IDE");
		 set.add("GRID");
		 set.add("WD");
		 set.add("Appium");
		 set.add("Cucumber");
		 
		 
		 //Remove selected object from collection
		 set.remove("IDE");
		 
		 //Get object count at collection
		 int count=set.size();
		 System.out.println("Number of object available at collection -> "+count);
		 
		 //Verify Object Available at collection
		 boolean flag=set.contains("IDE");
		 System.out.println("Object Available status is --> "+flag);
		 
		 //Get First Iterator from collection
		 String itr=set.iterator().next();
		 System.out.println("Next iterator object in collection is --> "+itr);
		 
		 
		 //Clear all objects under collection
		 //set.clear();
		 
		 //Verify Collection Empty status
		 boolean flag1=set.isEmpty();
		 System.out.println("Collection empty status is --> "+flag1);
		 
		 
		 
		 //Read all object using for each loop
		 for (String Eachobject : set) 
		 {
			System.out.println(Eachobject);
		 }
		 
		 
		 
		 //Converting Collection into iterators
		 Iterator<String> iterators=set.iterator();
	
		 //Read all iterators using while loop
		 while(iterators.hasNext())
		 {
			 String object=iterators.next();
			 System.out.println(object);
		 }
		 
		 
		 
		 
		 
		 
		
		
		

	}

}
