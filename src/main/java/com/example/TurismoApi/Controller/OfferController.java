package com.example.TurismoApi.Controller;

import com.example.TurismoApi.Models.Offer;
import com.example.TurismoApi.Services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @PostMapping
    public ResponseEntity<?> postOffer(@RequestBody Offer offer){
        return null;
    }

    @PutMapping()
    public ResponseEntity<?> putOffer(@RequestBody Offer offer, @PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getOfferById(@PathVariable Integer id){
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getOffers(){
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteOffer(@PathVariable Integer id){
        return null;
    }
}
