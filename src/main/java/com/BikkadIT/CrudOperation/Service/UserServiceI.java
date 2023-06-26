package com.BikkadIT.CrudOperation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.BikkadIT.CrudOperation.Model.User;


public interface UserServiceI {
	
     public boolean createUser(User u);
     
     public boolean saveAll(List<User> u);
     
    // public User findById(int uid);

     Optional<User> findById(int uid);
     
     public Optional<User> findById1(int uid);
     
     public User updateUser(User u);
     
     public List<User> updateAll(List<User> u);

     public User deleteUser(int uid);
     
     public User deleteAll(User u);

	public List<User> findAllById( List<Integer> uid);     
}
