package com.vijay.online_examination_system.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vijay.online_examination_system.model.Result;

@Repository
public interface ResultRepository extends CrudRepository<Result, Integer> {

	  public List<Result> findByEmailEmail(String email );
}
