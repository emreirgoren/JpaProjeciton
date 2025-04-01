package com.projection.jpa.repos;

import com.projection.jpa.dto.ProductDto.ProductDto;
import com.projection.jpa.model.JpaModel;
import org.springframework.data.jpa.repository.Query;

public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<JpaModel,Long> {

    @Query("select new com.projection.jpa.dto.ProductDto(jp.name,jp.description) from JpaModel jm")
    ProductDto interfaceProjection();

    @Query("select new com.projection.jpa.dto.ProductDto(jp.name,jp.description) from JpaModel jm")
    ProductDto projection();
}
