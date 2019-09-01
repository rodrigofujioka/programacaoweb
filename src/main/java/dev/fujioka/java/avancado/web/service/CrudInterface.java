package dev.fujioka.java.avancado.web.service;


import java.util.List;

public interface CrudInterface<T>  {

    List<T> findAll();
    T save(T entity);
    T findById(long id);
    void delete(T entity);
    void deleteById(long id);
    long count();

}
