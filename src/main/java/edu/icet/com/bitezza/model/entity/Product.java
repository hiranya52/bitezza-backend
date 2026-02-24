package edu.icet.com.bitezza.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    private String id;          // alphanumeric product ID
    private String name;
    private String description;
    private double price;

    @Lob
    private String imageUrl;    // long URLs

    private boolean active;
    private String categoryName;

}
