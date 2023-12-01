package com.anas.industrialvisit.dto;

import com.anas.industrialvisit.entity.IndustrialCategory;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndustrialCategoryDto {

    private String name;

    private String description;

    private String imageUrl;

    private String address;

    private String email;

    private String officeNumber;

}
