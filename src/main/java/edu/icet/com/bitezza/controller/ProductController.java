package edu.icet.com.bitezza.controller;


import edu.icet.com.bitezza.model.dto.ProductDTO;
import edu.icet.com.bitezza.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public String loadProduct(){
        return "Load Product Controller...";
    }

    @GetMapping("/getAll")
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/getProduct")
    public ProductDTO getProduct(@RequestParam String name){
        return productService.getProduct(name);
    }

}
