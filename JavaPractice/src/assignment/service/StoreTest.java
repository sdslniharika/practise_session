package assignment.service;

import assignment.exception.InvalidArgumentException;
import assignment.exception.ProductNotFoundException;
import assignment.model.Grocery;
import assignment.model.Phone;
import assignment.model.Product;

public class StoreTest {
	public static void main(String args[]) {
		try {
		Store store = new Store();
		Phone phoneObj = store.addPhone("Samsung", "Galaxy", 8, 64, 5, 25000);
		Phone phoneObj2 = store.addPhone("Apple 11", "Pro Max", 8, 128, 3, 90000);
		Grocery groceryObj = store.addGrocery("Detergent", 1, 230, 7);
		Grocery groceryObj2 = store.addGrocery("Oil", 1, 210, 10);
		Phone findPhoneRes = store.findPhoneByName("Apple 11", "Pro max");
		Product findByIdRes = store.findById(0);
		Grocery findGroceryRes = store.findGroceryByName("Oil");
		Phone changedObj = store.changePhonePrice(2, 80000);
		Grocery changedGrocery = store.buyGrocery(3, 0.1);
		Phone changedPhone = store.buyPhone(1);

		
		System.out.println("Product added = " + phoneObj.getProductId() + "," + phoneObj.getProductName());
		System.out.println("Product added = " + groceryObj.getProductId() + "," + groceryObj.getProductName());
		System.out.println("Grocery =" + findGroceryRes.getQuantity() + "," + findGroceryRes.getProductName() + ","
				+ findGroceryRes.getProductId());
		System.out.println("Phone = " + findPhoneRes.getModel() + "," + findPhoneRes.getProductName() + ","
				+ findPhoneRes.getProductId());
		System.out.println("Phone  changedObj = " + changedObj.getModel() + "," + changedObj.getProductName() + ","
				+ changedObj.getProductId());
		System.out.println("Grocery  changedGrocery = " + changedGrocery.getQuantity() + ","
				+ changedGrocery.getProductName() + "," + changedGrocery.getProductId());
		System.out.println("Phone  changedObj = " + changedPhone.getModel() + "," + changedPhone.getProductName() + ","
				+ changedPhone.getProductId() + "," + changedPhone.getUnits());
		System.out.print(findByIdRes);
		}catch(InvalidArgumentException e)
		{
			 System.out.println("invalid argument," + e.getMessage());
		}
		catch(ProductNotFoundException e)
		{
			System.out.println("invalid argument," + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("invalid argument," + e.getMessage());
		}

	}

}
