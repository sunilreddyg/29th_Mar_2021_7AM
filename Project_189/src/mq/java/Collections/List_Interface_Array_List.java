package mq.java.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface_Array_List {

	public static void main(String[] args)
	{
		
		/*
		 * => List allow collection of objects to store inorder
		 * => List accept duplicate values
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("two");
		list.add("five");
		list.add("six");
		
		
		 //Get Any single object using index number
		 String inde_object=list.get(4);
		 System.out.println("index object is --> "+inde_object);
		
		 //Remove selected object from collection
		 list.remove("four");
		 
		 //Get object count at collection
		 int count=list.size();
		 System.out.println("Number of object available at collection -> "+count);
		 
		 //Verify Object Available at collection
		 boolean flag=list.contains("three");
		 System.out.println("Object Available status is --> "+flag);
		 
		 //Get First Iterator from collection
		 String itr=list.iterator().next();
		 System.out.println("Next iterator object in collection is --> "+itr);
		 
		 
		 //Clear all objects under collection
		 //list.clear();
		 
		 //Verify Collection Empty status
		 boolean flag1=list.isEmpty();
		 System.out.println("Collection empty status is --> "+flag1);
		 
		 
		 //Read all list of object using for-loop
		 for (int i = 0; i < list.size(); i++) 
		 {
			String index=list.get(i);
			System.out.println("for=> "+index);
		 }
		 
		 
		 
		 
		 
		 //Read all object using for each loop
		 for (String Eachobject : list) 
		 {
			System.out.println("foreach=> "+Eachobject);
		 }
		 
		 
		 
		 //Converting Collection into iterators
		 Iterator<String> iterators=list.iterator();
	
		 //Read all iterators using while loop
		 while(iterators.hasNext())
		 {
			 String object=iterators.next();
			 System.out.println("while=> "+object);
		 }
		
		
		
		
		

	}

}
