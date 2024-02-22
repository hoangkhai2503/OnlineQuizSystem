package com.manager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.manager.entities.EnumList;

@Repository
public interface EnumListRepository extends CrudRepository<EnumList, Integer>{

}