package com.anas.industrialvisit.dao;

import com.anas.industrialvisit.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<Register, Long> {
}
