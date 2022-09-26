package pl.coderslab.charity.service;

import pl.coderslab.charity.model.Donation;

import java.util.List;

public interface DonationService {
    Integer countDonationByQuantity(List <Donation> donations);
    List<Donation> findAll();
}
