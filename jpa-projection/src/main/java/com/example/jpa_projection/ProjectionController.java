package com.example.jpa_projection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/projection")
public class ProjectionController {

    private final ProductRepository productRepository;

    public ProjectionController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductDto> getProducts1(){
        return productRepository.getProductDto1();
    }

}
