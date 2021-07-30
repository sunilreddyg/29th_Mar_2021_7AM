package mq.java.Collections;

import java.util.HashMap;

public class HashMap_Interface {

	public static void main(String[] args)
	{
		
		
			HashMap<Number, String> map=new HashMap<Number,String>();
			map.put(1, "Iphone");
			map.put(2, "Samsung");
			map.put(3, "Vivo");
			map.put(4, "Oppo");
			map.put(null,"Micromax");
			
			
			//Get value using Keyname from collection of pair objects
			String kvalue=map.get(null);
			System.out.println("value returned is ---> "+kvalue);
			
			
			for (Number productkey : map.keySet()) 
			{
				String EachProduct=map.get(productkey);
				System.out.println(EachProduct);
			}
			
			
			
			
			

	}

}
