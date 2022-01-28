package com.organisation.company.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.organisation.company.Repository.CompanyRepository;
import com.organisation.company.model.CompanyDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;


    @PostMapping("/add")
    public CompanyDetails saveCompany(@RequestBody CompanyDetails company) throws SQLException, IOException{
        if(company==null) return null;    

        company.setcId(companyRepository.findcId());
        company.getOther().setCompId(company.getcId());
        for(int i=0;i<company.getBank().size();i++){
            company.getBank().get(i).setCompId(company.getcId());
        }
        return companyRepository.save(company);
        
    }

    @PostMapping("/update/{id}")
    public List<CompanyDetails> updateCompany(@PathVariable("id") String id, @RequestBody CompanyDetails company){

        CompanyDetails comp = companyRepository.findById(id).get();
        comp.setName(company.getName());
        comp.setAddress(company.getAddress());
        comp.setLocality(company.getLocality());
        comp.setStreet(company.getStreet());
        comp.setCountry(company.getCountry());
        comp.setState(company.getState());
        comp.setCity(company.getCity());
        comp.setPinCode(company.getPinCode());
        comp.setRegistrationType(company.getRegistrationType());
        comp.setOrganisationType(company.getOrganisationType());
        comp.setContactNo1(company.getContactNo1());
        comp.setContactNo2(company.getContactNo2());
        comp.setFax(company.getFax());
        comp.setEmail(company.getEmail());
        comp.setWebsite(company.getWebsite());
        comp.setCompanyINR(company.getCompanyINR());

        companyRepository.save(comp);

        return companyRepository.findAll();
    }

    @GetMapping("/all")
    public List<CompanyDetails>  getAll(){
        return companyRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public CompanyDetails getCompanyById(@PathVariable("id") String id){
        
        return null;
    }
}
