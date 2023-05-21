package com.ictec1.SprinBoot.Controller;

import com.ictec1.SprinBoot.Entity.Business;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class BusinessApi {
    @GetMapping("/showBusiness")
    public ResponseEntity<Business> showBusiness(){

    }

    @PostMapping("/business")
    public ResponseEntity<Business> saveButton(@RequestBody Business b){
        return ResponseEntity.ok().body(b);
    }
}
