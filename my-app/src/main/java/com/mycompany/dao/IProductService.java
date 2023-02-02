package com.mycompany.dao;

import java.util.List;
import java.util.Optional;

public interface IProductService {

	void add(String productname, double price);

	List<String> findProductsGreaterThanPrice(double priceArg);

	Optional<Double> findCheapestProduct();

}
