package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DonationServiceImpl implements DonationService{
    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }


    @Override
    public Integer countDonationByQuantity(List<Donation> donations) {
        int sum = 0;
        donations
                .stream()
                .map(Donation::getQuantity).toList()
                .forEach(d->d+=sum);
        return sum;
    }

    @Override
    public List<Donation> findAll() {
        return donationRepository.findAll();
    }
}
