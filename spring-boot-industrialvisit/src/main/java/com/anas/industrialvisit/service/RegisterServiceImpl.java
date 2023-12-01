package com.anas.industrialvisit.service;

import com.anas.industrialvisit.dao.RegisterRepository;
import com.anas.industrialvisit.dto.RegisterDetail;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.entity.Register;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService{

    private RegisterRepository registerRepository;

    @Autowired
    public RegisterServiceImpl(RegisterRepository registerRepository) {

        this.registerRepository = registerRepository;
    }

    @Override
    @Transactional
    public VisitorResponse placeRegister(RegisterDetail details) {

        //retrieve the user info from dto

        //generate customer number

        // save to database
        Register register = details.getRegisterDetails();
        registerRepository.save(register);

        return null;
    }
}
