package org.springframework.boot.BenchWorktRecords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.BenchWorktRecords.entity.Contributor;
import org.springframework.boot.BenchWorktRecords.service.ContributorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContributorController {

    @Autowired
    ContributorService contributorservice;


    @GetMapping("/contributor")
    public List<Contributor> getAllContributor()
    {
        return contributorservice.getAllContributor();
    }

    @PostMapping("/contributor")
    public void addContributor(@RequestBody Contributor contributor)
    {
        contributorservice.addContributor(contributor);
    }


    @PutMapping("/contributor/{id}")
    public void addContributor(@PathVariable int id, @RequestBody Contributor contributor)
    {
        contributorservice.updateContributor(contributor);
    }
    @DeleteMapping("/contibutor/{id}")
    public void deleteContributor(@PathVariable int id)
    {
        contributorservice.deleteContributor(id);
    }

}
