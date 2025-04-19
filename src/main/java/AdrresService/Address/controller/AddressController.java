package AdrresService.Address.controller;

import AdrresService.Address.entity.Address;
import AdrresService.Address.repository.AddressRepository;
import AdrresService.Address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;


    @PostMapping
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        Address address1=addressService.save(address);
        return ResponseEntity.ok(address1);
    }


}
