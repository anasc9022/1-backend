package com.anas.industrialvisit.dao;

import com.anas.industrialvisit.entity.VisitorDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorDetailRepository extends JpaRepository <VisitorDetail, Long> {
}
