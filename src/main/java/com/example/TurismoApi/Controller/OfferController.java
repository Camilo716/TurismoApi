package com.example.TurismoApi.Controller;

import com.example.TurismoApi.Models.Offer;
import com.example.TurismoApi.Services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @PostMapping
    public ResponseEntity<?> postOffer(@RequestBody Offer offer){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(offerService.postOffer(offer));
        }catch (Exception ex){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ex.getMessage());
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> putOffer(@RequestBody Offer offer, @PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(offerService.putOffer(id, offer));
        }catch (Exception ex){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ex.getMessage());
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOfferById(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(offerService.getOfferById(id));
        }catch (Exception ex){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ex.getMessage());
        }    }

    @GetMapping
    public ResponseEntity<?> getOffers(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(offerService.getOffers());
        }catch (Exception ex){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ex.getMessage());
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOffer(@PathVariable Integer id){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(offerService.deleteOffer(id));
        }catch (Exception ex){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(ex.getMessage());
        }    }
}
