package com.ictec1.SprinBoot.Controller;

import com.ictec1.SprinBoot.Entity.Address;
import com.ictec1.SprinBoot.Entity.Business;
import com.ictec1.SprinBoot.Entity.Location;
import com.ictec1.SprinBoot.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BusinessApi {

    @Autowired
    private BusinessRepo repo;

    @GetMapping("/showBusiness")
    public ResponseEntity<Business> showBusiness(){
        Business b = new Business();
        b.setName("Koshika");
        b.setPhone("0765452486");

        Address a = new Address();
        a.setLine_one("254/A");
        a.setLine_two("Robert Gunawardhane Rd");
        a.setState("Western");
        a.setCity("Battaramulla");
        a.setCountry("Sri Lanka");

        b.setAddress(a);

        Location l = new Location();
        l.setLat("2.254658");
        l.setLon("3.654235");

        b.setLocation(l);

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(b);
    }

    @PostMapping("/business")
    public ResponseEntity<Business> saveButton(@RequestBody Business b){
        return ResponseEntity.ok().body(b);
    }
}
