package com.organisation.company.Repository;


import com.organisation.company.model.CompanyDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CompanyRepository extends JpaRepository<CompanyDetails, String> {
    
    @Query(value="select concat('COMP',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(company_id,5,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(company_id, 5, 15)) as int)),0)+1) from Company_details" , nativeQuery = true)
    public String findCompanyId();

    @Query(value="select concat('BANK',REPLICATE(0,4-len(isNull(max(cast(convert(varchar,substring(bank_id,5,15))as int)),1)+1)),isNull(max(cast(convert(varchar, substring(bank_id, 5, 15)) as int)),0)+1) from Bank_details" , nativeQuery = true)
    public String findbankId();
}
