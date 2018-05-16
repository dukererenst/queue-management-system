package com.assignment.controllers;

import com.assignment.dto.TokenRequestDTO;
import com.assignment.enums.CustomerType;
import com.assignment.model.Customer;
import com.assignment.model.Token;
import com.assignment.service.CustomerService;
import com.assignment.service.TokenService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TokenController {


    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/token",method = RequestMethod.POST)
    public ResponseEntity generateToken(@RequestBody TokenRequestDTO tokenRequestDTO)throws Exception{
        Token token = tokenService.createTokenAndAssignToQueue(tokenRequestDTO);
        Gson gson = new GsonBuilder().serializeNulls().create();
        return new ResponseEntity(gson.toJson(token), HttpStatus.OK);
    }

}
