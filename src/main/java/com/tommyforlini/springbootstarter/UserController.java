package com.tommyforlini.springbootstarter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUsers() {
        List<String> users = new ArrayList<String>();
        users.add("John");
        users.add("Frank");
        users.add("Peter");
        return new ResponseEntity<List<String>>(users, HttpStatus.OK);
    }

}
