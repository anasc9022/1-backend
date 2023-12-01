package com.anas.industrialvisit.dao;

import com.anas.industrialvisit.entity.IndustrialCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "industrialCategory", path = "industrial-category")
public interface IndustrialCategoryRepository extends JpaRepository<IndustrialCategory, Long> {
//    @Query("select * from IndustrialCategory i join i.industries in")
//    public List<IndustrialCategory> getAllCategory();
}
