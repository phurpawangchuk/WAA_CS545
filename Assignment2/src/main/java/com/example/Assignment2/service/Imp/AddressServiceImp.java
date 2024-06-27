package com.example.Assignment2.service.Imp;


import com.example.Assignment2.entity.Address;
import com.example.Assignment2.repository.AddressRepository;
import com.example.Assignment2.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImp implements AddressService {

    @Autowired
    private final AddressRepository addressRepository;

    @Override
    public List<Address> getAll() {
        return addressRepository.findAll();
    }

    @Override
    public void create(Address Address) {
        addressRepository.save(Address);
    }

    @Override
    public void delete(Long addressId) {
        addressRepository.deleteById(addressId);
    }

    @Override
    public void update(Long addressId, Address address) {
        Optional<Address> optionalAddress = addressRepository.findById(addressId);
        if (optionalAddress.isPresent()) {
            Address addressToUpdate = optionalAddress.get();
            addressToUpdate.setStreet(address.getStreet());
            addressToUpdate.setCity(address.getCity());
            addressToUpdate.setZip(address.getZip());
            addressRepository.save(addressToUpdate);
        } else {
            throw new RuntimeException("Address not found with id " + addressId);
        }
    }

    @Override
    public Address getAddress(Long addressId) {
        return addressRepository.findById(addressId).get();
    }
}
