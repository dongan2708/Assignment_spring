package com.example.assignment.service;

import com.example.assignment.entity.Street;

import java.util.List;

public interface StreetService {
    List<Street> getAll();
    Street findById(int id);
    Street update(int id, Street street);
    List<Street> findByName(String name);
    Street create(Street street);
    List<Street> findByDistrict_id(int id);
}
