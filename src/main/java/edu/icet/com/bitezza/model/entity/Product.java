package edu.icet.com.bitezza.model.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

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
