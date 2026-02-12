package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository <Product,String> {
}
