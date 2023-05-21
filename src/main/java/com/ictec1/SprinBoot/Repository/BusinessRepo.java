package com.ictec1.SprinBoot.Repository;

import com.ictec1.SprinBoot.Entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepo extends JpaRepository<Business, Long> {
}
