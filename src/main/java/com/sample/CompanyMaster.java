package com.sample;

import com.sample.Repository.CompanyMasterRepo;
import com.sample.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompanyMaster {


    @Autowired
    private CompanyMasterRepo companyMasterRepo;

    @RequestMapping("/getCompanies")
    public List<Company> getCompanyDetails(){
        return companyMasterRepo.findAll();
    }

    @RequestMapping("/getCompanyById")
    public Company getCompanyDetailsById(@RequestParam("id")int id,@RequestParam(value = "name", required = false) String name){

        Company comapany = companyMasterRepo.findById(id);

        return comapany;
    }



}
