package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class Retrive_DataProvider_Data_From_Different_Class 
{
	
	/*
	 * Inorder to retrieve dataprovider data from different class
	 * we should mention class of dataprovider class
	 * 
	 */
	
	
	@Test(dataProvider="productInfo",dataProviderClass=Inputdata.class)
	public void Test_Products(String product, int quantity, double price)
	{
		System.out.println("Product name is     --> "+product);
		System.out.println("Product quantity is --> "+quantity);
		System.out.println("Product price is    --> "+price);
		System.out.println("\n");
	}
	
	
}
