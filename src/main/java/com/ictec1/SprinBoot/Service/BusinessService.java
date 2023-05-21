package com.ictec1.SprinBoot.Service;

import com.ictec1.SprinBoot.Entity.Business;
import com.ictec1.SprinBoot.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    @Autowired
    private BusinessRepo repo;
    public Business handleRegistration(Business b){
        //Save
        //Email
        //Profile images upload
        //Project table update
        return this.repo.save(b);
    }
}
