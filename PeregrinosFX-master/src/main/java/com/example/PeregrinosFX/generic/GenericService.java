package com.example.PeregrinosFX.generic;

import java.util.List;

public interface GenericService<T extends Object> {

	T save(T entity);

    T update(T entity);

    void delete(T entity);

    void delete(Long id);



    T find(Long id);


}
