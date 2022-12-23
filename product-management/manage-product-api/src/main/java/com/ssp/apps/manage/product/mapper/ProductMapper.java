package com.ssp.apps.manage.product.mapper;

import com.ssp.apps.crud.api.common.mapper.GenericMapper;
import com.ssp.apps.manage.product.dto.ProductDto;
import com.ssp.apps.manage.product.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper extends GenericMapper<Product, ProductDto> {
}
