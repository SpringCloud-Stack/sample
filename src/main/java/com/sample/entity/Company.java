package com.sample.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "company_master")
public class Company {

    @Id
    @Column(name = "company_id")
    int companyId;

    @Column(name = "company_name")
    String companyName;

    @Column(name = "location")
    String location;


    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
