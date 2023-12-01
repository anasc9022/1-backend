package com.anas.industrialvisit.dto;

import com.anas.industrialvisit.entity.IndustrialCategory;
import com.anas.industrialvisit.entity.Register;
import com.anas.industrialvisit.entity.VisitorDetail;
import lombok.Data;

@Data
public class Detail {

    private VisitorDetail visitorDetails;

    private IndustrialCategory industryDetails;
}
