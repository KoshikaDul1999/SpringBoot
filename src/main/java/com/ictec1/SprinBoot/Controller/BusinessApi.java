package com.ictec1.SprinBoot.Controller;

import com.ictec1.SprinBoot.Entity.Address;
import com.ictec1.SprinBoot.Entity.Business;
import com.ictec1.SprinBoot.Entity.Location;
import com.ictec1.SprinBoot.Repository.BusinessRepo;
import com.ictec1.SprinBoot.Service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class BusinessApi {

    @Autowired
    private BusinessRepo repo;

    @Autowired
    private BusinessService businessService;

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
    public ResponseEntity<Business> saveBusiness(@RequestBody Business b){
        b = this.businessService.handleRegistration(b);
        return ResponseEntity.ok().body(b);
    }

    @GetMapping("/business")
    public ResponseEntity<List<Business>>getAllBusiness(){
        List<Business> all = repo.findAll();
        return ResponseEntity.ok().body(all);
    }

    @GetMapping("/business/{id}")
    public ResponseEntity<Optional<Business>>saveIdBusiness(@PathVariable Long id){
        Optional<Business> b = this.repo.findById(id);
        return ResponseEntity.ok().body(b);
    }

    @DeleteMapping("/business/{id}")
    public ResponseEntity deleteBusiness(@PathVariable Long id){
        if (this.repo.existsById(id)){
            this.repo.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(400).build();
    }

    @GetMapping("/business/name/{end}")
    public ResponseEntity<List<Business>> findNameBusiness(@PathVariable String end) {
        List<Business> businessesWithEnd = repo.findByNameEndsWith(end);
        return ResponseEntity.ok().body(businessesWithEnd);
    }

}
