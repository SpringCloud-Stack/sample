package com.sample;

import com.sample.Repository.CompanyMasterRepo;
import com.sample.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CompanyMasterController {


    @Autowired
    private CompanyMasterRepo companyMasterRepo;

    @RequestMapping("/getCompanies")
    public List<Company> getCompanyDetails(){
        return companyMasterRepo.findAll();
    }

    @RequestMapping("/getCompanyById")
    public String getCompanyDetailsById(@RequestParam("id")int id,@RequestParam(value = "name", required = false) String name){
        Company comapany = companyMasterRepo.findById(id);
        return comapany.getCompanyName();
    }

    @PostMapping(value = "/createCompany")
    public String createCompany(@RequestBody Company company){
        System.out.println("company="+company.getCompanyName());
       return "";
    }

}
