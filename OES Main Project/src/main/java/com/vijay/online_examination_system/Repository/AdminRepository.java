package com.vijay.online_examination_system.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vijay.online_examination_system.model.Admin;



@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {
 
	    public Admin findByName(String name);
}
