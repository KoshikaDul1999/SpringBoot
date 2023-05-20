package com.ictec.SpringBoot.Controllers;

import com.ictec.SpringBoot.httpEntities.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    @RequestMapping(method = RequestMethod.POST, path = "/lang/{language}/login")
    public ResponseEntity<String> doLogin(@PathVariable String language, @RequestBody LoginRequest l){

        if (l.getEmail().equals("a@gmail.com") && l.getPassword().equals("123")){
            return ResponseEntity.ok("{}");
        }
        return ResponseEntity.status(401).body("{}");


    }

}
