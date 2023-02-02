package assignment.dao;

import assignment.exception.InvalidArgumentException;
import assignment.model.Grocery;
import assignment.model.Phone;
import assignment.model.Product;

public interface IStore {

	Product findById(int Id) throws InvalidArgumentException;

	Phone findPhoneByName(String name, String model);

	Grocery findGroceryByName(String name);

	Phone addPhone(String name, String model, int ram, int storage, int units, int price);

	Grocery addGrocery(String name, double quantityInKg, int pricePerKg, double quantity);

	Phone changePhonePrice(int id, int price);

	Phone buyPhone(int Id);

	Grocery buyGrocery(int id, double quantity);

}