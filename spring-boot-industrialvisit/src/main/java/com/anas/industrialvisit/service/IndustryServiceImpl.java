package com.anas.industrialvisit.service;

import com.anas.industrialvisit.dao.IndustrialCategoryRepository;
import com.anas.industrialvisit.dao.IndustryRepository;
import com.anas.industrialvisit.dao.VisitorDetailRepository;
import com.anas.industrialvisit.dto.Detail;
import com.anas.industrialvisit.dto.IndustrialCategoryDto;
import com.anas.industrialvisit.dto.VisitorResponse;
import com.anas.industrialvisit.entity.IndustrialCategory;
import com.anas.industrialvisit.entity.Industry;
import com.anas.industrialvisit.entity.VisitorDetail;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustryServiceImpl implements IndustryService{
    @Autowired
    IndustryRepository industryRepository;
    private IndustrialCategoryRepository IndustrialCategoryRepository;

    @Autowired
    public IndustryServiceImpl(IndustrialCategoryRepository IndustrialCategoryRepository) {
        this.IndustrialCategoryRepository = IndustrialCategoryRepository;
    }

    @Override
    public List<IndustrialCategory> getAll() {
        return IndustrialCategoryRepository.findAll();
    }

//    @Override
//    public IndustrialCategory placeIndustry(IndustrialCategory industrialCategory) {
//        return IndustrialCategoryRepository.save(industrialCategory);
//    }

    @Override
    public List<Industry> getIndustriesByCategoryId(Long id) {
        return (List<Industry>) industryRepository.findByCategoryId(id);
    }
    @Transactional
    @Override
    public Industry saveIndustry(Industry ind) {
        Industry indus = new Industry();
        indus.setCategory(ind.getCategory());
        indus.setName(ind.getName());
        indus.setDescription(ind.getDescription());
        indus.setImageUrl(ind.getImageUrl());
        indus.setAddress(ind.getAddress());
        indus.setEmail(ind.getEmail());
        indus.setOfficeNumber(ind.getOfficeNumber());
        industryRepository.save(indus);

        return indus;
              //  industryRepository.save(indus);
    }

//    @Override
//    public Object placeIndustry(AddCategory addCategory) {
//        return null;
//    }
}
