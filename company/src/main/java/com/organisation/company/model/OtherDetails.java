package com.organisation.company.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class OtherDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String compId;
    private String bin;
    private String cstNo;
    @Column(nullable = false)
    private String panNo;
    private String iecCode;
    private String selfSealNo;
    private String gstNo;
    private String reg_cin;
    private String otherTax;
    private String tinNo;

    public OtherDetails(){
        super();
    }

    @Override
    public String toString() {
        return "OtherDetails [bin=" + bin + ", cstNo=" + cstNo + ", gstNo=" + gstNo + ", id=" + id + ", iecCode="
                + iecCode + ", otherTax=" + otherTax + ", panNo=" + panNo + ", reg_cin=" + reg_cin + ", selfSealNo="
                + selfSealNo + ", tinNo=" + tinNo + "]";
    }
    public OtherDetails(int id, String bin,String compId, String cstNo, String panNo, String iecCode, String selfSealNo, String gstNo,
            String reg_cin, String otherTax, String tinNo) {
        this.id = id;
        this.bin = bin;
        this.compId = compId;
        this.cstNo = cstNo;
        this.panNo = panNo;
        this.iecCode = iecCode;
        this.selfSealNo = selfSealNo;
        this.gstNo = gstNo;
        this.reg_cin = reg_cin;
        this.otherTax = otherTax;
        this.tinNo = tinNo;
    }
    
    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBin() {
        return bin;
    }
    public void setBin(String bin) {
        this.bin = bin;
    }
    public String getCstNo() {
        return cstNo;
    }
    public void setCstNo(String cstNo) {
        this.cstNo = cstNo;
    }
    public String getPanNo() {
        return panNo;
    }
    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }
    public String getIecCode() {
        return iecCode;
    }
    public void setIecCode(String iecCode) {
        this.iecCode = iecCode;
    }
    public String getSelfSealNo() {
        return selfSealNo;
    }
    public void setSelfSealNo(String selfSealNo) {
        this.selfSealNo = selfSealNo;
    }
    public String getGstNo() {
        return gstNo;
    }
    public void setGstNo(String gstNo) {
        this.gstNo = gstNo;
    }
    public String getReg_cin() {
        return reg_cin;
    }
    public void setReg_cin(String reg_cin) {
        this.reg_cin = reg_cin;
    }
    public String getOtherTax() {
        return otherTax;
    }
    public void setOtherTax(String otherTax) {
        this.otherTax = otherTax;
    }
    public String getTinNo() {
        return tinNo;
    }
    public void setTinNo(String tinNo) {
        this.tinNo = tinNo;
    }

    
}
