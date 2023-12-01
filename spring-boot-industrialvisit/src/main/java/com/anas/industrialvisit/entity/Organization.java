package com.anas.industrialvisit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table
@ToString
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organization_seq_gen")
    @SequenceGenerator(name = "organization_seq_gen" , sequenceName = "org_seq")
    private Long id;

    private String name;

    @OneToMany( mappedBy = "organization", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonManagedReference
   // @JsonIgnore
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
        for (Employee emp:employees ){
            emp.setOrganization(this);
        }

    }
}
