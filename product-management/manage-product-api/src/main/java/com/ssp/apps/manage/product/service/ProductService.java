package com.ssp.apps.manage.product.service;

import com.ssp.apps.crud.api.common.service.GenericService;
import com.ssp.apps.manage.product.entity.Product;
import com.ssp.apps.manage.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends GenericService<Product, Long> {
    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
