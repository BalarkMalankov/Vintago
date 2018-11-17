package com.vintago.service;

import com.vintago.entity.Adminn;

import java.util.List;
import java.util.Optional;

public interface IAdminnService {
    List<Adminn> findByUsername(String username);

    Iterable<Adminn> findAll();
    Optional<Adminn> findById(int id);
    void delete(Adminn adminn);
    void deleteById(int id);
    boolean existsById(int id);
    Adminn save(Adminn adminn);
    Iterable<Adminn> saveAll(Iterable<Adminn> admn);

}
