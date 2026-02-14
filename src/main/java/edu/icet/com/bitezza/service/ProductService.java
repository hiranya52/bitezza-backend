package edu.icet.com.bitezza.service;

import edu.icet.com.bitezza.model.dto.ProductDTO;
import edu.icet.com.bitezza.model.entity.Product;
import edu.icet.com.bitezza.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {

        List<ProductDTO> productDTOS = new ArrayList<>();

        List<Product> products  = productRepository.findAll();

        for ( Product product : products ) {

            productDTOS.add( new ProductDTO(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getPrice(),
                    product.getImageUrl(),
                    product.isActive(),
                    product.getCategoryName()
            ));
        }

        return productDTOS;

    }

    public ProductDTO getProduct(String name) {

        Product product = productRepository.findByName(name);

        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getImageUrl(),
                product.isActive(),
                product.getCategoryName()
        );
    }
}
