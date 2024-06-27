package com.example.Assignment2.service;

import com.example.Assignment2.entity.Address;
import java.util.List;

public interface AddressService {
    List<Address> getAll();
    void create(Address address);
    void delete(Long addressId);
    void update(Long addressId, Address address);
    Address getAddress(Long addressId);
}
