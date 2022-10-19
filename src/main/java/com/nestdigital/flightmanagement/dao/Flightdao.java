package com.nestdigital.flightmanagement.dao;

import com.nestdigital.flightmanagement.model.Flightmodel;
import org.springframework.data.repository.CrudRepository;

public interface Flightdao extends CrudRepository<Flightmodel,Integer> {
}
