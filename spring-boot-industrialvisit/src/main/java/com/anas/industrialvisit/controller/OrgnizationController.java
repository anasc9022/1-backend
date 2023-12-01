package com.anas.industrialvisit.controller;

import com.anas.industrialvisit.dao.OrganizationRepository;
import com.anas.industrialvisit.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrgnizationController {
    @Autowired
    private OrganizationRepository organizationRepository;

    @GetMapping("/get_organization")
    public List<Organization> getAllOrg(){
        return organizationRepository.findAll();

    }
    @PostMapping("/add_organization")
    public ResponseEntity<Organization> addlOrg(@RequestBody Organization org){

        return new ResponseEntity<>(organizationRepository.save(org), HttpStatus.CREATED);
    }
}
