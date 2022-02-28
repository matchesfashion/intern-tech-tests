package model;

import java.math.BigDecimal;

public class Product {

	private String name;
	private String category;
	private BigDecimal price;

	public Product(String name, String category, BigDecimal price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public String getName()
	{
		return name;
	}

	public String getCategory()
	{
		return category;
	}

	public BigDecimal getPrice()
	{
		return price;
	}
}
