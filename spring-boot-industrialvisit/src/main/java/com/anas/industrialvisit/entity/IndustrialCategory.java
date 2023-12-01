package com.anas.industrialvisit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="industrial_category")
@Getter
@Setter
public class IndustrialCategory  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category", fetch=FetchType.LAZY, cascade = CascadeType.ALL )
    //@JsonManagedReference
    private List<Industry> industries;

    public void setIndustries(List<Industry> industries) {
        this.industries = industries;
        for(Industry ind:industries){
            ind.setCategory(this);
        }

    }
}
