package service;

import model.Product;

import java.util.Collection;

public interface ProductFilterService {

	Collection<Product> filterProductsByName(Collection<Product> products, String name);

	Collection<Product> filterProductsByField(Collection<Product> products, String field, String value);
}
