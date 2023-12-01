package com.anas.industrialvisit.dao;

import com.anas.industrialvisit.entity.Industry;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:4200")
public interface IndustryRepository extends JpaRepository<Industry, Long> {

   // Page<Industry> findByCategoryId(@Param("id") Long id, Pageable pageable);
    List<Industry> findByCategoryId(@Param("id") Long id);

    Page<Industry> findByNameContaining(@Param("name") String name, Pageable page);
}
