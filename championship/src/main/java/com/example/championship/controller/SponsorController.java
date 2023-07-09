package com.example.championship.controller;


import com.example.championship.model.Sponsor;
import com.example.championship.service.SponsorService;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sponsor")
public class SponsorController {
    @Autowired
    private SponsorService sponsorservice;

    @GetMapping("/all")
    public List<Sponsor> getAllSponsors() { return sponsorservice.getAllSponsors(); }

    @PostMapping("/addSponsor")
    public void addSponsor( @RequestBody Sponsor sponsor) { sponsorservice.addSponsor(sponsor); }

    @PutMapping("/updateSponsor")
    public void updateSponsor( @RequestBody Sponsor sponsor ) { sponsorservice.updateSponsor(sponsor); }

    @DeleteMapping("/deleteSponsor")
    public void deleteSponsor( @RequestBody Sponsor sponsor ) { sponsorservice.deleteSponsor(sponsor); }
}
