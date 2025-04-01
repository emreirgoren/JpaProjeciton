package com.example.jpa_projection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query("select new com.example.jpa_projection.ProductDto(pd.name,pd.description) from Product pd")
    List<ProductDto> getProductDto1();

}
