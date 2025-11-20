package com.sciencespo.backend.web;

import com.sciencespo.backend.entities.CryptoCurrency;
import com.sciencespo.backend.repository.CryptoCurrencyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class HotelsController {
    private CryptoCurrencyRepository hotelRepository;

    public HotelsController(CryptoCurrencyRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }
    @GetMapping("/crypto")
    public List<CryptoCurrency> listHotels(){
        return hotelRepository.findAll();
    }
}
