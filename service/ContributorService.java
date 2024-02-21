package org.springframework.boot.BenchWorktRecords.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.BenchWorktRecords.entity.Contributor;
import org.springframework.boot.BenchWorktRecords.repository.ContributoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContributorService {
    @Autowired
    public ContributoRepo contributorRepo;
    public List<Contributor> getAllContributor(){
//        List<Contributor> contributor=new ArrayList<>();
//        contributorRepo.findAll().forEach(contributor::add);
        return contributorRepo.findAll();
    }

    public void addContributor(Contributor contributor) {
        contributorRepo.save(contributor);


    }
    public void updateContributor(Contributor contributor) {
        contributorRepo.save(contributor);

    }
    public void deleteContributor(int id) {
        contributorRepo.deleteById(id);

    }
}
