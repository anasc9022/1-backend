package com.anas.industrialvisit.service;

import com.anas.industrialvisit.dao.VisitorDetailRepository;
import com.anas.industrialvisit.dto.Detail;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.entity.VisitorDetail;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements EnquiryService{

    private VisitorDetailRepository VisitorDetailRepository;

    @Autowired
    public EnquiryServiceImpl(VisitorDetailRepository VisitorDetailRepository) {
        this.VisitorDetailRepository = VisitorDetailRepository;
    }

    @Override
    @Transactional
    public VisitorResponse placeVisitor(Detail details) {

        //retrieve the user info from dto

        //generate customer number

        // save to database
        VisitorDetail visitorDetail = details.getVisitorDetails();
        VisitorDetailRepository.save(visitorDetail);

        return null;
    }
}
