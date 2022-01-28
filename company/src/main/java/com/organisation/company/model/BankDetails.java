package com.organisation.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String compId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String branch;
    @Column(nullable = false)
    private String ifsc;
    @Column(nullable = false)
    private long accountNo;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String swiftCode;

    public BankDetails() {
    }
    public BankDetails(int id, String compId, String name, String branch, String ifsc, long accountNo, String address,
            String swiftCode) {
        this.id = id;
        this.compId = compId;
        this.name = name;
        this.branch = branch;
        this.ifsc = ifsc;
        this.accountNo = accountNo;
        this.address = address;
        this.swiftCode = swiftCode;
    }
    public String getCompId() {
        return compId;
    }
    public void setCompId(String compId) {
        this.compId = compId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getIfsc() {
        return ifsc;
    }
    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }
    public long getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSwiftCode() {
        return swiftCode;
    }
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    

}
