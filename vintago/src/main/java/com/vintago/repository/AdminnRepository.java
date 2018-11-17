package com.vintago.repository;

import com.vintago.entity.Adminn;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AdminnRepository extends CrudRepository<Adminn, Integer>, Repository<Adminn, Integer> {

    List<Adminn> findByUsername(String username);

}