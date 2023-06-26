package com.BikkadIT.CrudOperation.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudOperation.Model.User;
import com.BikkadIT.CrudOperation.Service.UserServiceI;



@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping("/createUser")
	public ResponseEntity<String> createUser( User u){
		boolean createUser = userServiceI.createUser(u);
		
		if(createUser) {
			String msg="user record sucessfully created";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		String msg="user record not created sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		
	}
	@PostMapping("/saveAll")
	public ResponseEntity<String> saveAll(@RequestBody List<User> u){
		boolean saveAll = userServiceI.saveAll(u);
		
		if(saveAll) {
			String msg="user multiple record save";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}else {
			String msg="user multiple record save";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
		}
	}
	@GetMapping("/findById")
	public ResponseEntity<User> findById(@RequestParam int uid){
		Optional<User> id = userServiceI.findById(uid);
		//String msg="get single user record";
		return  new ResponseEntity<User>(HttpStatus.OK);
}
	
	@GetMapping("/findById1")
	public ResponseEntity<User> findById1(@PathParam("uid") int uid){
		Optional<User> findById = userServiceI.findById(uid);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User u){
		User updateUser = userServiceI.updateUser(u);
		return new ResponseEntity<User>(updateUser,HttpStatus.OK);
		
	}
	@PutMapping("/updateAll")
	public List<User> updateAll(@RequestBody List<User>  u){
		List<User> updateAll = userServiceI.updateAll(u);
		return updateAll;
	}
	
	@DeleteMapping("/deleteUser/{uid}")
	public User deleteUser(@PathVariable int uid) {
		User deleteUser = userServiceI.deleteUser(uid);
		return deleteUser;
		
	}
	@DeleteMapping("/deleteAll")
	public User deleteAll() {
	 User deleteAll = userServiceI.deleteAll(null);
		return deleteAll;
		
	}
	public List<User> findAllById(List<Integer> uid){
		List<User> findAllById = userServiceI.findAllById(uid);
		return findAllById;
	}
			
	}