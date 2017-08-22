package InventoryManager;

import org.junit.Assert;
import org.junit.Test;


public class InventoryManagerTest {
	
	@Test
	   public void getProducts(){
		
		Inventory inventory1 = new Inventory();
		Product Wine = new Product("wine", 10.00, 12);
		Product Tequilla = new Product("tequilla", 40.00, 2);
		inventory1.addProduct(Wine);
		inventory1.addProduct(Tequilla);
		
		

				
				Product[] expected = {Wine, Tequilla};
				
				Product[] actual = inventory1.getProducts();

				Assert.assertEquals(expected, actual);

		   
				
				
			}
	
}
 