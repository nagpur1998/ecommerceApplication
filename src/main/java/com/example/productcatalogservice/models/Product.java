package com.example.productcatalogservice.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product extends BaseModel{

    private String title;
    private String description;
    private String imageUrl;

    private Double amount;
    private Category category;

    private Boolean isPrimeSpecific;

}
