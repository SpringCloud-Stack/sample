package com.sample.Repository;

import com.sample.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyMasterRepo extends JpaRepository<Company,Integer> {
    Company findById(int id);
}
