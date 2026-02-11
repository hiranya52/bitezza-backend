package edu.icet.com.bitezza.model.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private boolean active;
    private String categoryName;

}
