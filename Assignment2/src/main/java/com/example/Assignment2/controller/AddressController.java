package com.example.Assignment2.controller;

import com.example.Assignment2.entity.Address;
import com.example.Assignment2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public String create(@RequestBody Address address){
        addressService.create(address);
        return "Address created.";
    }

    @GetMapping
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @GetMapping("/{addId}")
    public Address getAddress(@PathVariable Long addId){

        return addressService.getAddress(addId);
    }

    @PutMapping("/{catId}")
    public String update(@PathVariable Long catId, @RequestBody Address address){
        addressService.update(catId, address);
        return "Address updated.";
    }

    @DeleteMapping("/{addId}")
    public String delete(@PathVariable Long addId){
        addressService.delete(addId);
        return "Address Deleted.";
    }
}
