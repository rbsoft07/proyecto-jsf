package com.rbsoft.projectjsf.repositoy;

import java.util.List;

public interface IEmpeladoRepository <T>{
	
	List<T> findAll();
    T getById(Long id);
    void save(T t);
    void delete (Long id);

}
