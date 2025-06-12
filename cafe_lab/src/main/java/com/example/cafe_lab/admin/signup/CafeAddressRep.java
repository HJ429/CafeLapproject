package com.example.cafe_lab.admin.signup;

import com.example.cafe_lab.admin.CafeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CafeAddressRep extends JpaRepository<CafeAddress, Long> {
}
