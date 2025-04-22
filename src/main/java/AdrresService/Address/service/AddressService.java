package AdrresService.Address.service;

import AdrresService.Address.entity.Address;
import AdrresService.Address.entity.Booking;
import AdrresService.Address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AddressService {
    @Autowired
    WebClient webClient;

    @Autowired
    AddressRepository addressRepository;

    public Address save(Address address){

        Address address1=addressRepository.save(address);
        return address1;
    }

    public Mono<Booking> getBooking(){
        Mono<Booking> booking= webClient.get()
                .uri("/4")
                .retrieve()
                .bodyToMono(Booking.class);

                return booking;
    }


}
