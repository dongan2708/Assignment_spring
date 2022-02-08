package com.example.assignment.repository;

import com.example.assignment.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreetRepository extends JpaRepository<Street, Integer> {
    List<Street> findAll();

    Street getById(int id);

    Street save(Street exist);

    List<Street> findByName(String name);

    List<Street> findStreetsByDistrict_id(int id);
}
