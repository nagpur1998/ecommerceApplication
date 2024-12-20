package com.example.productcatalogservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Category extends BaseModel {
    private String name;
    private String description;

    private List<Product> products;
}
