package com.ssp.apps.manage.product.controller;

import com.ssp.apps.crud.api.common.controller.GenericController;
import com.ssp.apps.manage.product.dto.ProductDto;
import com.ssp.apps.manage.product.entity.Product;
import com.ssp.apps.manage.product.mapper.ProductMapper;
import com.ssp.apps.manage.product.service.ProductService;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController extends GenericController<Product, Long, ProductDto> {
    public ProductController(ProductService service) {
        super(service, Mappers.getMapper(ProductMapper.class));
    }
}
