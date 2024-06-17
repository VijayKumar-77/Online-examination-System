package com.vijay.online_examination_system.Repository;


import com.vijay.online_examination_system.model.User;
import org.springframework.data.repository.CrudRepository;



public interface UserRepository extends CrudRepository<User, String> {
   
	  public User findByEmail(String email);
}


//public interface UserRepository extends JpaRepository<User, Long> {
//    User findByUsername(String username);
//    User findByEmail(String email);
//}
