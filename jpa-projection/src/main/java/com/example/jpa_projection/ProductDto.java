package com.example.jpa_projection;

import lombok.*;

@Getter
@Setter
public class ProductDto{

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProductDto() {
    }
}
