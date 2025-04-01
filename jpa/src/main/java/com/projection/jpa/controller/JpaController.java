package com.projection.jpa.controller;

import com.projection.jpa.dto.ProductDto.ProductDto;
import com.projection.jpa.repos.JpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/api/v1/jpa")
@RequiredArgsConstructor
public class JpaController {

    private final JpaRepository jpaRepository;

    @GetMapping("/interfaceProjection")
    public ProductDto getInterfaceProjection(){
        return jpaRepository.interfaceProjection();
    }

    @GetMapping("/projection")
    public ProductDto getProjection(){
        return jpaRepository.projection();
    }


}
