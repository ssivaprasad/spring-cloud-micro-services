package com.ssp.apps.manage.product.repository;

import com.ssp.apps.manage.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
