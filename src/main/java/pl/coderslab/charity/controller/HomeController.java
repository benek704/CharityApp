package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;
import pl.coderslab.charity.service.DonationService;


@Controller
public class HomeController {
    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;
    private final DonationService donationService;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository, DonationService donationService) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
        this.donationService = donationService;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("Institution",institutionRepository.findAll());
        model.addAttribute("Donation",donationRepository.count());
        model.addAttribute("Quantity",donationService.countDonationByQuantity(donationService.findAll()));
        return "index";
    }
}
