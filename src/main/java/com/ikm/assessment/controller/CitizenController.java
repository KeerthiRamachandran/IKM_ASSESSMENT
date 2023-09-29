package com.ikm.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ikm.assessment.contract.CitizenDTO;
import com.ikm.assessment.model.Citizen;
import com.ikm.assessment.service.CitizenService;

import jakarta.validation.Valid;

@RequestMapping("/citizen")
@RestController
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @PostMapping("/create")
    public ResponseEntity<?> createNewEmployee(@RequestBody @Valid CitizenDTO citizenDTO)
    {
        Citizen response=citizenService.createCitizen(citizenDTO);

        //return ResponseEntity.status(HttpStatus.CREATED).body(response);
        return new ResponseEntity<>(response.getId(), HttpStatus.CREATED);
        
        
    }
}
