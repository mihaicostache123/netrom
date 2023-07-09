package com.example.championship.service;


import com.example.championship.model.Sponsor;
import com.example.championship.repository.SponsorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    private SponsorRepository sponsorrepository;

    public List<Sponsor> getAllSponsors() { return sponsorrepository.findAll(); }

    public void addSponsor(Sponsor sponsor) { sponsorrepository.save(sponsor); }
    public void updateSponsor(Sponsor sponsor) { sponsorrepository.save(sponsor); }
    public void deleteSponsor(Sponsor sponsor) { sponsorrepository.delete(sponsor); }
}
