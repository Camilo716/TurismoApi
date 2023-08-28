package com.example.TurismoApi.Services;

import com.example.TurismoApi.Models.Offer;
import com.example.TurismoApi.Repositories.IOfferRepository;
import com.example.TurismoApi.Validators.NumRangeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.TurismoApi.Validators.IValidable;
import com.example.TurismoApi.Validators.StringRangeValidator;
import com.example.TurismoApi.Validators.DateValidator;


import java.util.List;

public class OfferService {

    @Autowired
    IOfferRepository offerRepository;

    private final IValidable<String> lengthBetween0And20Validator;
    private final IValidable<String> formatDateValidator;
    private final IValidable<Double> positiveNumberValidator;


    public OfferService() {
        lengthBetween0And20Validator = new StringRangeValidator(0,20);
        formatDateValidator = new DateValidator();
        positiveNumberValidator = new NumRangeValidator(0.0, Double.MAX_VALUE);
    }

    public Offer postOffer(Offer offer) throws Exception {
        return offerRepository.save(offer);
    }

    public Offer putOffer(Integer id, Offer offer) throws Exception {
        return null;
    }

    public Offer getOfferById(Integer id) throws Exception{
        return null;
    }

    public List<Offer> getOffers() throws Exception{
        return null;
    }

    public boolean deleteOffer(Integer id) throws Exception{
        return true;
    }
}
