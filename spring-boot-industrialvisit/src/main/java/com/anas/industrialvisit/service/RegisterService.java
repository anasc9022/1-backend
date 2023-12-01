package com.anas.industrialvisit.service;

import com.anas.industrialvisit.dto.RegisterDetail;
import com.anas.industrialvisit.dto.VisitorResponse;

public interface RegisterService {

    VisitorResponse placeRegister(RegisterDetail signupDetail);
}
