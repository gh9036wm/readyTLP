package com.packt.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import com.packt.cardatabase.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
