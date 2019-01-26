package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.packt.cardatabase.entity.Car;

public interface CarRepository extends CrudRepository<Car, Long> {
	List<Car> findByColor (@Param("color")String color);

}
