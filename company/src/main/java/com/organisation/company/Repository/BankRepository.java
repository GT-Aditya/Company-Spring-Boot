package com.organisation.company.Repository;

import com.organisation.company.model.BankDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankDetails, String>{
    public BankDetails findBybankId(String id);
}
