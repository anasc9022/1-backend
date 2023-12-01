package com.anas.industrialvisit.service;

//import com.anas.industrialvisit.dto.AddCategory;
import com.anas.industrialvisit.dto.Detail;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.entity.IndustrialCategory;
import com.anas.industrialvisit.entity.Industry;

import java.util.List;

public interface IndustryService {

//    VisitorResponse placeIndustry(Detail detail);

    List<IndustrialCategory> getAll();

   // IndustrialCategory placeIndustry(IndustrialCategory industrialCategory);

    List<Industry> getIndustriesByCategoryId(Long id);

    Industry saveIndustry(Industry ind);

    //  Object placeIndustry(AddCategory addCategory);
}
