package assignment.service;

import java.util.HashMap;
import java.util.Map;

import assignment.dao.IStore;
import assignment.exception.InvalidArgumentException;
import assignment.exception.ProductNotFoundException;
import assignment.model.Grocery;
import assignment.model.Phone;
import assignment.model.Product;
import assignment.model.ProductCategory;

public class Store implements IStore {

	private Map<Integer, Product> productMap = new HashMap<>();
	private int generateId;

	private int generatedId() {
		generateId = generateId + 1;
		return generateId;

	}

	@Override
	public Product findById(int Id) throws InvalidArgumentException{
		if(Id<0)
		{
			throw new InvalidArgumentException("Invalid Product Id");
		}
		Product prod = productMap.get(Id);
		if(prod==null)
		{
			throw new ProductNotFoundException("Product not found");
		}
		return prod;
	}

	@Override
	public Phone addPhone(String name, String model, int ram, int storage, int units, int price) {
		int id = generatedId();
		if(name==null|| model==null || ram<0 || storage<0 || units<0 || price<0)
		{
			throw new  InvalidArgumentException("Invalid Input");
		}
		Phone phone = new Phone(id, name, ProductCategory.PHONE, ram, storage, model, price, units);
		productMap.put(phone.getProductId(), phone);
		return phone;
	}

	@Override
	public Grocery addGrocery(String name, double quantityInKg, int pricePerKg, double quantity) {
		int id = generatedId();
		if(name==null || quantityInKg<0 || pricePerKg<0 || quantity<0)
		{
			throw new InvalidArgumentException("Invalid Input");
		}
		Grocery grocery = new Grocery(id, name, ProductCategory.GROCERY, quantityInKg, quantity, pricePerKg);
		productMap.put(grocery.getProductId(), grocery);
		return grocery;
	}

	@Override
	public Phone findPhoneByName(String name, String model) throws InvalidArgumentException{
		if(name==null || model==null)
		{
			throw new InvalidArgumentException("Invalid Product name : Please provide valid input");
		}
		for (Product Pro : productMap.values()) {
			if (Pro instanceof Phone) {
				if (((Phone) Pro).getModel().equalsIgnoreCase(model) && Pro.getProductName().equalsIgnoreCase(name)) {
					return (Phone) Pro;
				}
			}
		}
		return new Phone();
	}

	@Override
	public Grocery findGroceryByName(String name) throws InvalidArgumentException,ProductNotFoundException{
		if(name==null)
		{
			throw new InvalidArgumentException("Invalid Product name : Please provide valid name");
		}
		for (Product Pro : productMap.values()) {
			if (Pro.getProductName().equalsIgnoreCase(name)) {
				return (Grocery) Pro;
			}
		}
			throw new ProductNotFoundException("Product not found");
	}

	@Override
	public Phone changePhonePrice(int id, int price) {
		if (id < 0 || price < 0) {
			throw new InvalidArgumentException("Invalid Input");
		}
		if (productMap.containsKey(id)) {
			Product prod = productMap.get(id);
			Phone phoneObject = (Phone) prod;
			phoneObject.setPrice(price);
			return phoneObject;
		}
		else
		{
			throw new ProductNotFoundException("Product not found to change the price");
		}
	}

	@Override
	public Phone buyPhone(int Id) {

		if(Id<0)
		{
			throw new InvalidArgumentException("Invalid Input");
		}
		if (productMap.containsKey(Id)) {
			Phone prod = (Phone) productMap.get(Id);
			prod.setUnits(prod.getUnits() - 1);
			return prod;
		}
		else
		{
			throw new ProductNotFoundException("Product not found");
		}

	}

	@Override
	public Grocery buyGrocery(int Id, double desiredQuantity) {
		if(Id<0 || desiredQuantity<0)
		{
			throw new InvalidArgumentException("Invalid Input");
		}
		if (productMap.containsKey(Id)) {
			Grocery prod = (Grocery) productMap.get(Id);
			prod.setQuantity(prod.getQuantity() - desiredQuantity);
			return prod;
		}
		else {
			throw new ProductNotFoundException("Product not found");
		}
		
	}
}
