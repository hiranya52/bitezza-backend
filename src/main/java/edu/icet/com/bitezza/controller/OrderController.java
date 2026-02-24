package edu.icet.com.bitezza.controller;

import edu.icet.com.bitezza.model.dto.OrderItemDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public String loadOrder(){
        return "Load Order Controller..";
    }


    @PostMapping("/addOrder")
    public void addOrder(@RequestBody OrderItemDTO orderItemDTO){



    }


}
