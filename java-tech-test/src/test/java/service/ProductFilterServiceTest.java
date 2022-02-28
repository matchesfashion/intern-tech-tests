package service;

import model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductFilterServiceTest {

	Collection<Product> testProducts;

	@BeforeEach
	void setup() {
		testProducts = List.of(
				new Product("wool jacket", "jackets", BigDecimal.valueOf(100L)),
				new Product("leather jacket", "jackets", BigDecimal.valueOf(200L)),
				new Product("white sneakers", "shoes", BigDecimal.valueOf(80L)),
				new Product("blue sneakers", "shoes", BigDecimal.valueOf(80L)),
				new Product("red shorts", "trousers", BigDecimal.valueOf(30L)),
				new Product("red shorts", "underwear", BigDecimal.valueOf(20L)),
		new Product("green trousers", "trousers", BigDecimal.valueOf(60L))
		);
	}


	@Test
	void filterByNameShouldReturnAllProductsWithName() {
		String productName = "red shorts";
		ProductFilterService productFilterService = new ProductFilterServiceImplementation();

		Collection<Product> retrievedProducts = productFilterService.filterProductsByName(testProducts, productName);
		assertEquals(2, retrievedProducts.size());
		for(Product retrievedProduct : retrievedProducts)
		{
			assertEquals(productName, retrievedProduct.getName());
		}
	}


	@Test
	void filterByCategoryShouldReturnAllProductsWithCategory() {
		String category = "trousers";
		ProductFilterService productFilterService = new ProductFilterServiceImplementation();

		Collection<Product> retrievedProducts = productFilterService.filterProductsByField(testProducts, "category", category);
		assertEquals(2, retrievedProducts.size());
		for(Product retrievedProduct : retrievedProducts)
		{
			assertEquals(category, retrievedProduct.getCategory());
		}
	}

}
