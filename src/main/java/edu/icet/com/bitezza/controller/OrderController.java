package edu.icet.com.bitezza.controller;

import edu.icet.com.bitezza.model.dto.OrderDTO;
import edu.icet.com.bitezza.model.dto.OrderItemDTO;
import edu.icet.com.bitezza.model.entity.Order;
import edu.icet.com.bitezza.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public String loadOrder(){
        return "Load Order Controller..";
    }

    @GetMapping("/lastId")
    public int getLastOrderId(){
        return orderService.getLastOrderId();
    }


    @PostMapping("/add")
    public OrderDTO addOrder(@RequestBody OrderDTO order){

        if (order != null){
            return orderService.addOrder(order);
        }
        return null;
    }


}
