package com.mycompany.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.mycompany.dao.IProductService;
import com.mycompany.entity.Product;
import com.mycompany.exception.InvalidArgumentException;
import com.mycompany.exception.ProductNotFoundException;

public class ProductStream implements IProductService {

	private List<Product> prodList = new ArrayList<>();

	private int generateId;

	private int generatedId() {
		generateId = generateId + 1;
		return generateId;
	}

	public void add(String name, double price) {
		int id = generatedId();
		stringValidation(name);
		priceValidation(price);
		prodList.add(new Product(id, name, price));

	}

	public List<String> findProductsGreaterThanPrice(double priceArg) {

		priceValidation(priceArg);
//		Predicate<Product> predicate = product -> product.getPrice() > priceArg;
//		Stream<Product> stream1 = prodList.stream();
//		Stream<Product> stream2 = stream1.filter(predicate);
//		Stream<String> stream3 = stream2.map(Product::getName);
//		List<String> maxProducts = stream3.toList();

		List<String> maxProducts = prodList.stream().filter(product -> product.getPrice() > priceArg)
				.map(Product::getName).collect(Collectors.toList());

		if (maxProducts.isEmpty()) {
			throw new ProductNotFoundException("No products found");
		}

		return maxProducts;

	}

	public Optional<Double> findCheapestProduct() {

//		Stream<Product> stream1 = prodList.stream();
//		Stream<Double> stream3 = stream1.map(Product::getPrice);
//		return stream3.min(Double::compare);
		return prodList.stream().map(Product::getPrice).min(Double::compare);

	}

	public void stringValidation(String name) {
		if (name.isBlank()) {
			throw new InvalidArgumentException("Invalid Input");
		}

	}

	public void priceValidation(double price) {
		if (price < 0) {
			throw new InvalidArgumentException("Invalid Input");
		}

	}

}
