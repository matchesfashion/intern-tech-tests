package service;

import model.Product;

import java.util.Collection;
import java.util.Collections;

public class ProductFilterServiceImplementation implements ProductFilterService
{
    @Override
    public Collection<Product> filterProductsByName(Collection<Product> products, String name)
    {
        return Collections.emptyList();
    }

    @Override
    public Collection<Product> filterProductsByField(Collection<Product> products, String field, String value)
    {
        return Collections.emptyList();
    }
}
