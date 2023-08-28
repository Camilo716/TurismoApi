package com.example.TurismoApi.Repositories;

import com.example.TurismoApi.Models.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOfferRepository extends JpaRepository<Offer, Integer> {
}
