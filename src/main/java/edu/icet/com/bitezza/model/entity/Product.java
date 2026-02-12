package edu.icet.com.bitezza.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
    private String imageUrl;
    private boolean active;
    private String categoryName;

}
