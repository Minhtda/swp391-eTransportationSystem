package com.etransportation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etransportation.model.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
