package com.anas.industrialvisit.service;

import com.anas.industrialvisit.dto.Detail;
import com.anas.industrialvisit.dto.VisitorResponse;

public interface EnquiryService {

    VisitorResponse placeVisitor(Detail userDetail);
}
