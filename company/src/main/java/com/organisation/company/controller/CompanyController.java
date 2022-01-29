package com.organisation.company.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

import com.organisation.company.Repository.BankRepository;
import com.organisation.company.Repository.CompanyRepository;
import com.organisation.company.model.BankDetails;
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
    @Autowired
    private BankRepository bankRepository;


    @PostMapping("/add")
    public CompanyDetails saveCompany(@RequestBody CompanyDetails company) throws SQLException, IOException{
        if(company==null) return null;    

        byte [] data = Base64.getDecoder().decode(company.getPicture());
        OutputStream os = new FileOutputStream(new File("C:\\Users\\DELL\\Documents\\Spring-Projects\\company\\src\\main\\resources\\static\\Images\\"+company.getName()+".jpeg"));
        os.write(data);
        os.close();
        System.out.println(data);

        company.setCompanyId(companyRepository.findCompanyId());
        company.setPicture(company.getName()+".jpeg");

        if(!company.getBank().isEmpty()){
            for(int i=0;i<company.getBank().size();i++){
                company.getBank().get(i).setCompId(company.getCompanyId());
                company.getBank().get(i).setBankId(companyRepository.findbankId());
                company.getBank().get(i).setCreateDate(java.time.LocalDate.now());
            }
        }
        return companyRepository.save(company);
        
    }

    @PostMapping("/update/{compId}/{bankId}")
    public List<CompanyDetails> updateCompany(@PathVariable("compId") String cid,@PathVariable("bankId") String bid, @RequestBody CompanyDetails company){

        System.out.println(cid+" "+bid);
        CompanyDetails comp=null;

        if(cid!=null)comp = companyRepository.findById(cid).get();


        if(company.getName()!=null)comp.setName(company.getName());

        if(company.getAddress()!=null)comp.setAddress(company.getAddress());

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
            if(company.getPanNo()!=null)comp.setPanNo(company.getPanNo());
            comp.setBin(company.getBin());
            comp.setCstNo(company.getCstNo());
            comp.setGstNo(company.getGstNo());
            comp.setIecCode(company.getIecCode());
            comp.setReg_cin(company.getReg_cin());
            comp.setOtherTax(company.getOtherTax());
            comp.setTinNo(company.getTinNo());
            comp.setSelfSealNo(company.getSelfSealNo());
            if(bid!=null){
                BankDetails details = bankRepository.findBybankId(bid);
                details.setName(company.getBank().get(0).getName());
                details.setBranch(company.getBank().get(0).getBranch());
                details.setAddress(company.getBank().get(0).getAddress());
                details.setIfsc(company.getBank().get(0).getIfsc());
                details.setAccountNo(company.getBank().get(0).getAccountNo());
                details.setSwiftCode(company.getBank().get(0).getSwiftCode());
                details.setUpdateDate(java.time.LocalDate.now());
                bankRepository.save(details);
            }
        companyRepository.save(comp);

        return companyRepository.findAll();
    }

    @GetMapping("/all")
    public List<CompanyDetails>  getAll(){
        return companyRepository.findAll();
    }

    @GetMapping("/get/{id}")
    public CompanyDetails getCompanyById(@PathVariable("id") String id){
        return companyRepository.findById(id).get();
    }
}
