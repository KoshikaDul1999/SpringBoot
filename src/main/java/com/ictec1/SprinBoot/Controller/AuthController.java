package com.ictec1.SprinBoot.Controller;

import com.ictec1.SprinBoot.Entity.Business;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public ResponseEntity<String> add(@RequestBody Business b){
        return ResponseEntity.ok(b.getName() + " | " + b.getAddress() + " | " + b.getPhone());
    }


}
