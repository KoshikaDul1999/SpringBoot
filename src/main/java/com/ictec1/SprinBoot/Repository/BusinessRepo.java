package com.ictec1.SprinBoot.Repository;

import com.ictec1.SprinBoot.Entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BusinessRepo extends JpaRepository<Business, Long> {
    @Query("SELECT b FROM Business b WHERE b.name LIKE %:end")
    List<Business> findByNameEndsWith(@Param("end") String end);
}
