package com.anas.industrialvisit.controller;

import com.anas.industrialvisit.dto.Detail;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.service.EnquiryService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/enquiry")
public class EnquiryController {

    private EnquiryService enquiryService;

    public EnquiryController(EnquiryService enquiryService) { this.enquiryService = enquiryService;
    }

    @PostMapping("/save")
    public VisitorResponse placeVisitor(@RequestBody Detail detail) {

        VisitorResponse visitorResponse = enquiryService.placeVisitor(detail);

        return visitorResponse;
    }

}
