package com.thumati.springframework.repositories;

import com.thumati.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
