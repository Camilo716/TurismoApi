package com.example.TurismoApi.Services;

import com.example.TurismoApi.Models.Company;
import com.example.TurismoApi.Models.Offer;
import com.example.TurismoApi.Repositories.IOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {

    @Autowired
    IOfferRepository offerRepository;


    public Offer postOffer(Offer offer) throws Exception {
        try{
            return offerRepository.save(offer);
        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }

    public Offer putOffer(Integer id, Offer offer) throws Exception {
        try{
            Optional<Offer> optionalOffer = offerRepository.findById(id);

            if (optionalOffer.isEmpty()){
                throw new Exception("Offer not found");
            }

            Offer _offer = optionalOffer.get();
            _offer.setDescription(offer.getDescription());
            _offer.setTittle(offer.getTittle());

            return offerRepository.save(_offer);

        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }

    public Offer getOfferById(Integer id) throws Exception{
        try{
            Optional<Offer> optionalOffer = offerRepository.findById(id);

            if (optionalOffer.isEmpty()){
                throw new Exception("Offer not found");
            }

            return optionalOffer.get();
        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }

    public List<Offer> getOffers() throws Exception{
        try{
            return offerRepository.findAll();

        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }

    public boolean deleteOffer(Integer id) throws Exception{
        try{
            Optional<Offer> optionalOffer = offerRepository.findById(id);

            if (optionalOffer.isEmpty()){
                throw new Exception("Offer not found");
            }

            offerRepository.deleteById(id);
            return true;

        } catch (Exception exception){
            throw new Exception(exception.getMessage());
        }
    }
}
