package com.vintago.repository;

import com.vintago.entity.Metododepago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface MetododepagoRepository extends CrudRepository<Metododepago, Integer>, Repository<Metododepago, Integer> {

}
