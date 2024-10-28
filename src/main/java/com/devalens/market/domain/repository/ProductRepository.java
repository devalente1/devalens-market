package com.devalens.market.domain.repository;

import com.devalens.market.domain.Product;
import com.devalens.market.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Producto> getAll();
    Optional<List<Producto>> getByCategory(int categoryId);
    Optional<List<Producto>> getScarseProducts(int quantity);
    Optional<List<Producto>> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);


}
