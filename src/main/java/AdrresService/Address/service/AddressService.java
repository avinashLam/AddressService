package AdrresService.Address.service;

import AdrresService.Address.entity.Address;
import AdrresService.Address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public Address save(Address address){

        Address address1=addressRepository.save(address);
        return address1;
    }
}
