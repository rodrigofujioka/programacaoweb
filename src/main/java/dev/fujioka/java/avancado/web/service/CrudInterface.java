package dev.fujioka.java.avancado.web.service;


import java.util.List;
import java.util.Optional;

public interface CrudInterface<T>  {

    List<T> findAll();
    Optional<T> save(T entity);
    Optional<T> findById(long id);
    void delete(T entity);
    void deleteById(long id);
    long count();

}
