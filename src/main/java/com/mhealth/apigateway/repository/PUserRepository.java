package com.mhealth.apigateway.repository;

import com.mhealth.apigateway.entity.PUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PUserRepository extends JpaRepository<PUser, Integer> {
    PUser findByContactNumber(String username);  // find ny contact number
}
