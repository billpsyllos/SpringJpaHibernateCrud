package com.rest.repository;

import com.rest.model.Wod;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by billaros on 9/10/2016.
 */
public interface WodRepository extends CrudRepository<Wod,Long> {
    Wod getWodById(Long id);
}
