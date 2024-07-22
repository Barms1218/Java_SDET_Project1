package com.patriotfurniture.patriot_furniture_warehouse.repositories;

import org.springframework.data.repository.CrudRepository;

import com.patriotfurniture.patriot_furniture_warehouse.models.Furniture;

public interface FurnitureRepository extends CrudRepository<Furniture, Long> {

}
