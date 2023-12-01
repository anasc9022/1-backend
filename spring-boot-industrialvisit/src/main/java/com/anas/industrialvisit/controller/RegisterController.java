package com.anas.industrialvisit.controller;

import com.anas.industrialvisit.dto.RegisterDetail;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.service.RegisterService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/register")
public class RegisterController {

    private RegisterService registerService;

    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping("/save")
    public VisitorResponse placeRegister(@RequestBody RegisterDetail detail) {

        VisitorResponse visitorResponse = registerService.placeRegister(detail);

        return visitorResponse;
    }
}
