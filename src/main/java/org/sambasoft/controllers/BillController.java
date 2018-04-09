package org.sambasoft.controllers;

import org.sambasoft.entities.Bills;
import org.sambasoft.repositories.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class BillController {
    @Autowired
    private BillsRepository billsRepository;

    @GetMapping("/bills")
    public List<Bills> getBills() {
        return billsRepository.findAll();
    }

    @GetMapping("/bill/{id}")
    public Bills getBill(@PathVariable Long id) {
        return billsRepository.findOne(id);
    }

    @DeleteMapping("/bill/{id}")
    public boolean deleteBill(@PathVariable Long id) {
        billsRepository.delete(id);
        return true;
    }

    @PutMapping("/bill")
    public Bills updateBill(@RequestBody Bills bill) {
        return billsRepository.save(bill);
    }

    @PostMapping("/bill")
    public Bills createBill(@RequestBody Bills bill) {
        return billsRepository.save(bill);
    }

}
