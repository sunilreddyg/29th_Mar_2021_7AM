package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Inputdata 
{
  @Test(dataProvider = "dp",enabled=false)
  public void Tc001(String uid,String pwd) 
  {
	  System.out.println(uid+"    "+pwd);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] { "Arjun","Arj123" },
      new Object[] { "Aakash", "Ak1234"},
      new Object[] { "Aarhi", "Ar1234" },
    };
  }
  
  @DataProvider   //Static specifier allowed dataprovider data to use in different package
  public static Object[][] productInfo() 
  {
    return new Object[][] 
    {
      new Object[] { "iphone",3,25000.00},
      new Object[] { "samsung",2,15000.00 },
      new Object[] { "vivo",4,10000.00},
    };
  }
  
 
  @Test(priority=1,dataProvider="productInfo")
  public void Test_products(String product_name,int number_of_products, double product_price)
  {
	  System.out.println(product_name+"   "+number_of_products+"   "+product_price);
	  
  }
  
  
  
  
  
}
