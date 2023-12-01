package com.anas.industrialvisit.dto;

import com.anas.industrialvisit.entity.Industry;

import lombok.Data;

import java.util.List;

@Data
public class IndustraCategoryResponseDto {

    private String categoryName;

    private List<Industry> industries;
}
