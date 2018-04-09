package org.sambasoft.controllers;

import org.sambasoft.entities.Orders;
import org.sambasoft.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/orders")
    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/order/{id}")
    public Orders getOrder(@PathVariable Long id) {
        return orderRepository.findOne(id);
    }

    @DeleteMapping("/order/{id}")
    public boolean deleteOrder(@PathVariable Long id) {
        orderRepository.delete(id);
        return true;
    }

    @PutMapping("/order")
    public Orders updateOrder(@RequestBody Orders orders) {
        return orderRepository.save(orders);
    }

    @PostMapping("/order")
    public Orders createOrder(@RequestBody Orders orders) {
        return orderRepository.save(orders);
    }

}
