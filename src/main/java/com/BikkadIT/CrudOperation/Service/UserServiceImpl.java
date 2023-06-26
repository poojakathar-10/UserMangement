package com.BikkadIT.CrudOperation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.BikkadIT.CrudOperation.Model.User;
import com.BikkadIT.CrudOperation.respository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean createUser(User u) {
	User save = userRepository.save(u);
	if(save!=null) {
		return true;
	}else {
	
		return false;
	}
}

	@Override
	public boolean saveAll(List<User> u) {
	List<User> saveAll = userRepository.saveAll(u);
	if(saveAll!=null) {
		return true;
		}
	else {
		return false;
	}
}

	@Override
	public Optional<User> findById(int uid) {
    Optional<User> id= userRepository.findById(uid);
		return id;
	}

	@Override
	public  Optional<User> findById1(int uid) {
		Optional<User> findById = userRepository.findById(uid);
		return findById;
	}
	

	@Override
	public User updateUser(User u) {
		User updateuser= ((UserServiceImpl) userRepository).updateUser(u);
		return updateuser;
	}

	@Override
	public List<User> updateAll(List<User> u) {
     List<User> updateAll = ((UserServiceImpl) userRepository).updateAll(u);
     return updateAll;
	}

	@Override
	public User deleteUser( int uid) {
    userRepository.deleteById(uid);
    return null;
	}

	@Override
	public User deleteAll(User u) {
	 userRepository.deleteAll();
		return null;
	}

	@Override
	public List<User> findAllById(List<Integer> uid) {
		List<User> findAllById = userRepository.findAllById(uid);

		return findAllById ;
	}
	
	

	
	
	}
