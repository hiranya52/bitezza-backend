package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,String> {
}
