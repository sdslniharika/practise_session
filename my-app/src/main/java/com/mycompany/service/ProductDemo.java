package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.exception.InvalidArgumentException;
import com.mycompany.exception.ProductNotFoundException;

public class ProductDemo {

	public static void main(String[] args) {

		ProductStream products = new ProductStream();

		try {
			products.add("Samsung", 23499.09);
			products.add("IPhone 11", 50099.0);
			products.add("Nokia", 15000.98);
			products.add("One Plus", 35599.99);

			List<String> listOfProducts = products.findProductsGreaterThanPrice(15000.99);
			System.out.println("List of names =" + listOfProducts);

			Optional<Double> optional = products.findCheapestProduct();
			if (optional.isPresent()) {
				System.out.println("Price is " + optional.get());
			}

			List<String> name = products.findProductsGreaterThanPrice(700000);
			System.out.println("List of names =" + name);

		} catch (InvalidArgumentException | ProductNotFoundException e) {

			System.out.println("There was an Error - " + e.getMessage());

		} catch (Exception e) {
			System.out.println("There was an Error -" + e.getMessage());
		}

	}

}
